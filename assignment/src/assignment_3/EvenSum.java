package assignment_3;

public class EvenSum {

	public static void main(String args[]) {
		int i;
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of even numbers from 1 to 10 is: " + sum);
	}
}
