package com.luv2code.springboot.AutomaticIrrigationSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.luv2code.springboot.AutomaticIrrigationSystem.Service.PlotService;
import com.luv2code.springboot.AutomaticIrrigationSystem.Service.ServiceImpl;




@SpringBootApplication
@EnableScheduling
public class AutomaticIrrigationSystem extends SpringBootServletInitializer {
	
	
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AutomaticIrrigationSystem.class);
	}
	
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(AutomaticIrrigationSystem.class, args);
		
		
	}

	
}
