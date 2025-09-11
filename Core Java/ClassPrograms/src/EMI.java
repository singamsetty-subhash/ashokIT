// calculate EMI  formula e=p*r*(1+r)^n/(1+r)^n -1;

import java.util.Scanner;

public class EMI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter principle amount");
		double p = scan.nextDouble();
		System.out.println("enter intrest per annum");
		double pa = scan.nextDouble();
		double r=pa/12/100;
		System.out.println("enter number of months need for emi ");
		int n = scan.nextInt();
		double x = Math.pow(1+r, n);
		double emi = p*r*x/x-1;
		System.out.println("emi amount should pay at every month is:"+emi);
		scan.close();

	}

}
