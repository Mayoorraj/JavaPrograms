package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.Scanner;

public class Util {
	 public static Scanner sc = new Scanner(System.in);
	 
	public static int getPositiveInt(){
		String str;
	    int time = 0;
		boolean valid = false;
		while (!valid) {
		    try { 	
		    	System.out.println("Please Enter");
		       	str = sc.next();  
		        time = Integer.parseInt(str);
		        if (time > 0) 
		        valid = true;  }
		    catch (NumberFormatException e) {
		    	System.out.println("Error, not a positive Int. Please try again..!" + e);}}
		return time; 
	}

	public static void FlipCoins () {
		System.out.println("Welcome to Flip Coins Program");
		int CountHead = 0;
		int CountTail = 0;
		double flip;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println ("how many tosses you want? ");
		double FlipNos = sc.nextDouble();
		for(int i = 1;i<= FlipNos; i++) {
			flip = Math.random();
			if(flip<0.5) {
				CountTail = CountTail + 1;}
			else {
				CountHead = CountHead + 1;} }
//		tossing results	
		System.out.println(" Head won " + CountHead + " times");
		System.out.println(" Tail won " + CountTail + " times");
//		tossing percentage	
		float HeadChances =  ( float)((CountHead / FlipNos) * 100);
		float TailChances =  ( float)((CountTail / FlipNos) * 100);	
		System.out.println(" Head chances are : " + HeadChances );
		System.out.println(" Tail chances are : " + TailChances );
}

	public static void LeapYear() {

		System.out.print("Enter the year : ");
		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		int year = scan.nextInt();
		int length = String.valueOf(year).length();
		if (length == 4) 
			if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) 
				System.out.print(year + " year is a leap year");
			else 
				System.out.print(year + " year is not a leap year"); 
		else 
			System.out.println("enter four digit year");
	}

	public static void PowerofTwo() 
	{
		System.out.println("Welcome to Power of Two Program");
		int Input = 0;
		System.out.println("Enter the power of two..!"); 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int Power = sc.nextInt();
		
			 if (Power<32) {
				for(int i=1; i<= Power; i++) {
					Input = (int) Math.floor(Math.pow(2,i));
					System.out.println(Input); } }
				
				int length = String.valueOf(Input).length();
				if (length==4) {
					if (((Input % 4 == 0) && (Input % 100!= 0))&& (Input>1582) && (Input % 400 == 0) ){
					System.out.println( +Input + " year is a leap year"); }
					else {
					System.out.println( + Input + " year is not a leap year"); } } 	
				else {
				System.err.println( "the value of given power of two is not valid for leap year method..!");}		
	}

	public static void HarmonicNos () {
		System.out.println("Welcome to Harmonic Number Program,Enter the Number : ");	
		int number;
		float result=0.0f;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		if(number!=0){
			for(int i=1; i<=number;i++){
				result +=1/(float)i;
				System.out.println(i+"th harmonic no. is :"+result); } }	
		else{
			System.out.println("Enter Non Zero value !");}	
	}
	
	public static void PrimeFactors () {
		System.out.println("Welcome to Prime Factorization Program,"
				+ "Enter Number for Prime Factorization operation :");	
		int number;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();	
	     for(int i=2;i*i<=number;i++){	
			while(number%i==0){
				number/=i;
				System.out.println(i);}}
	}
	
	public static void QuotientRemainder () {
		System.out.println("Welcome to Quotient Remainder Program");
		int divider, divisor;
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number for Divider : ");
	    divider = sc.nextInt();
	    System.out.println("Enter a number for Divisor : ");
	    divisor = sc.nextInt();
//		Quotient and Remainders operation      
	    int result = 0;
	    int quotient, Remainder;
	    result = (divider / divisor);
	    quotient = result;
	    System.out.println("Quotient is: "+quotient );
	    result = divider % divisor;
	    Remainder = result;
	    System.out.println("Remainder is: "+Remainder );
	}

	public static void SwapNos ( ) {;
		int x ,y ;
		@SuppressWarnings("resource")
		Scanner var = new Scanner(System.in);
		System.out.println("Welcome to Swap Two Numbers ! Enter 1st number: ");
		x = var.nextInt();
		System.out.println("x is assigned value of "+x);
		System.out.println("Enter 2nd number: ");
		y = var.nextInt();
		System.out.println("y is assigned value of "+x);
		int temp;
		temp = y;
		y = x;
		x = temp;
		System.out.println("Swapping will return x as "+x +"  y as " +y);
	}
	
	public static void EvenOdd ( ) {
		System.out.println("Welcome to Even or odd number confirmation Program, "
				+ "Enter a number :");
		int num;
		@SuppressWarnings("resource")
		Scanner var = new Scanner(System.in);
		num = var.nextInt();
		if( (num % 2) == 0 ) {
			System.out.println(num + " is Even number");}
		else {
			System.out.println(num + " is Odd number");	}
	}

	public static void VowelConsonant ( ) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to Check Whether Input letter is Vowel or Consonant Program,"
				+ " Enter Alphabet to check Vowel or Constant"); 
		char letter = sc.next().charAt(0);
//		check letter is vowel or consonant
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
		  letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
			System.out.println(letter+" is a Vowel ");}
		else {
			System.out.println(letter+" is a Consonant ");}
	}

	public static void LargestNo ( ) {	
		int Num1, Num2, Num3;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println("Please Enter 1st Number: ");
		Num1 = sc.nextInt();
		System.out.println("Please Enter 2nd Number: ");
		Num2 = sc.nextInt();
		System.out.println("Please Enter 3rd Number: ");
		Num3 = sc.nextInt();
		if( Num1 > Num2 && Num1 > Num3){
		      System.out.println("The largest number is " +Num1);} 
		else if (Num2 > Num1 && Num2 > Num3) {
		         System.out.println("The largest number is " +Num2);}
		else {
		         System.out.println("The largest number is " +Num3);}
	}
	
	public static void TwoDArray ( ) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out, true);
		int numberOfRows, numberOfColumns;
