/*
 * swaping of 2 strings
 */

import java.util.Scanner;

public class Swaping_Of_2_Strings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("enter String 1");//abc
		String str1= scan.nextLine();
		System.out.println("enter String 2");//xyz
		String str2= scan.nextLine();
		swap(str1,str2);
		scan.close();
		
		
	}

	private static void swap(String str1, String str2) {
		System.out.println("Before Swap");
		System.out.println("String 1="+str1);
		System.out.println("String 2="+str2);
		str1+=str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("After Swap");
		System.out.println("String 1="+str1);
		System.out.println("String 2="+str2);
	}
}
