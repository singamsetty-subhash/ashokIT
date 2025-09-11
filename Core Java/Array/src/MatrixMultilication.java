/*
 * matrix multiplication
 */
public class MatrixMultilication {

	public static void main(String[] args){
		int arr1[][]= {{2,3},{1,1},{0,2}};
		int arr2[][]= {{0,0},{4,5}};
		multiply(arr1,arr2);
		
	}

	private static void multiply(int[][] arr1, int[][] arr2) {
		int[][] arr3=new int[arr1.length][arr2[0].length];
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				int r=0;
				for(int k=0;k<arr3[0].length;k++)
				{
					r=r+arr1[i][k]*arr2[k][j];
				}
					arr3[i][j]=r;
				}
			}
			for(int i=0;i<arr3.length;i++) {
				for(int j=0;j<arr3[i].length;j++) {
					System.out.print(arr3[i][j]);
				}
				System.out.println();
				
			}
				}
		
	}


