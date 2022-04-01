package dayTwo;
import java.util.Scanner;
/**
 * @author mayoor
 *Write a Program to reverse the integer number eg. Input n=231 reverse is 132 (with for loop)
 */
public class ProblemThreeDotTwo
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
//		defining the reverse variable
	    int reverse = 0;  
//	    reverse operation using for loop
	    for (;num!= 0; num=num/10) {  
	    	int remainder = num % 10;  
	    	reverse = reverse * 10 + remainder;}  
	    System.out.println("The reverse of the number is: " + reverse);  
	}
}
