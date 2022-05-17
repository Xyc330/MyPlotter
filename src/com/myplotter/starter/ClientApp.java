package com.myplotter.starter;

import com.myplotter.starter.TwoD.*;
import com.myplotter.starter.ThreeD.*;
import com.myplotter.starter.*;
import java.util.Scanner;

public class ClientApp {
	public static Scanner scan = new Scanner(System.in);
	
	public static String getUserInput() {
		
		System.out.println("What shape do you want to create: ");
		

		return scan.next();
	}
	
	public static void run() {
		
		String input = "";
		boolean running = true;
		
		while(running){
			input = getUserInput().toLowerCase();
			
			if(input.equals("quit")) {
				running = false;
				System.out.println("Cya!");
				break;
			}
			
			switch(input) {
			case "circle":
				System.out.println("What radius do you want for the circle? ");
				double radius = scan.nextDouble();
				
				TwoDShape c = new Circle(radius);
				System.out.println("The circle\'s area is " + c.getArea());
				System.out.println("The circle\'s perimeter is " + c.getPerimeter());
				break;
			case "square":
				System.out.println("What side length do you want for the square? ");
				double side = scan.nextDouble();
				
				TwoDShape s = new Square(side);
				System.out.println("The square\'s area is " + s.getArea());
				System.out.println("The square\'s perimeter is " + s.getPerimeter());
				break;
			case "rectangle":
				System.out.println("What length do you want for the rectangle? ");
				double length = scan.nextDouble();
				System.out.println("What width do you want for the rectangle? ");
				double width = scan.nextDouble();
				
				TwoDShape r = new Rectangle(length, width);
				System.out.println("The rectangle\'s area is " + r.getArea());
				System.out.println("The rectangle\'s perimeter is " + r.getPerimeter());
				break;
			case "triangle":
				System.out.println("First side of the triangle: ");
				double side1 = scan.nextDouble();
				System.out.println("Second side of the triangle: ");
				double side2 = scan.nextDouble();
				System.out.println("Third side of the triangle: ");
				double side3 = scan.nextDouble();
				
				TwoDShape t = new Triangle(side1, side2, side3);
				System.out.println("The triangle\'s area is " + t.getArea());
				System.out.println("The triangle\'s perimeter is " + t.getPerimeter());
				break;
				
				
				
				
			case "cube":
				System.out.println("What side length do you want for the cube? ");
				double cubeSide = scan.nextDouble();
				
				ThreeDShape cube = new Cube(cubeSide);
				System.out.println("The cube\'s surface area is " + cube.getSurfaceArea());
				System.out.println("The cube\'s volume is " + cube.getVolume());
				break;
				
			case "sphere":
				System.out.println("What side length do you want for the sphere? ");
				double sphereRadius = scan.nextDouble();
				
				ThreeDShape sphere = new Sphere(sphereRadius);
				System.out.println("The sphere\'s surface area is " + sphere.getSurfaceArea());
				System.out.println("The sphere\'s volume is " + sphere.getVolume());
				break;
			default:
				System.out.println("Invalid shape name.");
				break;
			}
			
			
			
			
			
	
		}
		
		
		
	}

	public static void main(String[] args) {
		
		
		// Testing
		
		
		// 2D
//		TwoDShape circle = new Circle(10);
//		System.out.println("Area of circle: " + circle.getArea());
//		System.out.println("Perimeter of circle: " + circle.getPerimeter());
//		
//		TwoDShape square = new Square(8);
//		System.out.println("Area of square: " + square.getArea());
//		System.out.println("Perimeter of square: " + square.getPerimeter());
//		
//		TwoDShape rectangle = new Rectangle(12, 15);
//		System.out.println("Area of rectangle: " + rectangle.getArea());
//		System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
//		
//		TwoDShape triangle = new Triangle(3, 4, 5);
//		System.out.println("Area of triangle: " + triangle.getArea());
//		System.out.println("Perimeter of triangle: " + triangle.getPerimeter());
//		
//		
//		// 3D
//		ThreeDShape sphere = new Sphere(7);
//		System.out.println("Surface area of sphere: " + sphere.getSurfaceArea());
//		System.out.println("Volume of sphere: " + sphere.getVolume());
//		
//		ThreeDShape cube = new Cube(7);
//		System.out.println("Surface area of cube: " + cube.getSurfaceArea());
//		System.out.println("Volume of cube: " + cube.getVolume());
//		
		
		
		run();
		
		
		scan.close();
		
	}

}
