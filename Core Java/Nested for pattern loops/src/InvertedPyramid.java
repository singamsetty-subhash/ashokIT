/*
 * Inverted pyramid 
 */

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number for triangle");
		int n =scan.nextInt();
		triangle(n);
		scan.close();
	}

	private static void triangle(int n) {
		for(int i=1; i<=n ; i++)
		{
			for (int j=1 ; j<=2*i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*(n-i)+1;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
