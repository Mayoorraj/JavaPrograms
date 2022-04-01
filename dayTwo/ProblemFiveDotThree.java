package dayTwo;
/**
 * @author mayoor
 *Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. 
The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
Take a, b, and c as input values to find the roots of x.
 */
import java.util.Scanner;
public class ProblemFiveDotThree 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = sc.nextFloat();
		System.out.println("Enter the value of b");
		double b = sc.nextFloat();
		System.out.println("Enter the value of c");
		double c = sc.nextFloat();
		sc.close();
//		defining the root equation
		double delta = b * b - 4.0 * a * c;
//		condition for two distinct roots
		if (delta> 0.0){  
			double rt1 = (-b + Math.pow(delta, 0.5)) / (2.0 * a);  
			double rt2 = (-b - Math.pow(delta, 0.5)) / (2.0 * a);  
		System.out.println("The roots are " + rt1 + " and " + rt2); }   
//		condition for one repeated root
		else if (delta == 0.0) {  
			double rt1 = -b / (2.0 * a);  
		System.out.println("The one repeated root is " + rt1);}   
//		condition for unreal root
		else if (delta< 0.0) {  
		System.out.println("Roots are not real..");}  
	}
}
