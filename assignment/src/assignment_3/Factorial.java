package assignment_3;

public class Factorial {

	//static int number = 10;
	//static int fact = 1;

	public static int numberFactorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		int number = 10;
		int fact = numberFactorial(number);
		System.out.println("Factorial of " + number + " is " + fact);
	}

}
