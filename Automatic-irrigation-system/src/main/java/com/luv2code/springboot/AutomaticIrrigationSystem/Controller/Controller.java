package com.luv2code.springboot.AutomaticIrrigationSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.AutomaticIrrigationSystem.Entity.PlotOfLand;
import com.luv2code.springboot.AutomaticIrrigationSystem.Service.PlotService;

@RestController
@RequestMapping("/api")
public class Controller {

	private PlotService service;


	@Autowired
	public Controller(PlotService service) {
		super();
		this.service = service;
	}
	
	
	@PostMapping("/plots/save")
	public ResponseEntity<PlotOfLand> create(@RequestBody PlotOfLand plot){
		
		return new ResponseEntity<>(service.savePlot(plot) , HttpStatus.CREATED);
	}
	
	@GetMapping("/plots")
	public List<PlotOfLand> getPlots(){
		
		return service.getPlots();
	}
	
	
	@GetMapping("/plots/{id}")
	public ResponseEntity<PlotOfLand> getById(@PathVariable(name="id") Long id){
		
		return  ResponseEntity.ok(service.getPlotById(id));
	}
	
	@PutMapping("/plots/update/{id}")
	public ResponseEntity<PlotOfLand> update(@RequestBody PlotOfLand plot , @PathVariable(name="id") Long id){
		
		PlotOfLand plot1 = service.edit(plot, id);
		
		return new ResponseEntity<>(plot1,HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/plots/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable(name="id") Long id){
		
		service.deleteById(id);
		
		return new ResponseEntity<>("Plot Of Land Deleted Sucessfully" , HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
