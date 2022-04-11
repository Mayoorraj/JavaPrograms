package com.bridgelabz.assignment5;

import java.util.Scanner;

import com.bridgelabz.utility.Util;

/**
 * @author mayoor
 *Basic Java Core programs
 */
public class BasicCore {

	public static void main(String[]args) {		
		System.out.println("select the method for Java Basic Programs..");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ProgramMethod = sc.nextInt();
		switch ((int)ProgramMethod) {
		case 1: 
			System.out.println("Its Filp coins program..!");
			Util.FlipCoins();
			break;
		case 2:
			System.out.println("Its Leap years program..!");
			Util.LeapYear();
			break;
		case 3:
			System.out.println("Its Power of two program..!");
			Util.PowerofTwo();
			break;
		case 4:
			System.out.println("Its Harmonic Numbers program..!");
			Util.HarmonicNos();
			break;
		case 5:
			System.out.println("Its Prime Factorisation program..!");
			Util.PrimeFactors();
			break;
		case 6:
			System.out.println("Its quotient and Remainder program..!");
			Util.QuotientRemainder();
			break;
		case 7:
			System.out.println("Its Number Swapping program..!");
			Util.SwapNos();
			break;
		case 8:
			System.out.println("Its Even Odd program..!");
			Util.EvenOdd();
			break;
		case 9:
			System.out.println("Its check for Vowel or Consonant program..!");
			Util.VowelConsonant();
			break;
		case 10:
			System.out.println("Its check for largest no.10 program..!");
			Util.LargestNo();
			break;
		}
	}
}