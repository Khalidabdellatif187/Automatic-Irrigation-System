package com.luv2code.springboot.Testirrigationsystem.plotoflandcontroller;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luv2code.springboot.AutomaticIrrigationSystem.Controller.Controller;
import com.luv2code.springboot.AutomaticIrrigationSystem.Entity.PlotOfLand;
import com.luv2code.springboot.AutomaticIrrigationSystem.Service.PlotService;

@WebMvcTest(Controller.class)
public class plotcontrollertest {

	@Autowired
	private MockMvc mockmvc;
	
	
	@Autowired
	private ObjectMapper mapper;
	
	
	@MockBean
	private PlotService service;
	
	
	
	
	@Test
	public void testPlots() throws Exception{
		
		List<PlotOfLand> plots = new ArrayList<>();
		plots.add(new PlotOfLand( "250 m^2" , "100 m^3" , "banana"));
		plots.add(new PlotOfLand( "250 m^2" , "100 m^3" , "onion"));
		plots.add(new PlotOfLand( "250 m^2" , "100 m^3" , "rice"));
		Mockito.when(service.getPlots()).thenReturn(plots);
		
		String url = "/plots" ;
		
		MvcResult result = mockmvc.perform(MockMvcRequestBuilders.get(url)).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		String jsonresponse = result.getResponse().getContentAsString();
		System.out.println(jsonresponse);
		
	}
	
	
	@Test
	public void testSavenewplot() throws Exception {
		PlotOfLand plot = new PlotOfLand("100 m^3" , "250 m^2" , "tomato");
	
		Mockito.when(service.savePlot(plot)).thenReturn(plot);
		String url = "/api/plots/save";
		
		mockmvc.perform(MockMvcRequestBuilders.post(url).contentType("application/json").content(mapper.writeValueAsString(plot)))
		.andExpect(MockMvcResultMatchers.status().isOk());
		
		
		
	}
	
	@Test
	public void testupdateavewplot() throws Exception {
		PlotOfLand existedplot = new PlotOfLand("100 m^3" , "250 m^2" , "tomato");
		PlotOfLand updatedplot = new PlotOfLand("100 m^3" , "250 m^2" , "potato");
	
		Mockito.when(service.savePlot(existedplot)).thenReturn(updatedplot);
		String url = "/api/plots/save";
		
		mockmvc.perform(MockMvcRequestBuilders.post(url).contentType("application/json").content(mapper.writeValueAsString(existedplot)))
		.andExpect(MockMvcResultMatchers.status().isOk());
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
