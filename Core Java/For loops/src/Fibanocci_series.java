/*
 * WAJP TO PRINT N TERMS OF FIBINACCI SERIRS 
 * FIBANACCI SERIES---> FIRST TWO NUMBERS 0 AND 1 
 *                      NEXT TERMS IS SUM OF PREVIOUS TERMS 
 *  THE 5 TERMS OF FIBINOccI SERIRS ARE 0,1,1,2,3
 */

import java.util.Scanner;

public class Fibanocci_series {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number for fibinocci series ");
		int n =scan.nextInt();
		fibinoscci(n);
		scan.close();

	}

	private static void fibinoscci(int n) {
		int first_term=0,second_term=1;
				for(int i =1;i<=n;i++) {
					System.out.print(first_term+" ");
					int next_term=first_term+second_term;
					first_term=second_term;
					second_term=next_term;
				}
		
	}

}
