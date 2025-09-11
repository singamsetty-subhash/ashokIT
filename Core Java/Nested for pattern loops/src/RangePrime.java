/*
 * finding prime numbers between numbers
 */

import java.util.Scanner;

public class RangePrime {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter upper boundry");
		int a = scan.nextInt();
		System.out.println("enter lower boundry");
		int b = scan.nextInt();
		findprime(a,b);
		scan.close();
		
	}

	private static void findprime(int a, int b) {
		for(int i=a;i<=b;i++) {
			boolean flag=true;
			for(int j=2;j<= Math.sqrt(i);j++)
			{
				if(i%j==0) 
				{
					flag=false;
					break;
				}
				
			}
			if(flag==true)
				System.out.println(i);
		}
		
	}

}
