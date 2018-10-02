package com.example.firstProject.firstProject;

import com.example.firstProject.firstProject.bean.InformationResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);

//		System.out.println(systemPrint());
	}

//	@RequestMapping("/superman")
//	private static String systemPrint() {
//		return "Hello, World";
//	}
//
//	@RequestMapping("/getName")
//	private static InformationResponse getParams(InformationResponse bean) {
//		setUpName(bean);
//		return bean;
//	}
//
//	private static void setUpName(InformationResponse bean) {
//		bean.setFullName("Chayawat");
//	}
}