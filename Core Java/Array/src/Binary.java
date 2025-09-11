/*
 * binary search
 * 1.sort array in assending order
 * 2. initalize low and high variables
 *  calculate mid value 
 *  (mid=(low+high)/2)
 *  if search element is > mid >>>low=mid+1
 *  if search elememt is <mid >>> high =mid-1
 *  if element == mid display element found
 *  if low> high display elememt not found
 *   
 */

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter element for inder" + i);
			arr[i] = scan.nextInt();
		}
		System.out.println("enter searching element");
		int se = scan.nextInt();
		binary_search(arr, se);
		scan.close();
	}

	private static void binary_search(int[] arr, int se) {
		Arrays.sort(arr);
		int high = arr.length - 1, low = 0;
		boolean flag = false;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (se > arr[mid]) {
				low = mid + 1;
			} else if (se < arr[mid]) {
				high = mid - 1;
			} else {
				System.out.println("element found");
				flag = true;
				break;
			}
		}

		if (flag != true) {
			System.out.println("element not found");

		}
	}
}
