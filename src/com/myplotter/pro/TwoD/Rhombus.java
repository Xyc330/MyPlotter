package com.myplotter.pro.TwoD;

public class Rhombus extends TwoDShape {
	
	// Diagonals
	private double diag1;
	private double diag2;


	public Rhombus(double diag1, double diag2) {
		super();
		this.diag1 = diag1;
		this.diag2 = diag2;
	}

	@Override
	public double getArea() {
		return diag1 * diag2 / 2;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.sqrt((diag1*diag1) + (diag2*diag2));
	}

}
