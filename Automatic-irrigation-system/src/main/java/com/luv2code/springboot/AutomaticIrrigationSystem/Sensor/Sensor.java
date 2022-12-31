package com.luv2code.springboot.AutomaticIrrigationSystem.Sensor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.luv2code.springboot.AutomaticIrrigationSystem.CustomExceptions.Resourcenotfoundexception;
import com.luv2code.springboot.AutomaticIrrigationSystem.Service.PlotService;

@Component
public class Sensor {

	
	
   private PlotService service;
	
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
	private final static Logger logger = LoggerFactory.getLogger(Sensor.class);
	
	
	

	@Autowired
	public Sensor(PlotService service) {
		super();
		this.service = service;
		
	}
	
	@Scheduled(fixedDelay=5000)
	public void get() {
	
		if(sensorExist()) {
			
			
				logger.info( "\n these plots \n" + service.getPlots() + "\n need to be irrigated at this time " + 
						formatter.format(LocalDateTime.now()) + " and The irrigation Will start soon" );
				logger.info("The duration Of Irrigation is 5 seconds and Plots are being irrigated ");
						
				try {
					
					Thread.sleep(5000);
					logger.info("\n Irrigation is ended at " + formatter.format(LocalDateTime.now()));
					
					
					
				}catch(Exception ex) {
					
				}
			
			
			
			   } else {
			
			throw new RuntimeException("The sensor is not available");
		}
		
		
		
		
		
	}
	
	
	
	public boolean sensorExist() {
		return true;
	}
	
}
