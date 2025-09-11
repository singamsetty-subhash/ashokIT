/*
 * write a java code for below code
 * if n=5
 *                A
 *              B A
 *            C B A
 *          D C B A
 *        E D C B A   
 */

import java.util.Scanner;

public class reversechar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number for lines");
		int n=scan.nextInt();
		printpattern(n);
		scan.close();

	}

	private static void printpattern(int n) {
		for(int i=1; i<=n; i++)
		{
			for(int j=1;j<=2*(n-i);j++)
			{
				System.out.print(" ");
			}
			for (char ch=(char)('A'+i-1);ch>='A';ch--)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		
	}

}
