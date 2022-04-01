package dayTwo;
import java.util.Scanner;

/**
 * @author mayoor
 *Read a Number 1,10,100,1000 and display unit, ten hundred
 */
public class ProblemOneDotTwo {

	public static void main(String[] args) {
		System.out.println("Enter a number " );
		Scanner sc = new Scanner(System.in);
		int entry = sc.nextInt();
		sc.close();
//		for number one
		if (entry ==1) {
			System.out.println("Number is one");
	}
//		for number ten
		else if (entry == 10) {
			System.out.println("Number is ten");
	}
//		for number hundred
		else if (entry == 100) {
			System.out.println("Number is hundred");
	}
//		for number hundred
		else if (entry == 1000) {
			System.out.println("Number is thousand");
	}
//		for number other than power of ten
		else {
			System.out.println("number is not a unit of 10");
	}
	}
}
