import java.util.Scanner;

public class Prime_Case_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		checkprime(n);
		scan.close();
	}
private static void checkprime(int n) {
	boolean flag=true;
	for(int i=2; i<=n; i++) {
		if(n%i==0) {
			 flag=false;
		      break;
		}
	}
	if(flag==true)
		System.out.println(n+"is prime");
	else 
		System.out.println(n+ "is not prime");
}
}
