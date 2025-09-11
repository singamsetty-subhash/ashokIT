/*
 * HolloStar Square Pattern
 * if n=5
 *            * * * * *
 *            *       *
 *            *		  *
 *            *       *
 *            * * * * *
 */
import java.util.Scanner;

public class HollowSquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number for triangle");
		int n =scan.nextInt();
		pattern(n);
		scan.close();
	}

	private static void pattern(int n) {
		 for (int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=n;j++)
			 {
				 if(i==1||i==n||j==1||j==n)
					 System.out.print("* ");
				 else
					 System.out.print("  ");
			 }
			 System.out.println();
		 }
		
	}

}
