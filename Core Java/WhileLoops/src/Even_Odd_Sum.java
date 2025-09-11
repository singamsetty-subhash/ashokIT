/*
 * sum of given number is divided by even and odd
 * if 1324
 * 			even 2+4=6
 * 			odd  1+3=4 
 */
import java.util.Scanner;

public class Even_Odd_Sum {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		printsum(n);
		scan.close();

	}

private static void printsum(int n) {
		int even_sum=0;
		int odd_sum=0;
		while(n!=0) {
		int d = n % 10;
		if(n%2==0)
			even_sum+=d;
		else
			odd_sum+=d;
		n=n/10;
		}
		System.out.println(even_sum+": sum of  even given numbers");
		System.out.println(odd_sum+":sum of odd given numbers");
	}

	}


