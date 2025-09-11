/*
 * Finding sum of natural numbers
 */

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number");
	int n = scan.nextInt();
	sum(n);
	scan.close();
	}

	private static void sum(int n) {
	int sum=0;
	for (int i=1 ; i<=n ; i++ ) {
		sum=sum+i;
	}
	System.out.println("sum" + sum);
}
}
