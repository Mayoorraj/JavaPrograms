package dayOne;
import java.util.Scanner;
/**
 * @author mayoor
 *Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
So ensure to check for the same. 
Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400.
 */
public class ProblemSeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Enter the year");
		int year = sc.nextInt();	
		int length = String.valueOf(year).length();
		if (year >= 1582 && length == 4) {
			if (year % 400 == 0 || year % 4 ==0 && year % 100 != 0) {
				System.out.println(year + " is leap year");
			}
		else
			System.out.println(year + " is not leap year");
}
		else {
			System.out.println("Wrong entry");
	}
	}
}
