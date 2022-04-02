package dayThree;
/**
 * @author mayoor
 *Java Program to print the elements of an array
 */
public class ProblemOne 
{
	public static void main(String[] args) 
	{
//		Initialize array  
        int [] arr = new int [] {9, 5, 3, 7, 5};  
        System.out.println("Elements of given array: ");  
//		Loop through the array by incrementing value of i  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");}  
	}
}