package assignment_3;

import java.util.Scanner;

public class VotingEligibility {

	public static boolean isEligible(int age) {

		return age >= 18;
	}

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int age = scanner.nextInt();*/
		int age = 15;
		

		if (isEligible(age)) {
			System.out.println("The person is eligible for voting");
		} else {
			System.out.println("The person is not eligible for voting");
		}

	}

}
