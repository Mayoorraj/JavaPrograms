package dayThree;
/**
 * @author mayoor
 *Java Program to sort the elements of an array in ascending order
 */
import java.util.Scanner;
public class ProblemNine 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter five elements of array:");
		int [] arr = new int [5];
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();}
//		sort operation for array
		    for (int i= 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	                if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp; } } }    
		  System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i= 0; i < arr.length; i++) {     
	      System.out.print(arr[i] + " ");
	      sc.close();}
	}
}