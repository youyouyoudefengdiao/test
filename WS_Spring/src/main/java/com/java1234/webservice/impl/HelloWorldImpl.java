package com.java1234.webservice.impl;

import javax.jws.WebService;


import org.springframework.stereotype.Component;
import com.java1234.webservice.HelloWorld;
@Component("helloWorld")
@WebService
public class HelloWorldImpl implements HelloWorld{

	public String say(String str) {
		return "Hello"+str;
	}

}
