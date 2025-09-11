
/*
/*
 * java program to reverse string
 * ex
 * 		the cat sat
 * o/p
 * 		eht tac tas
 */
import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.nextLine();
		 reverse(str);
		scan.close();
	}

	public static void reverse(String str) {
		str=str.toLowerCase();
		String[] arr = str.split(" ");
		StringBuilder sb2 = new StringBuilder();

		for (String i : arr) {
			StringBuilder sb = new StringBuilder(i);
			sb2.append(sb.reverse());
			sb2.append(" ");
		}

		String str2 = sb2.toString();
		System.out.println(str2);
	}
}
