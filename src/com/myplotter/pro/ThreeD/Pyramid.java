package com.myplotter.pro.ThreeD;

public class Pyramid extends ThreeDShape{
	
	// This will only represent a right rectangular pyramid
	
	private double length;
	private double width;
	private double height;
	
	
	public Pyramid(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getSurfaceArea() {
		
		double apothemLength = Math.sqrt((width/2)*(width/2) + height*height);
		double apothemWidth = Math.sqrt((height/2)*(height/2) + height*height);
		
		return length * width + length * apothemLength + width * apothemWidth;
		
	}
	@Override
	public double getVolume() {
		return length * width / 3;
	}
	
	

}
