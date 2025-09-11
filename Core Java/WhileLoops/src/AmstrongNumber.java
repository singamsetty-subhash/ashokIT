
/*
* Armstrong number=
* 
* if n=153
*      3     3    3
*     1  +  5  + 3   =1+125+27=153
*         
*/

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
	boolean flag=	checkArmstrong(n);
		scan.close();
		// System.out.println(n);
		if(flag==true)
			System.out.println(n + " is amstrong number");
		else
			System.out.println(n + " is not a  amstrong number");


	}

	private static boolean checkArmstrong(int n) {
		int sum = 0;
		String str = String.valueOf(n);
		int length = str.length();
		int temp = n;
		while (n > 0)
		{
			int d = n % 10;
			sum =sum + (int) Math.pow(d, length);
			n = n / 10;
		}
		if (sum == temp)
			return true;
		else
			return false;

	}
}
