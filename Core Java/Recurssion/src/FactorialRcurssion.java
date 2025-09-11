/*
 * finding Factorial using Recurssion
 */

import java.util.Scanner;

public class FactorialRcurssion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a numberto get factorial");
		int n=scan.nextInt();
		if(n<=0) {
			System.out.println("U must enter positive or 0");
			System.exit(1);
		}
		int result=factorial(n);
		System.out.println("factorial of "+n+"="+result);
		scan.close();
		
		
	}

	private static int factorial(int n) {
		if(n==0||n==1)
			return 1;
		else
			return n*factorial(n-1);
	}

}
