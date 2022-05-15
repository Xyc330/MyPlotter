package com.myplotter.starter.TwoD;

public class Circle extends TwoDShape{
	
	private double radius;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return Math.PI * radius * 2;
	}

}
