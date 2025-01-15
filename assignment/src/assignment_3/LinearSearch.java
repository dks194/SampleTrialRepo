package assignment_3;

public class LinearSearch {
	public static int linear(int[] array, int searchElement) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == searchElement) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 10, 27, 98, 45 };
		int searchElement = 27;
		int result = linear(array, searchElement);

		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index: " + result);
		}

	}

}
