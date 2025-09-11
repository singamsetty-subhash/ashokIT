/*
 * sum of array
 */

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Size of an array");
		int size=scan.nextInt();
		int[] arr=new int[size];
				for(int i=0;i<arr.length;i++) {
					System.out.println("enter number for array index:"+ i);
					arr[i]=scan.nextInt();
				}
		findsum(arr);
		scan.close();
	}

	private static void findsum(int[] arr) {
		int sum=0;
		for(int j=0;j<arr.length;j++) {
			sum+=arr[j];
		}
		System.out.println("sum="+sum);
	}

}
