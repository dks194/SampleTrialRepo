package assignment_3;

public class ArraySum {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int i;
		int sum = 0;
		for (i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

		}
		System.out.println("The sum of all the elements of the array is " + sum);
	}

}
