/*
 * Java program to remove duplicates from 
 */

import java.util.Scanner;

public class Delete_dublicates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a String to ");
		String str = scan.nextLine();
		String str2=removoe(str);
		System.out.println(str2);
		scan.close();

	}

	private static String removoe(String str) {
		str=str.toLowerCase();
		StringBuilder sb=new StringBuilder();
		boolean arr[]=new boolean[256];
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(arr[ch]==false) {
				sb.append(ch);
				arr[ch]=true;
			}
				
		}
		return sb.toString();
		}


}
