package org.jsp.springboot_demo_app.controller;

import org.jsp.springboot_demo_app.dto.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Demo_Controller {
	
	@GetMapping("/hi")
	public String getMsg()
	{
		return "this is my getMsg()";
	}
	
	@PostMapping("/hello")
	public  void postmsg()
	{
		System.out.println("hello from postMsg()");
	}
	
	
	@GetMapping("/demo")
	public Demo getDemo()
	{
		Demo demo=new Demo();
		demo.setId(121);
		demo.setName("shravan");
		return demo;
		
	}
	
	@PostMapping("/savedemo")
	public void saveDemo(@RequestBody   Demo  demo)
	{
		System.out.println(demo.getId());
		System.out.println(demo.getName());
	}

}