// Read no of Rows and Columns
		System.out.println("Enter the number of Rows: ");
		numberOfRows = sc.nextInt();
		System.out.println("Enter the number of Columns: ");
		numberOfColumns = sc.nextInt();
// 2D Array object creation
		int[][] twoDArray = new int[numberOfRows][numberOfColumns];
// constructing 2D Array..
		for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
			for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) {
				System.out.println("Enter the array element: ");
				twoDArray[rowIndex][columnIndex] = sc.nextInt();} }
		System.out.println("The 2D array : ");
		for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
			for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) {
				pw.print(twoDArray[rowIndex][columnIndex] + "\t");}
				pw.println();}
	}
		
	public static void SumOfThreeNos ( ) {
		int arr[] = { 1, 2, -3, 1, 0 };
		int arr_size = arr.length;
		int tripletsCount = 0;
		for (int zeroInd = 0; zeroInd < arr_size - 2; zeroInd++) {
			for (int firstInd = zeroInd + 1; firstInd < arr_size - 1; firstInd++) {
				for (int secondInd = firstInd + 1; secondInd < arr_size; secondInd++) {
					if (arr[zeroInd] + arr[firstInd] + arr[secondInd] == 0) {
						System.out.println(arr[zeroInd] + " " + arr[firstInd] + " "+ arr[secondInd]);
						tripletsCount++; } } } }
		System.out.println("triplets that add to 0 are: " + tripletsCount);
	}
	
	public static void Quadratic () {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a = sc.nextInt();
		System.out.println("Enter the value of b :");
		int b = sc.nextInt();
		System.out.println("Enter the value of c :");
		int c = sc.nextInt();
		double realRoot1, realRoot2, complexRoot;
		int delta = b * b - 4 * a * c;
//		Checking Real and unique roots
		if (delta > 0) {
			System.out.println("The roots of the equation " + a + "*x^2 + " + b + "*x + " + c + " are Real and Unique");
			realRoot1 = (-b + Math.sqrt(delta)) / (2 * a);
			realRoot2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Root 1: " + realRoot1);
			System.out.println("Root 2: " + realRoot2);}
//		checking real and equal roots
		else if (delta == 0) {
			System.out.println("The roots of the equation " + a + "*x^2 + " + b + "*x + " + c + " are Real and Equal");
			realRoot1 = (-b / (2 * a));
			System.out.println("Root 1 and Root 2: " + realRoot1); }
//		checking complex roots
		 else {
			System.out.println("The roots of the equation " + a + "*x^2 + " + b + "*x + " + c + " are Complex");
			realRoot1 = -b / (2 * a);
			complexRoot = Math.sqrt(Math.abs(delta));
			System.out.println("Root 1: " + realRoot1 + " + i" + complexRoot);
			System.out.println("Root 1: " + realRoot1 + " - i" + complexRoot);}	
	}
		
	public static void Fibonacci() {
		System.out.println("Welcome to Fibonacci Series Program..!");
		int num1 = 0, num2 = 1;
		int sum = 0;
		int n = 9;
		System.out.print("Fibonacci numbers are : ");
		System.out.print(" "+num1+" "+num2);

		for(int i =2; i < n; i++) {
			sum = num1 + num2;
			System.out.print(" "+sum);
			num1 = num2;
			num2 = sum;	}
	}
	
	public static void PerfectNo () {
		System.out.println("Welcome to Perfect Number Program ");
		
		int sumOfDivisors = 0;
		System.out.println("Enter a number : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int index = 1; index <= num/ 2; index++) {
			if (num % index == 0) {
				sumOfDivisors += index;} }
		if (sumOfDivisors == num) {
			System.out.println(num + " is a Perfect Number");}
		else {
			System.out.println(num + " is not a Perfect Number");}
	}

	public static void PrimeNo () {
System.out.println("Welcome to  Prime Number Program");
		System.out.println("Enter a number : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag = 0;
		if((num == 0) || (num == 1)) {
			System.out.println(num+" is not a prime number");}
		else {
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				System.out.println(num+" is a prime number");
				flag = 1;
				break;}}}    
		if(flag == 0) {
			System.out.println(num+" :Number is a prime number");
		}  
	}

	public static void ReversedNo () {
		System.out.println("Welcome to Reverse Number Program..! ");
		System.out.println("Enter a number : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int reverse = 0;
		while(num != 0) {
			int remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;}
		System.out.println("reverse numver is : "+reverse);
	}

	public static void StopWatch () {
		@SuppressWarnings("resource")
		Scanner scannerObject = new Scanner(System.in);
		int userchoice;
		long startTime = 0;
		long stopTime;
		long timeElapsed;
		while (true) {
			System.out.println("Enter:\n1 - START\n2 - STOP\n3 - EXIT\n");
			userchoice = scannerObject.nextInt();
			switch (userchoice) {
			case 1:
				startTime = System.currentTimeMillis();
				System.out.println("Started At: " + startTime + " ms");
				break;

			case 2:
				stopTime = System.currentTimeMillis();
				System.out.println("Stopped At: " + stopTime + " ms");
				timeElapsed = stopTime - startTime;
				System.out.println("Elapsed Time: " + timeElapsed + " ms");
				break;

			case 3:
				System.exit(0);}}
	}
	







}