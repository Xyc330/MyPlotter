package com.myplotter.pro.ThreeD;

import com.myplotter.pro.Shape;

public abstract class ThreeDShape implements Shape{
	public abstract double getSurfaceArea();
	public abstract double getVolume(); 
	
	public void fillColor(String color) {
		System.out.println("The shape is now " + color + "!");
	}

}
