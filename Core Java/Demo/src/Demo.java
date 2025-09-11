//import java.util.Scanner;
//
//public class Demo {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d=scan.nextDouble();
//        scan.nextLine();
//        String str=scan.nextLine();
//
//        scan.close();
//    
//                        System.out.println("String"+str);
//                        System.out.println( "Double"+d);
//                        System.out.println("Int:"+i);
//    }
//}
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Consume the leftover newline
        String str = scan.nextLine(); // Corrected "string" to "String"

        scan.close();

        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
