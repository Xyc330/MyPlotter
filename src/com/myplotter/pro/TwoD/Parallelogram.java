package com.myplotter.pro.TwoD;

public class Parallelogram extends TwoDShape {
	
	private double base;
	private double side;
	private double height;


	public Parallelogram(double base, double side, double height) {
		
		if(height > side) {
			System.out.println("WARNING: Invalid input for parallelogram: height > side");
		}
		this.base = base;
		this.side = side;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (base * height) / 2;
	}

	@Override
	public double getPerimeter() {
		return 2 * (base + side);
	}

}
