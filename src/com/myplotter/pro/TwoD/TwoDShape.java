package com.myplotter.pro.TwoD;

import com.myplotter.pro.Shape;

public abstract class TwoDShape implements Shape{
	
	public abstract double getArea();
	public abstract double getPerimeter(); 
	
	public void fillColor(String color) {
		System.out.println("The shape is now " + color + "!");
	}
	

}
