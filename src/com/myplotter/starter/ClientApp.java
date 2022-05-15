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
		Circle circle = new Circle(10);
		System.out.println("Area of circle: " + circle.getArea());
		System.out.println("Perimeter of circle: " + circle.getPerimeter());
		
		scan.close();
		
	}

}
