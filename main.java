package homework5.exe3;

public class main {
	static public void main(String[] args) {
//		try {
//			System.out.println(Calculator.divide(10, 0));
//		} catch (ArithmeticException e) {
//			System.out.println("You cannot divide by 0");
//		}
		System.out.println(Calculator.divide(10, 0));

	}

}


//Justification:
//
//The Calculator class should focus purely on the computation, not on error handling.
//
//It's more flexible: the caller (like main) can decide how to react (e.g., show an error, retry, log).
//
//Promotes separation of concerns: logic vs. UI or error handling.