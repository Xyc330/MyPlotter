package com.myplotter.starter.ThreeD;

import com.myplotter.starter.Shape;
import com.myplotter.starter.TwoD.TwoDShape;

public abstract class ThreeDShape implements Shape{
	private ThreeDShape[] shapes;
	
	public abstract double getSurfaceArea();
	public abstract double getVolume(); 
	
	public abstract Shape shapeCreater();
	
}
