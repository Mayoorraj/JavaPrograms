package dayTwo;
import java.util.Scanner;
/**
 * @author mayoor
 *Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
 */
public class ProblemTwoDotOne {

	public static void main(String[] args) {
		System.out.println("Enter a natural number");
		Scanner sc = new Scanner(System.in);
		int entry = sc.nextInt();
		sc.close();
		int i = 1;
		int sum = 0;
		while(i<=entry) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum of natural numbers is " + sum);
	}
}
