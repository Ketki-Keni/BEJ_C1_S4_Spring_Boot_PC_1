package com.jap.demo.BEJ_C1_S4_Spring_Boot_PC_1;

import Service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BejC1S4SpringBootPc1Application {

	public static void main(String[] args) {
		SpringApplication.run(BejC1S4SpringBootPc1Application.class, args);

		ApplicationContext context=SpringApplication.run(BejC1S4SpringBootPc1Application.class,args);

		MessageService businessLogicService=context.getBean("myService",MessageService.class);

		System.out.println(businessLogicService.fuction());

		System.out.println("Good day to you");
	}

}
