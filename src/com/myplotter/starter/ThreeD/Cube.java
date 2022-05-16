package com.myplotter.starter.ThreeD;

import com.myplotter.starter.Shape;

public class Cube extends ThreeDShape {
	private double side;
	
	

	public Cube(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getSurfaceArea() {
		return side * side * 6;
	}

	@Override
	public double getVolume() {
		return side * side * side;
	}
	


	@Override
	public Shape shapeCreater() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
