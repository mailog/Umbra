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
	@RequestMapping(value = "/companies", method = RequestMethod.GET)
	ModelAndView getCompanies() {
		ModelAndView modelAndView = new ModelAndView("companies");
		return modelAndView;
	}
	@RequestMapping(value = "/companies/taxes", method = RequestMethod.GET)
	ModelAndView getCompaniesTaxes() {
		ModelAndView modelAndView = new ModelAndView("companies-taxes");
		return modelAndView;
	}
	@RequestMapping(value = "/companies/analytics", method = RequestMethod.GET)
	ModelAndView getCompaniesAnalytics() {
		ModelAndView modelAndView = new ModelAndView("companies-analytics");
		return modelAndView;
	}
	@RequestMapping(value = "/companies/consulting", method = RequestMethod.GET)
	ModelAndView getCompaniesConsulting() {
		ModelAndView modelAndView = new ModelAndView("companies-consulting");
		return modelAndView;
	}
	@RequestMapping(value = "/companies/marketing", method = RequestMethod.GET)
	ModelAndView getCompaniesMarketing() {
		ModelAndView modelAndView = new ModelAndView("companies-marketing");
		return modelAndView;
	}

	/*------------------------------------------------*/
	

	/*---------------------About----------------------*/
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	ModelAndView getAbout() {
		ModelAndView modelAndView = new ModelAndView("about");
		return modelAndView;
	}
	@RequestMapping(value = "/about/taxes", method = RequestMethod.GET)
	ModelAndView getAboutTaxes() {
		ModelAndView modelAndView = new ModelAndView("about-taxes");
		return modelAndView;
	}
	@RequestMapping(value = "/about/analytics", method = RequestMethod.GET)
	ModelAndView getAboutAnalytics() {
		ModelAndView modelAndView = new ModelAndView("about-analytics");
		return modelAndView;
	}
	@RequestMapping(value = "/about/consulting", method = RequestMethod.GET)
	ModelAndView getAboutConsulting() {
		ModelAndView modelAndView = new ModelAndView("about-consulting");
		return modelAndView;
	}
	@RequestMapping(value = "/about/marketing", method = RequestMethod.GET)
	ModelAndView getAboutMarketing() {
		ModelAndView modelAndView = new ModelAndView("about-marketing");
		return modelAndView;
	}

	/*------------------------------------------------*/
	
	/*----------------------Team----------------------*/
	@RequestMapping(value = "/team", method = RequestMethod.GET)
	ModelAndView getTeam() {
		ModelAndView modelAndView = new ModelAndView("team");
		return modelAndView;
	}
	@RequestMapping(value = "/team/taxes", method = RequestMethod.GET)
	ModelAndView getTeamTaxes() {
		ModelAndView modelAndView = new ModelAndView("team-taxes");
		return modelAndView;
	}
	@RequestMapping(value = "/team/analytics", method = RequestMethod.GET)
	ModelAndView getTeamAnalytics() {
		ModelAndView modelAndView = new ModelAndView("team-analytics");
		return modelAndView;
	}
	@RequestMapping(value = "/team/consulting", method = RequestMethod.GET)
	ModelAndView getTeamConsulting() {
		ModelAndView modelAndView = new ModelAndView("team-consulting");
		return modelAndView;
	}
	@RequestMapping(value = "/team/marketing", method = RequestMethod.GET)
	ModelAndView getTeamMarketing() {
		ModelAndView modelAndView = new ModelAndView("team-marketing");
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