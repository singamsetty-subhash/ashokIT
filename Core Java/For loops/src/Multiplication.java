/*
 * multiplication of table
 */

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number for table");
		int n =scan.nextInt();
		multiplication(n);
		scan.close();
	}

	private static void multiplication(int n ) {
	for(int i=1; i<=10; i++) {
		System.out.println(n+"x"+i+"="+(n*i));
	}
		
	}

}
