package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	//Say-hello => "hello what are you larning today?"
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello what are you larning today?";
	}
	
	//say-hello-html
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> MY first html page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My fist html page");
		sb.append("</body>");
		sb.append("</html>");	
		return sb.toString();
	}
	
	//say-hello-jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHellojsp() {
		return "sayHello";// return must be file name of jsp which we want to show
	}
	
}
