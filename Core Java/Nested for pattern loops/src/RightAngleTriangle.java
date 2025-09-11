/*
 * right  angle triangle program
 */

import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number for  right angle triangle triangle");
		int n =scan.nextInt();
		triangle(n);
		scan.close();

	}

	private static void triangle(int n) {
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("*"+" ");
			 }
		 System.out.println();
		 }
		
	}

}
