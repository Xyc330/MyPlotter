package com.myplotter.pro.TwoD;

public class Square extends TwoDShape{
	private double side;
	
	

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return side * 4;
	}
	
}
