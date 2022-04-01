package dayTwo;
/**
 * @author mayoor
 *Write a Program to Check Vowel or Consonant
 */
import java.util.Scanner;
public class ProblemFourDotOne 
{
	public static void main(String[] args) 
	{
// 		store the input from the user
		System.out.println("Enter a letter");
		Scanner sc = new Scanner(System.in);
		char letter = sc.next().charAt(0);
		sc.close();
	switch (letter) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U': 
		System.out.println(letter + " is Vowel");
		break;
		default: System.out.println(letter + " is Consonant");}	
	}
}
		    
