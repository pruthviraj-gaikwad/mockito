package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

//	private Logger logger = LoggerFactory.getLogger(getClass());
	// login
	// =>com.in28minutes.springboot.myfirstwebapp.login.LoginController=>login.jsp

	// http://localhost:8080/login?name=pruthvi
	// Model for use name in html
//	@RequestMapping("login")
//	public String gotoLoginPage(@RequestParam String name,ModelMap model) {
//		model.put("name", name);
//		
//		logger.debug("Request param is {}",name);
//		
//		logger.info("i want to print this at info level {}",name);
//		
//		System.out.println("Request param is "+name);
//		return "login";// return must be file name of jsp which we want to show
//	}

//	private AuthenticationService authenticateService = new AuthenticationService();
//
//	public LoginController(AuthenticationService authenticateService) {
//		super();
//		this.authenticateService = authenticateService;
//	}

	// this handaling booth post and get
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		return "welcome";
	}

	private String getLoggedinUsername() {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		return (authentication != null) ? authentication.getName() : "Anonymous";
	}
	// after clicking submit button goto welcome page
	// now we suppose to get handel name and password there for use request param
	//@RequestMapping(value = "login", method = RequestMethod.POST)
//	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
//
//		if (authenticateService.authenticate(name, password)) {
//			model.put("name", name);
//	//model.put("password", password);
//			return "welcome";
//		}
//		model.put("errorMessage", "Invalid Credentials! Please try again");
//		return "login";
//
//	}

}
