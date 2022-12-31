package com.luv2code.springboot.AutomaticIrrigationSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class PlotOfLand {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="crop")
	private String crop;
	
	@Column(name="area")
	private String area;
	
	
	@Column(name="water_amount")
	private String amountOfWater;
	
	
	public PlotOfLand() {
		
	}


	


	public PlotOfLand(String crop, String area, String amountOfWater) {
		super();
		this.crop = crop;
		this.area = area;
		this.amountOfWater = amountOfWater;
	}
	
	
	





	@Override
	public String toString() {
		return "PlotOfLand [id=" + id + ", crop=" + crop + ", area=" + area + ", amountOfWater=" + amountOfWater + "]";
	}





	public String getCrop() {
		return crop;
	}





	public void setCrop(String crop) {
		this.crop = crop;
	}





	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getAmountOfWater() {
		return amountOfWater;
	}


	public void setAmountOfWater(String amountOfWater) {
		this.amountOfWater = amountOfWater;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
