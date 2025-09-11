/* 
 * Java program for inverted right angle
 */

import java.util.Scanner;

public class InvertedLeftAngle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number for triangle");
		int n =scan.nextInt();
		triangle(n);
		scan.close();

	}
	private static void triangle(int n) {
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=2*i-i; j++)
			{
				System.out.print("");
			}
			for(int k=1;k<=n-i+1; k++) 
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
