package dayThree;
/**
 * @author mayoor
 *Java Program to print the elements of an array in reverse order
 */
import java.util.Scanner;
public class ProblemSix 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter five elements of array");
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		for (int i=0; i<arr.length; i++) {
			arr[i]  = sc.nextInt();}  
//		reverse array operation
		System.out.println("Array in reverse order");
		for (int i=arr.length-1; i>=0; i-- ) {
		System.out.println(arr[i] + " ");}
		sc.close();
	}
}