package com.myplotter.pro.TwoD;

public class Ellipse extends TwoDShape{
	
	private double a; // radius 1
	private double b; // radius 2
	
	public Ellipse(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double getPerimeter() { // We can only approximate the perimeter of an ellipse
		double h = ((a-b)*(a-b))/((a+b)*(a+b)); // A variable that we'll need later
		double perimeter;
		
		// First way (faster, less accurate)
		// perimeter = 2 * Math.PI * Math.sqrt((a*a+b*b)/2);
		
		
		
		// Second way (slower, more accurate)
		
		perimeter = Math.PI * (a+b) * (1 + (3*h)/(10+Math.sqrt(4-3*h))); // Magic formula
		
		
		
		return perimeter;
		
	}
	

	@Override
	public double getArea() {
		return Math.PI * a * b; // Much simpler
	}
	
	
	
	

}
