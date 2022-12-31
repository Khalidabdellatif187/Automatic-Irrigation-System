package com.luv2code.springboot.AutomaticIrrigationSystem.JpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.AutomaticIrrigationSystem.Entity.PlotOfLand;



public interface landRepo extends JpaRepository<PlotOfLand , Long>  {

   
	
	
}
