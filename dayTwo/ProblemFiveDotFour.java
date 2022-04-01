package dayTwo;
/**
 * @author mayoor
 *rite a program Distance.java that takes two integer command-line arguments x and y and 
 *prints the Euclidean distance from the point (x, y) to the origin (0, 0). 
 *The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 */
public class ProblemFiveDotFour 
{
	public static void main(String[] args) 
	{
		int x2 = Integer.parseInt(args[0]);
		int y2 = Integer.parseInt(args[1]);
//		defining other point coordinates
		int x1 = 0;
		int y1 = 0;
		int a =x2-x1;
		int b =y2-y1;
		int sq = 2;
//		Euclidean distance
		double distance = Math.sqrt((Math.pow(a, sq)) + (Math.pow(b, sq)));
		System.out.println("Euclidean distance is " + distance);
	}
}
