import java.util.Scanner;

public class primecase1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		checkprime(n);
		scan.close();
	}

	private static void checkprime(int n) {
		 int count=0;
		 for(int i=1;i<=n;i++) {
			 if(n % i == 0 )
			 {
				 count++;
			 }
		 }
		if(count==2) 
			System.out.println(n+":is prime");
		else
			System.out.println(n+":is not a prime");
	}

}
