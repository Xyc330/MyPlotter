package com.myplotter.starter.TwoD;

import com.myplotter.starter.Shape;

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
		// TODO Auto-generated method stub
		return side * 4;
	}

	@Override
	public Shape shapeCreater() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
