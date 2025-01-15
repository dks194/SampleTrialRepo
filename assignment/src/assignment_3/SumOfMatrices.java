package assignment_3;

public class SumOfMatrices {

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 5, 4 } };
		int[][] matrix2 = { { 6, 8, 5 }, { 4, 0, 7 }, { 4, 7, 9 } };
		int[][] result = new int[3][3];

		int rows = matrix1.length;
		int col = matrix1[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];

			}
		}
		System.out.println("Sum of matrices : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

}
