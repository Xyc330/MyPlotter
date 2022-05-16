package com.myplotter.starter.TwoD;

import com.myplotter.starter.Shape;

public class Triangle extends TwoDShape{
	
	private double side1;
	private double side2; 
	private double side3;
	

	public Triangle(double side1, double side2, double side3) {
		super();
		
		if(!isTriangle(side1, side2, side3)) {
			System.err.print("Invalid triangle");
		}else {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		
	}
	
	private boolean isTriangle(double side1, double side2, double side3) {
		return side1+side2>side3 && 
				side1+side3>side2 &&
				side2+side3>side1;
	}
	

	@Override
	public double getArea() {// Heron's formula
		double s = (this.side1 + this.side2 + this.side3)/2; // semi-perimeter
		
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)); // formula
	}

	@Override
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	@Override
	public Shape shapeCreater() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
