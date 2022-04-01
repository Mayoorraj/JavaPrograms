package dayTwo;
/**
 * @author mayoor
 *Write a Program to find Palindrome Number
eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
eg. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.
 */
import java.util.Scanner;
public class ProblemThreeDotThree 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
//		reverse operation
		int temp = num;
	    int reverse = 0;  
	    for (;num!= 0; num=num/10) {  
	    	int reminder = num % 10;  
	    	reverse = reverse * 10 + reminder; }  
	    System.out.println(reverse);
//	    checking for palindrome property
	    	if(temp == reverse) {
	    		System.out.println("Number is palindrome");} 
	    	else {
	    		System.out.println("Number is not palindrome");}
	}
}	
