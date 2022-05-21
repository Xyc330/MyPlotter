package com.myplotter.pro.TwoD;

public class RightTriangle extends TwoDShape {
	
	private double base;
	private double height;
	
	
	public RightTriangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (base * height) / 2;
	}

	@Override
	public double getPerimeter() {
		double h = Math.sqrt((base*base) + (height*height)); // Pythagorean theorem
		
		return base + height + h;
	}

}
