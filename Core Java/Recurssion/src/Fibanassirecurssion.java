/*
 * fibanassi series using recurssion
 */

import java.util.Scanner;

public class Fibanassirecurssion {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter  terms  for fibanassi serious");
		int terms=scan.nextInt();
		for(int i=0;i<terms;i++) {
		int result=fibanassi(i);
		System.out.print(" "+result);
		}
		scan.close();
	}

	private static int fibanassi(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return fibanassi(n-1)+fibanassi(n-2);
	}

}
