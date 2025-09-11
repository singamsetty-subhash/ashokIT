/*
 * inverted right angle trianggle
 *
 * ex n=5
 *     * * * * *
 *     * * * *
 *     * * *
 *     * *
 *     *
 */

import java.util.Scanner;

public class InvertedRightAngle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number for inverted Right angle triangle triangle");
		int n =scan.nextInt();
		triangle(n);
		scan.close();

	}

	private static void triangle(int n) {
		 for(int i=1 ; i<=n ; i++)
		 {
			 for(int j=1 ; j<=n-i+1; j++ )
			 {
			   System.out.print("*"+" ");
			 }
			 System.out.println();
		 }
		
	}


}
