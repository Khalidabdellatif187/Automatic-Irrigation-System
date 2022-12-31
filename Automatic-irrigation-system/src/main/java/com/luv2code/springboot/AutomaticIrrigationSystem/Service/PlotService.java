package com.luv2code.springboot.AutomaticIrrigationSystem.Service;

import java.util.List;

import com.luv2code.springboot.AutomaticIrrigationSystem.Entity.PlotOfLand;

public interface PlotService {
	
	public PlotOfLand savePlot(PlotOfLand plot);
	
	public List<PlotOfLand> getPlots();
	
	public PlotOfLand getPlotById(Long id);
	
	public PlotOfLand edit(PlotOfLand plot , Long Id);
	
	public void deleteById(Long id);
	
	

}
