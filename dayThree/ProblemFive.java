package dayThree;
/**
 * @author mayoor
 *Java Program to print the elements of an array present at an even position
 */
import java.util.Scanner;
public class ProblemFive 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter five elements of array");
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		for (int i=0; i<arr.length; i++) {
			arr[i]  = sc.nextInt();}  
		System.out.println("Elements of given array present at even position: ");
//		Loop through the array by incrementing value of i by 2 (for even elements 1st index is 1st position)   
	        for (int i=1; i <arr.length; i=i+2) { 
	    System.out.println(arr[i]);}  
	    sc.close();
	}
}
