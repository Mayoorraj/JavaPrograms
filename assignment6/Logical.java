package com.bridgelabz.assignment6;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.utility.Util;

public class Logical {
	
	public static int numCoupons;
	public static ArrayList<Integer> arrayc = new ArrayList<Integer>();
	public static int count = 0;
	public static int Random= 0;

	public static int generateRandomNumbers() {
		return (int) Math.floor(Math.random() * 10) % numCoupons;}

	public static void generateDistinctCoupons(int numberOfCoupons) {
		while (arrayc.size() != numberOfCoupons) {
			int randomNumber = generateRandomNumbers();
			if (arrayc.contains(randomNumber)) {
				Random++;} 
			else {
				Random++;
				arrayc.add(randomNumber);}}
		for(int index = 0 ; index < arrayc.size() ; index++) {
			System.out.println(arrayc.get(index));}
			System.out.println("The total numbers of random Numbers generated are : " + Random);}

	public static void main(String[] args) {
	
		System.out.println("select the method for Java Logical Programs..");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ProgramMethod = sc.nextInt();
		switch ((int)ProgramMethod) {
		case 1: 
			System.out.println("Its Fibonacci no. program..!");
			Util.Fibonacci();
			break;
		
		case 2: 
			System.out.println("Its Perfect no. program..!");
			Util.PerfectNo();
			break;
			
		case 3: 
			System.out.println("Its Prime no. program..!");
			Util.PrimeNo();
			break;
			
		case 4: 
			System.out.println("Its reversed no. program..!");
			Util.ReversedNo();
			break;
			
		case 5:
			System.out.println("Its Coupon no. program..!");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of distinct coupon numbers needed:");
			numCoupons = scan.nextInt();
			generateDistinctCoupons(numCoupons);
			break;
		
		case 6: 
			System.out.println("Its stopwatch program..!");
			Util.StopWatch();
			break;
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
