                    // foreign heat to celicus;
import java.util.Scanner;

public class ForeignHeat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter foreign heat value");
		 double f = scan.nextDouble();
		 double c = (f-32) * 5 / 9;
		 scan.close();
		 System.out.println("celcius value:" + c);
		 

	}

}
