// celsius to foreign heat

import java.util.Scanner;

public class CelsiusHeat {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.print("enter celsius heat value:");
      double  c = scan.nextDouble();
      double f = (c*9)/5+32;
      System.out.println("foreign heat value " + f);
        scan.close();
        
	}

}
