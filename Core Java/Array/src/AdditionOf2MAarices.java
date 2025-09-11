/*
 * addition of two matrices and storing it into another matrices by using 2 dimensional array
 */
public class AdditionOf2MAarices {

	public static void main(String[] args) {
		int[][] matrix1 = { { 2, 3, 1 }, { 4, 5, 6 }, { 2, 12, 4 } };
		int[][] matrix2 = { { 2, 3, 1 }, { 3, 6, 8 }, { 5, 4, 2 } };
		 
		 addmatrices(matrix1, matrix2);
	}

	private static void addmatrices(int[][] matrix1, int[][] matrix2) {
		System.out.println("matrix 1");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("matrix 2");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}

		int matrix3[][] = new int[matrix1.length][matrix1[0].length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("matrix 3 addition ");
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[i].length; j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
