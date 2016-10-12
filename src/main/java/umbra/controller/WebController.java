package umbra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class WebController extends WebMvcConfigurerAdapter {

	/*-----------Home, Register, Login--------------*/
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	ModelAndView getHome() {
		ModelAndView modelAndView = new ModelAndView("main");
		return modelAndView;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	ModelAndView getLogin() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	ModelAndView getRegister() {
		ModelAndView modelAndView = new ModelAndView("register");
		return modelAndView;
	}
	
	/*------------------------------------------------*/
	
	/*-------------------Companies--------------------*/
	@RequestMapping(value = "/industries", method = RequestMethod.GET)
	ModelAndView getCompanies() {
		ModelAndView modelAndView = new ModelAndView("companies");
		return modelAndView;
	}
	@RequestMapping(value = "/industries/tax", method = RequestMethod.GET)
	ModelAndView getCompaniesTaxes() {
		ModelAndView modelAndView = new ModelAndView("companies-taxes");
		return modelAndView;
	}
	@RequestMapping(value = "/industries/consulting", method = RequestMethod.GET)
	ModelAndView getCompaniesConsulting() {
		ModelAndView modelAndView = new ModelAndView("companies-consulting");
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