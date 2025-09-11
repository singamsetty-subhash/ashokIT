/*
 * sum of right and left diagonal
 * left i==j
 * right i+j=length-1
 *  

 */
public class SumOfLeftAndRightDiagonal {
	public static void main(String[] args) {
		int matrix1[][] = { { 2, 3,4 }, { 4, 5,6 }, { 6,7,8 } };
		sumofdiagonals(matrix1);
	}

	private static void sumofdiagonals(int[][] matrix1) {
		int left = 0, right = 1;
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				if (i == j)
					left +=matrix1[i][j];
				if (i + j == matrix1.length - 1)
					right += matrix1[i][j];

			}
		}
		System.out.println( "sum of left diagonal:"+left);
		System.out.println( "sum of right diagonal:"+right);
	}
}
