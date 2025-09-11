/*
 * write a program for char patterns
 * if n=5
 *        A
 *        A B
 *        A B C
 *        A B C D
 *        A B C D E
 */

import java.util.Scanner;

public class char_pattern {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number for lines");
		int n= scan.nextInt();
		printchar(n);
		scan.close();

	}

	private static void printchar(int n) {
		 for(int i=1;i<=n;i++)
		 {
			 for (char ch ='A';ch<='A'+i-1;ch++) {
				 System.out.print(ch+" ");
			 }
			 System.out.println();
		 }
		
	}

}
