/*
 * Java program to count of vowels and Consounts
 */

import java.util.Scanner;

public class VowelsAndConsountsCount {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a string");
		String str=scan.nextLine();
		count(str);
		scan.close();
		
	}

	private static void count(String str) {
		int vowel=0,consonent=0;
		str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isLetter(ch))
			{
				if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vowel++;
				else
					consonent++;
     		}
		}
		System.out.println("vowels="+vowel);
		System.out.println("consonents="+consonent);
		
	}

}
