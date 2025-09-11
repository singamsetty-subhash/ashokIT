/*
 * write a program to find the sum of given numbers
 * ex 158
 *    1+5+8=14
 */

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		printsum(n);
		scan.close();
	}

	private static void printsum(int n) {
		int sum=0;
		while(n!=0) {
		int d = n % 10;
		sum+=d;
		n=n/10;
		}
		System.out.println(sum+": sum of given numbers");
		
	}

}
