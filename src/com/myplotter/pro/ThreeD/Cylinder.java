package com.myplotter.pro.ThreeD;

public class Cylinder extends ThreeDShape{

	private double radius;
	private double height;
	
	
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double getSurfaceArea() {
		return Math.PI*radius*2 * height +  
			   2 * Math.PI * radius * radius; // circumference * height + 2 * base
	}

	@Override
	public double getVolume() {
		return Math.PI * radius * radius * height;
	}
	

}
