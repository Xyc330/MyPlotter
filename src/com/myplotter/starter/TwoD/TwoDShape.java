package com.myplotter.starter.TwoD;

import com.myplotter.starter.Shape;

public abstract class TwoDShape implements Shape{
	private TwoDShape[] shapes;
	
	public abstract double getArea();
	public abstract double getPerimeter(); 
	
	public abstract Shape shapeCreater();

}
