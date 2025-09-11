/*
 * frequency of repeated characters in given String frequency
 */

import java.util.Arrays;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("enter String ");
		String str= scan.nextLine();
		find_frequency(str);
		scan.close();
	}

	private static void find_frequency(String str) {
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++)
		{
			int j;
			int count=0;
			for(j=i;j<ch.length;j++)
			{
				if(ch[i]!=ch[j])
				{
					i=j-1;
					break;
				}
				else
				{
					count++;
				}
			}
			System.out.println(ch[i]+"--"+count);
			if(j==ch.length)
				break;
		}
	}

}
