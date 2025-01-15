package assignment_3;

public class Fibanocci {

	public static void printFibanocci(int n) {
		int previous = 0;
		int next = 1;
		for (int i = 0; i < n; i++) {
			System.out.println(previous);
			int newNext = next;
			next = next + previous;
			previous = newNext;
		}

	}

	public static void main(String[] args) {
		printFibanocci(6);
	}

}
