package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController 
{
	
	//http://localhost:8080/say-hello
	//say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String SayHello()
	{
		return "Hello ! What you are learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String SayHelloHtml()
	{
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My first Html page</title>");
		sb.append("<head>");
		sb.append("<body>");
		sb.append("My First Html page with body");
		sb.append("</body>");
		sb.append("</html>");
		
		
		
		return sb.toString();
	}
	
	
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp()
	{
		return "sayHello";
	}

}
