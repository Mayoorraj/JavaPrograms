package dayTwo;
import java.util.Scanner;
/**
 * @author mayoor
 *Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5 (with for Loop)
 */
public class ProblemThreeDotOne {

	public static void main(String[] args) {
		System.out.println("Enter a natural number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
//		summation operation using for loop
		int i = 1;
		int sum = 0;
		for (i=1; i<=num; i++) {
			sum = sum + i;
		}
		System.out.println("sum of natural numbers is " + sum);
	}
}
