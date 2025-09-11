/*
 * write a prgm to take 3 sides of a trianfle as input and do the fgollowing
 * --> first check 3 sides can form a triangle or not
 * --> if yes, then verify 3 sides can from which type of triangle
 *      (equilaterial, isoseceles,scalane)
 *      --> if all 3 sides are equal then it is equilaterial triangle
 *      -->if any 2 sides are equal then it is isosceles triangle 
 *      -->if 3  sides are different  then it is scalane triangle 
 */

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first side");
		int s1 = scan.nextInt();
		System.out.println("enter second value");
		int s2 = scan.nextInt();
		System.out.println("enter third value");
		int s3 = scan.nextInt();
		scan.close();
		if (s1+s2>s3 && s2+s3>s1 && s1+s3>s2)
		{
		 if(s1==s2 && s2==s3 )
			 System.out.println("equleteral triangle");
		 else if(s1==s2 || s2==s3 || s3==s1)
			 System.out.println("isoseles triangle");
		 else
			 System.out.println("scalen triangle");
		}
		else
			System.out.println("given sides cannot find triangle");

	}

}
