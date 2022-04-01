package dayOne;
/**
 * @author mayoor
 *find the sum of command-line arguments and count the invalid integers entered.
 */
public class ProblemFour {

	public static void main(String [] args){
//		defining sum of integers
		int sum = 0, count=0;
		System.out.println("Calculating Sum for command line Args Integers...");
//		summing the integer values present in command line args
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
//			identifying non integers with try and catch block;counting non integers
			try {
			sum = sum + Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
			count++;
			}
		}
		System.out.println("Sum :" + sum);
		System.out.println("count of non integers : "+ count);
	}
}
