package com.wei.s2s.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wei.s2s.service.BusinessService;


public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		
		BusinessService s1 = (BusinessService) ac.getBean("businessService");
		s1.save();
	}

}
