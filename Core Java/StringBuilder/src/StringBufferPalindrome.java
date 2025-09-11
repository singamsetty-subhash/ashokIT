/*
 * To check given number is palindrome or not with out using  remove()
 */

import java.util.Scanner;

public class StringBufferPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a String to check palindrome or not");
		String str = scan.nextLine();
		palindrome(str);
		scan.close();

	}

	private static void palindrome(String str) {
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		if (str.equals(sb.toString()))
			System.out.println("given String is palindrome  " + str);
		else
			System.out.println("given String is not  palindrome  " + str);
	}

}
