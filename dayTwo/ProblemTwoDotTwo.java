package dayTwo;
/**
 * @author mayoor
 *Write a Program to reverse the integer number eg. Input n=231 reverse is 132
 */
import java.util.Scanner;
public class ProblemTwoDotTwo 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
//		read the input value
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
//		defining the reverse variable
	    int reverse = 0;  
//	    run loop until num becomes 0
	    while(num != 0) {
// 		get last digit from num
	        int reminder = num % 10;
	        reverse = reverse * 10 + reminder;
// 		to remove the last digit from num
	        num = num/10;}  
	    System.out.println("The reverse of the number is: " + reverse);  
	}
}
