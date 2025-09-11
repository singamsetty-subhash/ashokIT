/*
 * string palidrome  by using string_Buffer
 */

import java.util.Scanner;

public class String_palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a String to check palindrome or not");
		String str = scan.nextLine();
		boolean flag = palindrome(str);
		
		if (flag==true)
			System.out.println("given String is palindrome  "+str);
		else
			System.out.println("given String is not  palindrome  "+str);
		scan.close();
	}

	private static boolean palindrome(String str) {
		str = str.toLowerCase();
		StringBuffer sb1 = new StringBuffer(str);
		StringBuffer temp = new StringBuffer(sb1);
		sb1.reverse();
		if (sb1.toString().equals(temp.toString())) {
			return true;
		} else
			return false;

	}

}
