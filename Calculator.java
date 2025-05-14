package homework5.exe3;

public class Calculator {
	 public static double divide(int a, int b){
			try {
				return a / b;
			} catch (ArithmeticException e) {
				System.out.println("you cannnot divide by 0");
				return 1;
			}

		 
//		 return a / b;
		}
	

}
//The parameters must be of type int, because dividing by 0 only throws an ArithmeticException when using integers.
//If the parameters are of type double, Java does not throw an exception, instead it returns Infinity when dividing by 0.