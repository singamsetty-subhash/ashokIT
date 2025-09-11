//prgm for power of a^b^c
import java.util.Scanner;

public class Power_abc {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("enter a value");
		int a = scan.nextInt();
		System.out.println("enter b value");
		int b = scan.nextInt();
		System.out.println("enter c value");
		int c = scan.nextInt();
		scan.close();
		double d = Math.pow(b, c);
		double e = Math.pow(a, d);
		System.out.println(e);
	}

}
