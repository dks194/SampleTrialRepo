package assignment_3;

public class factorialOfNumber {

	public int getFactorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public void dispalyResult(int num) {
		int result = this.getFactorial(num);
		System.out.println("Factorial of the number : " + result);
	}

	public static void main(String[] args) {
		factorialOfNumber obj = new factorialOfNumber();
		obj.dispalyResult(10);
	}

}
