
/*
* strong number=
* 
* if n=145
*     1 ! +  4 ! + 5 !  =1+24+120=153
*         
*/

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
	boolean flag=	Strong(n);
		scan.close();
		// System.out.println(n);
		if(flag==true)
			System.out.println(n + " is  a Strong number");
		else
			System.out.println(n + " is not a  strong number");


	}

	private static boolean Strong(int n) {
		int sum = 0;
		int temp = n;
		while (n != 0)
		{
			int fact =1;
			int d = n % 10;
			for(int i=1;i<=d;i++)
			{
				fact=fact*i;
			}
			sum+=fact;
			n = n / 10;
		}
		if (sum == temp)
			return true;
		else
			return false;

	}
}
