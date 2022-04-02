package dayThree;
/**
 * @author mayoor
 *Java Program to print the duplicate elements of an array
 */
import java.util.Scanner;
public class ProblemEight 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter five elements of array");
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();} 
//		checking for repeated element values
		System.out.println("Repeated elements in array");
		for (int i = 0; i < arr.length; i++) {  
	        for (int j = i + 1; j < arr.length; j++) {  
	            if(arr[i] == arr[j])  
	    System.out.println(arr[j]);              
	    sc.close();}}
	}
}