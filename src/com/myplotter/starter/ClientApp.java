package com.myplotter.starter;

import com.myplotter.starter.TwoD.*;
import com.myplotter.starter.ThreeD.*;
import java.util.Scanner;

public class ClientApp {
	public static Scanner scan = new Scanner(System.in);
	
	public static String getUserInput() {
		
		System.out.println("What shape do you want to create: ");
		

		return scan.next();
		
	}

	public static void main(String[] args) {
		
		
		// Testing
		
		
		// 2D
		TwoDShape circle = new Circle(10);
		System.out.println("Area of circle: " + circle.getArea());
		System.out.println("Perimeter of circle: " + circle.getPerimeter());
		
		TwoDShape square = new Square(8);
		System.out.println("Area of square: " + square.getArea());
		System.out.println("Perimeter of square: " + square.getPerimeter());
		
		TwoDShape rectangle = new Rectangle(12, 15);
		System.out.println("Area of rectangle: " + rectangle.getArea());
		System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
		
		TwoDShape triangle = new Triangle(3, 4, 5);
		System.out.println("Area of triangle: " + triangle.getArea());
		System.out.println("Perimeter of triangle: " + triangle.getPerimeter());
		
		
		// 3D
		ThreeDShape sphere = new Sphere(7);
		System.out.println("Surface area of sphere: " + sphere.getSurfaceArea());
		System.out.println("Volume of sphere: " + sphere.getVolume());
		
		ThreeDShape cube = new Cube(7);
		System.out.println("Surface area of cube: " + cube.getSurfaceArea());
		System.out.println("Volume of cube: " + cube.getVolume());
		
		
		
		
		
		scan.close();
		
	}

}
