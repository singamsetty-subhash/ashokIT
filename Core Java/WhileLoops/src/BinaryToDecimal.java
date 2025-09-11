/*
 * binary to decimal conversion
 */

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		scan.close();
		check_decimal(n);

	}


	private static void check_decimal(int n) {
		int i=0,sum=0;
		while(n>0) {
		int d=n%10;
		int t=d*(int)Math.pow(2, i);
		sum=sum+t;
		i++;
		n/=10;
		}
		System.out.println("Decimal numner is:"+sum);
	}

}
