import java.util.Scanner;
import java.lang.Math;
public class Power_ab {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter a value");
		 int a = scan.nextInt();
		 System.out.println("enter b value");
		 int b = scan.nextInt();
		 scan.close();
		 double c = Math.pow(a,b);
		 System.out.println(c);
	}

}
