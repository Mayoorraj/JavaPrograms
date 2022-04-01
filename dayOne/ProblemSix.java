package dayOne;
		/**
		 * @author mayoor
		 *Write a program to demonstrate static variables, methods, and blocks.
		 */
		public class ProblemSix {
//			static vairable
			static int a = 10;
//			static method
			static void method() {
				System.out.println("static method");
			}
//			static block
			static {
			System.out.println("Static block");
			}
//			calling static method in main[]
			public static void main(String args[]) {
			System.out.println("Main method");
			System.out.println(a);
			method();
	}
}
