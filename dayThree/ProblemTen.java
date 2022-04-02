package dayThree;
/**
 * @author mayoor
 *Find 2nd Largest Number in an Array
 */
import java.util.Scanner;
public class ProblemTen 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		System.out.println("Enter elements of array");
		int [] arr = new int [n];
		int temp = 0;
			for (int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();}
//		operation for finding 2nd largest element of array	
					for (int i = 0; i < arr.length; i++) {     
						for (int j = i+1; j < arr.length; j++) {     
							if(arr[i] > arr[j]) {    
								temp = arr[i];    
								arr[i] = arr[j];    
								arr[j] = temp; } } }  
				  sc.close();
				  System.out.println("Second largest element of array " + arr[n-2]);
	}
}
