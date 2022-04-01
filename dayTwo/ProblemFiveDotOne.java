package dayTwo;
/**
 * @author mayoor
 *Enter two numbers and do the following arithmetic Operations find max and min.
i) a+b*c ii) c+a/b
iii) a%b+c iV) a*b+c
 */
import java.util.Scanner;
public class ProblemFiveDotOne {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		System.out.println("Enter the value of c");
		int c = sc.nextInt();
		sc.close();
//		to perform operations
		int opr1 = a+b*c;
		int opr2 = c+a/b;
		int opr3 = a%b+c;
		int opr4 = a*b+c;
		System.out.println(opr1 + " " + opr2 + " " + opr3 + " " + opr4 );
//		to define the maximum operation value
		if (opr1 > opr2 && opr1 > opr3 && opr1 > opr4)
			System.out.println(opr1 + " is max operation value");
		else if (opr2 > opr1 && opr2 > opr3 && opr2 > opr4)
			System.out.println(opr2 + " is max operation value");
		else if (opr3 > opr1 && opr3 > opr2 && opr3 > opr4)
			System.out.println(opr3 + " is max operation value");
		else if (opr4 > opr1 && opr4 > opr2 && opr4 > opr3)
			System.out.println(opr4 + " is max operation value");
//		to define the minimum operation value
		if (opr1 < opr2 && opr1 < opr3 && opr1 < opr4)
			System.out.println(opr1 + " is min operation value");
		else if (opr2 < opr1 && opr2 < opr3 && opr2 < opr4)
			System.out.println(opr2 + " is min operation value");
		else if (opr3 < opr1 && opr3 < opr2 && opr3 < opr4)
			System.out.println(opr3 + " is min operation value");
		else if (opr4 < opr1 && opr4 < opr2 && opr4 < opr3)
			System.out.println(opr4 + " is min operation value");
	}
}
