package com.luv2code.springboot.AutomaticIrrigationSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.luv2code.springboot.AutomaticIrrigationSystem.CustomExceptions.Resourcenotfoundexception;
import com.luv2code.springboot.AutomaticIrrigationSystem.Entity.PlotOfLand;
import com.luv2code.springboot.AutomaticIrrigationSystem.JpaRepo.landRepo;



@Service
public class ServiceImpl implements PlotService{
	
	
	private landRepo repo;
	
	
	
    @Autowired
	public ServiceImpl(landRepo repo) {
		super();
		this.repo = repo;
	}
    
    
    public ServiceImpl() {
    	
    }




	@Override
	public PlotOfLand savePlot(PlotOfLand plot) {
		
		PlotOfLand plot1 = new PlotOfLand();
		
		plot1.setId(plot.getId());
		plot1.setArea(plot.getArea());
		plot1.setCrop(plot.getCrop());
		plot1.setAmountOfWater(plot.getAmountOfWater());
		
		repo.save(plot1);
		
		return plot1;
		
		
		
	}




	@Override
	public List<PlotOfLand> getPlots() {
		List<PlotOfLand> plots = repo.findAll();
		
		return plots;
	}




	@Override
	public PlotOfLand getPlotById(Long id) {
		
		PlotOfLand plot = repo.findById(id).orElseThrow(() -> new Resourcenotfoundexception("plot", "id", id));
		
		return plot;
	}




	@Override
	public PlotOfLand edit(PlotOfLand plot, Long Id) {
		
		
		PlotOfLand plot1 = repo.findById(Id).orElseThrow(() -> new Resourcenotfoundexception("plot", "id", Id));
		
		plot1.setAmountOfWater(plot.getAmountOfWater());
		plot1.setArea(plot.getArea());
		plot1.setCrop(plot.getCrop());
		
		repo.save(plot1);
		
		return plot1;
		
		
	}




	@Override
	public void deleteById(Long id) {
		
		PlotOfLand plot = repo.findById(id).orElseThrow(() -> new Resourcenotfoundexception("plot", "id", id));
		
		repo.delete(plot);
		
	}
	
	

}
