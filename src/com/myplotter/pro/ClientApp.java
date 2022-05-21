package com.myplotter.pro;

import java.util.Scanner;

import com.myplotter.pro.ThreeD.Cube;
import com.myplotter.pro.ThreeD.Cylinder;
import com.myplotter.pro.ThreeD.Pyramid;
import com.myplotter.pro.ThreeD.Sphere;
import com.myplotter.pro.ThreeD.ThreeDShape;
import com.myplotter.pro.TwoD.Circle;
import com.myplotter.pro.TwoD.Ellipse;
import com.myplotter.pro.TwoD.Parallelogram;
import com.myplotter.pro.TwoD.Rectangle;
import com.myplotter.pro.TwoD.Rhombus;
import com.myplotter.pro.TwoD.RightTriangle;
import com.myplotter.pro.TwoD.Square;
import com.myplotter.pro.TwoD.Triangle;
import com.myplotter.pro.TwoD.TwoDShape;

public class ClientApp {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static String getUserInput() {
		
		System.out.println("What shape do you want to create: ");
		

		return scan.next();
	}
	
	public static String getColorInput() {
		System.out.println("What color do you want your shape to be?");
		
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
				double radius = scan.nextDouble();// Getting input dimensions from user
				
				TwoDShape c = new Circle(radius); // Creating new Shape
				c.fillColor(getColorInput()); // Filling color
				
				// Output information about the shape
				System.out.println("The circle\'s area is " + c.getArea());
				System.out.println("The circle\'s perimeter is " + c.getPerimeter());
				break;
			case "square":
				System.out.println("What side length do you want for the square? ");
				double side = scan.nextDouble();
				
				TwoDShape s = new Square(side);
				s.fillColor(getColorInput());
				
				System.out.println("The square\'s area is " + s.getArea());
				System.out.println("The square\'s perimeter is " + s.getPerimeter());
				break;
			case "rectangle":
				System.out.println("What length do you want for the rectangle? ");
				double length = scan.nextDouble();
				System.out.println("What width do you want for the rectangle? ");
				double width = scan.nextDouble();
				
				TwoDShape r = new Rectangle(length, width);
				r.fillColor(getColorInput());
				
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
				t.fillColor(getColorInput());
				
				System.out.println("The triangle\'s area is " + t.getArea());
				System.out.println("The triangle\'s perimeter is " + t.getPerimeter());
				break;
			case "ellipse":
			case "oval":
				System.out.println("What radius 1 do you want for the ellipse? ");
				double a = scan.nextDouble();
				System.out.println("What radius 2 do you want for the ellipse? ");
				double b = scan.nextDouble();
				
				TwoDShape e = new Ellipse(a, b);
				e.fillColor(getColorInput());
				
				System.out.println("The ellipse\'s area is " + e.getArea());
				System.out.println("The ellipse\'s perimeter is " + e.getPerimeter() + " (approximate)");
				break;
			case "rhombus":
				System.out.println("What diagonal 1 do you want for the rhombus? ");
				double diag1 = scan.nextDouble();
				System.out.println("What diagonal 2 do you want for the rhombus? ");
				double diag2 = scan.nextDouble();
				
				TwoDShape rom = new Rhombus(diag1, diag2);
				rom.fillColor(getColorInput());
				
				System.out.println("The rhombus\'s area is " + rom.getArea());
				System.out.println("The rhombus\'s perimeter is " + rom.getPerimeter());
				break;
			case "parallelogram":
				System.out.println("What base do you want for the parallelogram? ");
				double pBase = scan.nextDouble();
				System.out.println("What side do you want for the parallelogram? ");
				double pSide = scan.nextDouble();
				System.out.println("What height do you want for the parallelogram? ");
				double pHeight = scan.nextDouble();
				
				TwoDShape para = new Parallelogram(pBase, pSide, pHeight);
				para.fillColor(getColorInput());
				
				System.out.println("The parallelogram\'s area is " + para.getArea());
				System.out.println("The parallelogram\'s perimeter is " + para.getPerimeter());
				break;
			case "right triangle":
				System.out.println("What base do you want for the right triangle? ");
				double rtBase = scan.nextDouble();
				System.out.println("What height do you want for the right triangle? ");
				double rtHeight = scan.nextDouble();
				
				TwoDShape rt = new RightTriangle(rtBase, rtHeight);
				rt.fillColor(getColorInput());
				
				System.out.println("The right triangle\'s area is " + rt.getArea());
				System.out.println("The right triangle\'s perimeter is " + rt.getPerimeter());
				break;
				
				
				
				
			case "cube":
				System.out.println("What side length do you want for the cube? ");
				double cubeSide = scan.nextDouble();
				
				ThreeDShape cube = new Cube(cubeSide);
				cube.fillColor(getColorInput());
				
				System.out.println("The cube\'s surface area is " + cube.getSurfaceArea());
				System.out.println("The cube\'s volume is " + cube.getVolume());
				break;
				
			case "sphere":
				System.out.println("What side length do you want for the sphere? ");
				double sphereRadius = scan.nextDouble();
				
				ThreeDShape sphere = new Sphere(sphereRadius);
				sphere.fillColor(getColorInput());
				
				System.out.println("The sphere\'s surface area is " + sphere.getSurfaceArea());
				System.out.println("The sphere\'s volume is " + sphere.getVolume());
				break;
			case "pyramid":
				System.out.println("Base length of the pyramid: ");
				double pyLength = scan.nextDouble();
				System.out.println("Base width of the pyramid: ");
				double pyWidth = scan.nextDouble();
				System.out.println("Height of the pyramid: ");
				double pyHeight = scan.nextDouble();
				
				ThreeDShape py = new Pyramid(pyLength, pyWidth, pyHeight);
				py.fillColor(getColorInput());
				
				System.out.println("The pyramid\'s surface area is " + py.getSurfaceArea());
				System.out.println("The pyramid\'s volume is " + py.getVolume());
				break;
			case "cylinder":
				System.out.println("Base radius of the cylinder: ");
				double cyRadius = scan.nextDouble();
				System.out.println("Height of the cylinder: ");
				double cyHeight = scan.nextDouble();

				
				ThreeDShape cy = new Cylinder(cyRadius, cyHeight);
				cy.fillColor(getColorInput());
				
				System.out.println("The cylinder\'s surface area is " + cy.getSurfaceArea());
				System.out.println("The cylinder\'s volume is " + cy.getVolume());
				break;
			default:
				System.out.println("Invalid shape name.");
				break;
			}
			
			
			
			
			
	
		}
		
		
		
	}

	public static void main(String[] args) {
		
		// Tests
		
//		// 2D
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
//		TwoDShape parallelogram = new Parallelogram(3, 2, 1);
//		System.out.println("Area of parallelogram: " + parallelogram.getArea());
//		System.out.println("Perimeter of parallelogram: " + parallelogram.getPerimeter());
//		
//		TwoDShape ellipse = new Ellipse(4, 5);
//		System.out.println("Area of ellipse: " + ellipse.getArea());
//		System.out.println("Perimeter of ellipse: " + ellipse.getPerimeter());
//		
//		TwoDShape rhombus = new Rhombus(3, 4);
//		System.out.println("Area of rhombus: " + rhombus.getArea());
//		System.out.println("Perimeter of rhombus: " + rhombus.getPerimeter());
//		
//		TwoDShape rightTriangle = new RightTriangle(3, 4);
//		System.out.println("Area of right triangle: " + rightTriangle.getArea());
//		System.out.println("Perimeter of right triangle: " + rightTriangle.getPerimeter());
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
//		ThreeDShape pyramid = new Pyramid(3, 4, 10);
//		System.out.println("Surface area of pyramid: " + pyramid.getSurfaceArea());
//		System.out.println("Volume of pyramid: " + pyramid.getVolume());
//		
//		ThreeDShape cylinder = new Cylinder(5, 10);
//		System.out.println("Surface area of cylinder: " + cylinder.getSurfaceArea());
//		System.out.println("Volume of cylinder: " + cylinder.getVolume());
//
//		
		
		run();
		
		
		scan.close();

	}
	
	

}
