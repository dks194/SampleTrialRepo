package assignment_3;

public class Average {

	public static void findAverage(int a, int b, int c) {
		int avgInt = (a + b + c) / 3;
		System.out.println("The average of integer numbers is :" + avgInt);
	}

	public static void findAverage(float a, float b, float c) {
		float avgflt = (a + b + c) / 3;
		System.out.println("The average of float numbers is :" + avgflt);
	}

	public static void main(String[] args) {
		findAverage(1, 2, 3);
		findAverage(12.5f, 2.6f, 3.1f);

	}

}
