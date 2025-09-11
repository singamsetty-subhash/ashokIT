/*
 * PERFECT NUMBER
 */
import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		check_perfect(n);
		scan.close();
	}

	private static void check_perfect(int n ) {
		int sum=0;
		for(int i=1; i<=n/2 ; i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n)
			System.out.println(n+":perfect number");
		else
			System.out.println(n+":not perfect number");
	}

}
