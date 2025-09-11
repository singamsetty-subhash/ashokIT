/*
 * write a java program for palindrome number 
 * formula   reverse=reverse*10+d;
 * 121=121:palidrome number
 */

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a Number");
		int n =scan.nextInt();
		boolean flag= checkPalindrome(n);
		scan.close();
		if(flag==true)
			System.out.println(n+":is palandrome number");
		else
			System.out.println(n+":is not an palandrome number");

	}

	private static boolean checkPalindrome(int n) {
		int temp=n;
		int reverse=0;
		while(n>0) {
			int d=n%10;
			reverse = reverse*10+d;
			n=n/10;
		}
		if(temp==reverse)
			return true;
		else
			return false;
	}

}
