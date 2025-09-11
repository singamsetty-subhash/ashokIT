/*
 * java program to check palindrome String
 */

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("enter String ");
		String str= scan.nextLine();
		boolean flag = palindrome(str);
		if(flag==true)
			System.out.println("palindrome");
		else
			System.out.println("not a plaindrome");
		scan.close();
		
	}

	private static boolean palindrome(String str) {
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		boolean flag= true;
		for(int i=0,j=ch.length-1;i<j;i++,j--)
		{
			if(ch[i]!=ch[j])
			{
				flag= false;
			}
		}
		return flag;
	}

}
