package dayThree;
/**
 * @author mayoor
 *Java Program to print the smallest element in an array
 */
import java.util.Scanner;
public class ProblemFour 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter five elements of array: ");
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		for (int i=0; i<arr.length; i++) {
			arr [i] = sc.nextInt();}
//		Compare elements of array with min for defining smallest element
		int min = arr[0];
			for (int i = 0; i<arr.length; i++) {
				if (arr[i] < min)
				min = arr[i];
		sc.close();}
		System.out.println("Smallest element of given array is " + min);
	}
}
