/* 
 * write a java program to check  given number is spy number or not
 * spy= sum=product=given number
 */

import java.util.Scanner;

public class Spy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		boolean flag=SpyNumber(n);
		scan.close();
		if(flag==true) 
			System.out.println(n+":is a spy number");
		else
			System.out.println(n+ "is not a spy number");
		
			
		
	}

	private static boolean SpyNumber(int n) {
		int sum=0;
		int product=1;
		while(n>0)
		{
			int d = n%10;
			sum =sum+d;
			product =product * d;
			n=n/10;
		}
		if(sum==product)
			return true;
		else
			return false;
	}
}


