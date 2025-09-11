/*
 * Daimond Star pattern
 * 
 */
import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number for triangle");
		int n =scan.nextInt();
		Diamondstar(n);
		scan.close();


	}

	private static void Diamondstar(int n) {
	
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*(n-i);j++) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) 
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		 for( int i=2;i<=n;i++)
		 {
			 for(int j=2;j<=2*(i-1); j++)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=2*(n-i)+1;k++)
			 {
				 System.out.print("*"+ " ");
			 }
			 System.out.println();
		 }
		
	}

}
