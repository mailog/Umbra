package umbra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import Users.User;
import Users.TestUser;
import Users.UserJDBCTemplate;
import Security.EncryptMethod;

@Controller
public class WebController extends WebMvcConfigurerAdapter {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	public static UserJDBCTemplate userJDBCTemplate = (UserJDBCTemplate)context.getBean("userJDBCTemplate");
	public static EncryptMethod encrypter = new EncryptMethod();
	
	/*-----------Home, Register, Login--------------*/
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	ModelAndView getTest() {
		return new ModelAndView("test", "user", new User());
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	ModelAndView testSubmit(@ModelAttribute User user){
		ModelAndView modelAndView = new ModelAndView("test-result");
		userJDBCTemplate.create(user.getEmail(), user.getPlainPassword());
		return modelAndView;
	}
	
	/*------------------------------------------------*/

	/*-----------Home, Register, Login--------------*/
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	ModelAndView getLogin() {
		ModelAndView modelAndView = new ModelAndView("login", "user", new User());
		return modelAndView;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	ModelAndView loginSubmit(@ModelAttribute User user) {
		//String email = user.getEmail();
		//String pw = user.getPassword();
		User RUser = userJDBCTemplate.getUser(user.getEmail());
		String check = encrypter.decrypt(RUser.getEncryptedPassword());
		System.out.println(user.getPlainPassword());
		System.out.println(check);
		boolean validity = user.getPlainPassword().equals(check);
		ModelAndView modelAndView = new ModelAndView("login-result", "validity", validity);
		if(validity){
			modelAndView.addObject("user", user);
		}
		
		return modelAndView;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	ModelAndView getRegister() {
		ModelAndView modelAndView = new ModelAndView("register", "user", new User());
		modelAndView.addObject("confirmUser", new TestUser());
		return modelAndView;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	ModelAndView registerSubmit(@ModelAttribute User user, @ModelAttribute TestUser confirmUser) {
		System.out.println(user.getEmail());
		System.out.println(confirmUser.getTestEmail());
		System.out.println(user.getPlainPassword());
		System.out.println(confirmUser.getTestPassword());
		boolean validity = true;
		if(!confirmUser.getTestEmail().equals(user.getEmail()) || !confirmUser.getTestPassword().equals(user.getPlainPassword())){
			validity = false;
		}
		else if(!user.getEmail().contains("@") || !user.getEmail().contains(".")){
			validity = false;
		}
		else if(user.getPlainPassword().length() < 8 || user.getPlainPassword().length() > 50){
			validity = false;
		}
		System.out.println(validity);
		
		ModelAndView modelAndView = new ModelAndView("register-result", "validity", validity);
		modelAndView.addObject("user", user);
		if(validity)
			userJDBCTemplate.create(user.getEmail(), user.getPlainPassword());
		return modelAndView;
	}
	
	/*------------------------------------------------*/
	
	/*-------------------Companies--------------------*/
	@RequestMapping(value = "/industries", method = RequestMethod.GET)
	ModelAndView getCompanies() {
		ModelAndView modelAndView = new ModelAndView("industries");
		return modelAndView;
	}
	@RequestMapping(value = "/industries-tax", method = RequestMethod.GET)
	ModelAndView getCompaniesTaxes() {
		ModelAndView modelAndView = new ModelAndView("industries_taxes");
		return modelAndView;
	}
	@RequestMapping(value = "/industries-consulting", method = RequestMethod.GET)
	ModelAndView getCompaniesConsulting() {
		ModelAndView modelAndView = new ModelAndView("industries_consulting");
		return modelAndView;
	}
	
	/*------------------------------------------------*/
	

	/*---------------------About----------------------*/
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	ModelAndView getAbout() {
		ModelAndView modelAndView = new ModelAndView("about");
		return modelAndView;
	}
	

	/*------------------------------------------------*/
	
	/*----------------------Team----------------------*/
	@RequestMapping(value = "/team", method = RequestMethod.GET)
	ModelAndView getTeam() {
		ModelAndView modelAndView = new ModelAndView("team");
		return modelAndView;
	}
	
	/*------------------------------------------------*/
	
	/*-------------------Contacts---------------------*/
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	ModelAndView getContact() {
		ModelAndView modelAndView = new ModelAndView("contact");
		return modelAndView;
	}

	/*------------------------------------------------*/
	
}