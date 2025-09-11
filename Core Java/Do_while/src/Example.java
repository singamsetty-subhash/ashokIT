/*
 * JAVA PROJECT UDING DO WHILE LOOP BY SWITH
 */

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int choice;
	do {
		System.out.println("*****Menu*****");
		System.out.println("1.Addition");
		System.out.println("2.subtraction");
		System.out.println("3.exit");
		 choice = scan.nextInt();
		switch(choice) {
		case 1:System.out.println("enter 1 st number ");
			   int a= scan.nextInt();
			   System.out.println("enter 2 nd number ");
			   int b= scan.nextInt();
			   System.out.println("addition is"+(a+b));
			   break;
		case 2:System.out.println("enter 1 st number ");
		   int c= scan.nextInt();
		   System.out.println("enter 2 nd number ");
		   int d= scan.nextInt();
		   System.out.println("subtraction is"+(c-d));
		   break;
		}
		scan.close();
	}
	while(choice!=3);
	}
}
