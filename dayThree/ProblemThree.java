package dayThree;
/**
 * @author mayoor
 *Java Program to print the largest element in an array
 */
import java.util.Scanner;
public class ProblemThree 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter five elements of array: "); 
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        int max = arr[0];
        for (int i=0; i<arr.length; i++) {
        	arr [i] = sc.nextInt();}
//		Compare elements of array with max  to define largest element
        	for (int i = 0; i<arr.length; i++) {  
        		if (arr[i] > max)  
        			max = arr[i]; 
        sc.close();}  
        System.out.println("Largest element in given array is " + max);  
	}
}
