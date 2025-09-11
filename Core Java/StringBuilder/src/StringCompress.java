/*
 * String comaarision 
 * ex  abbbcde
 *     a1b3c1d1e1
 * 
 */

import java.util.Scanner;

public class StringCompress {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string to compress");
		String str = scan.nextLine();
		String result = compress(str);
		System.out.println("After compress "+result);
		scan.close();
	}

	private static String compress(String str) {
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
					count++;
			} else {
				sb.append(str.charAt(i)).append(count);
				count = 1;
			}

		}
		return sb.toString();

	}
}
