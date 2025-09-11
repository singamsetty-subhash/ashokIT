 /*
  * BIGGEST OF 3 NUMBERS USING NESTED IF CONDITIONS
 */

import java.util.Scanner;

public class BiggestOf3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a value");
		int a = scan.nextInt();
		System.out.println("enter b value");
		int b = scan.nextInt();
		System.out.println("enter c value");
		int c = scan.nextInt();
		scan.close();
		if(a>b) {
			if(a>c)
				System.out.println(a+"big:");
			else
				System.out.println(c+"big:");
			
		}
		else
		{
			if(b>c)
				System.out.println(b +"big:");
			else
				System.out.println(c + " big:");
			
		}
		
	}

}
