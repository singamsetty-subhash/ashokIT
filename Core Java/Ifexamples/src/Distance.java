/*
 * write a program to take distance vale as input and apply the following conditions to calculate the 
 * delevary fee
 * --> for the first 3 kilo meters free delevay
 * --> for the next 3 kilo meters RS 12 per kilo meter
 * --> for the remaining kilo meters RS 15 per kilo meter 
 */

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter distance");
		int a = scan.nextInt();
		scan.close();
		if(a<=3)
			System.out.println("free delivery");
		else if(a<=6) {
		     int delivery_fee = (a-3)*12;
			System.out.println("delevery fee is " + delivery_fee);
			}
		else {
			int delivery_fee = 3*12 + (a-6)*15;
			System.out.println("delevery fee is " + delivery_fee);
		}

		}
		

}
