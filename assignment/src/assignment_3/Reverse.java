package assignment_3;

public class Reverse {

	int num;

	public Reverse(int num) {
		this();
		this.num = num;
		int reverse = 0;
		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse : " + reverse);
	}

	public Reverse() {
		System.out.println("Finding reverse...... ");
	}

	public static void main(String[] args) {
		Reverse obj = new Reverse(15345);
	}
}
