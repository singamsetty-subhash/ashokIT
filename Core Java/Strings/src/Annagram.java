/*
 * java program to check given string is anagram or not
 */

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("enter String 1");
		String str1= scan.nextLine();
		System.out.println("enter String 2");
		String str2= scan.nextLine();
		boolean flag=check_anagarm(str1,str2);
		if(flag==true)
			System.out.println("anagram");
		else
			System.out.println("not a anagram");
		scan.close();
	}

private static boolean check_anagarm(String str1, String str2) {
		if(str1.length()!= str2.length())
			return false;
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean flag=true;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				flag=false;
				break;
			}
		}
		
		return flag;
		
	}

}
