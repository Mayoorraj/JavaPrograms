package dayTwo;
/**
 * @author mayoor
 *Write a program SpringSeason.java that takes two int values m and d from the command line 
 *and prints true if day d of month m is between March 20 (m = 3, d=20) 
 *and June 20 (m = 6, d = 20), false otherwise.
 */
public class ProblemFiveDotTwo 
{
	public static void main(String[] args) 
	{
		int m,d;
		d = Integer.parseInt(args[0]);
		m = Integer.parseInt(args[1]);
//		for day between 20th and 31st March
		if (m == 3 && d>= 20 && d<= 31) {
			System.out.println("It's a spring day!");}
//		for day between 1st and 30th April
		else if (m == 4 && d>= 1 && d<= 30) {
			System.out.println("It's a spring day!");}
//		for day between 1st and 31th May
		else if (m == 5 && d >= 1 && d<= 31) {
			System.out.println("It's a spring day!");}
//		for day between 1st and 20th May
		else if (m == 6 && d >= 1 && d <= 20) {
			System.out.println("It's a spring day!");}
//		for any other day of year
		else {
			System.out.println("It's not a spring day.."); }
	}
}
