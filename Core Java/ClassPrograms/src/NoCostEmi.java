// prgm for no cost emi

import java.util.Scanner;

public class NoCostEmi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter principle amount");
		double p = scan.nextDouble();
		
		System.out.println("enter number of months need for emi ");
		int n = scan.nextInt();
	
		double emi = p/n;
		System.out.println("emi amount should pay at every month is:"+emi);
		scan.close();
		

	}

}
