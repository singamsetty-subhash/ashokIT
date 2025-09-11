/*
* WRITE A PROGRAM TO TAKE THE TWO NUMBERS AS INPUT AND DO THE FOLLOWING
 * --> IF THE TWO NUMBERS ARE SAME THEN DISPLAY THE SUM OF THEM
 * --> IF THE TWO NUMBERS ARE DIFFERENT THEN DOUBLE  OF THEIR PRODUCT
 */

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first value");
		int a =scan.nextInt();
		System.out.println("Enter Second value");
		int b  =scan.nextInt();
		scan.close();
		 if (a==b)
			 System.out.println("sum of 2 numbers is:" + (a+b));
		 else
			 System.out.println("double of the product is"+ (2*(a*b)));
		
	}

}
