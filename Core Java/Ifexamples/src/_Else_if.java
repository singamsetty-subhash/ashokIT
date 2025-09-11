/*
 * write a program to take a number as input implements the following
 * --> if the number is divisible by 3 then print zip
 * --> if the number is divisible by 5 then print zap 
 * --> if the number is divisible by both 3 and 5 then print jar
 * --> other wise print rar
 */

import java.util.Scanner;

public class _Else_if {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first value");
		int a = scan.nextInt();
		scan.close();
		if (a % 3 == 0 && a % 5 == 0)
			System.out.println("jar");
		else if( a % 3 == 0)
			System.out.println("zip");
		else if(a % 5 == 0)
			System.out.println("zap");
		else
			System.out.println("rar");
		
	}

}
