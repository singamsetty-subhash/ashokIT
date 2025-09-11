/*
 * java program for passcal triangle
 * if n=5 
 *                   1
 *                  1 1
 *                1  2  1
 *               1 3  3  1
 *              1 4  6  4 1
 *              
 *              back logic is we need to follow   n
 *													c		n!/r!*(n-r)!   ,   i=0;  i< logic
 *													  r =                  
 *                 */

import java.util.Scanner;

public class PasscalTrianle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number for triangle");
		int n =scan.nextInt();
		Pasccal(n);
		scan.close();

	}

	private static void Pasccal(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=1; j<=n-i-1 ; j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				int e=factroial(i)/(factroial(k)*factroial(i-k));
				System.out.print(e+" ");
			}
			System.out.println();
		}
		
	}

	private static int factroial(int i) {
		int fact=1;
		for(int x=1 ; x<=i;x++)
		{
			fact = fact*x;
		}
		return fact;
	}

}
