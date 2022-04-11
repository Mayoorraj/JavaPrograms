package com.bridgelabz.assignment5;

import java.util.Scanner;

import com.bridgelabz.utility.Util;

public class Functional {

	public static void main(String[] args) {
		
		System.out.println("select the method for Java Functional Programs..");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ProgramMethod = sc.nextInt();
		switch ((int)ProgramMethod) {
		case 1: 
			System.out.println("Its 2D Array program..!");
			Util.TwoDArray();
			break;
		case 2: 
			System.out.println("Its sum of 3 nos. program..!");
			Util.SumOfThreeNos();
			break;	
		case 3: 
			System.out.println("Its Euclidean distance program..!");
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			System.out.println("The Euclidean Distance from the point(" + x + "," + y + ") to the origin(0,0) is: "+ distance);
			break;
		case 4: 
			System.out.println("Its quadratic roots program..!");
			Util.Quadratic();
			break;	
		case 5: 
			double temperature = Integer.parseInt(args[0]);
			double windSpeed = Integer.parseInt(args[1]);

			if (Math.abs(temperature) > 50) {
				System.err.println("The temperature (F degree) cannot be more than 50F..! ");
				System.exit(0);}
			if (windSpeed > 120 || windSpeed < 3) {
				System.err.println("The Wind Speed (mph) must be between 3 and 120 mph..!");
				System.exit(0);}
			double windChill = 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
			System.out.println("The Wind Chill Teperature is: " + Math.round(windChill) + "  degree Farhenheit");
			break;	
		}
	}
}