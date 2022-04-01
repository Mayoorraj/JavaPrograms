package dayOne;
import java.util.Scanner;
/**
 * @author mayoor
 * checking for similarity between strings
 */
public class ProblemThree {
	
		public static void main(String[] args) {
//			declaring strings
			String str1, str2;
//			reading strings from user
			Scanner sc = new Scanner(System.in);
	         	System.out.println("Enter first String");
	        str1 = sc.nextLine();
	        	System.out.println("Enter second String");
	        str2 = sc.nextLine();
	        sc.close();
//			checking strings ignoring the case        
	         if (str2.equalsIgnoreCase(str1)) 
	            System.out.print("strings are same");
	            else
	            System.out.print("strings are not same");
		}
	}

