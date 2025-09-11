/*
 * intersection of 2 arrays
 */

import java.util.HashSet;

public class Intersection {

	public static void main(String[] args) {
		int[] arr1 = { 3, 4, 5, 6, 3 };
		int arr2[] = { 3, 6, 7 };
		intersrction_(arr1, arr2);

	}

	private static void intersrction_(int[] arr1, int[] arr2) {
		// creating HashSet object
		HashSet<Integer> hashSet = new HashSet<>();
		// adding array1 to HashSet
		for (int k : arr1)
		{
			hashSet.add(k);
		}
		for(int k:arr2)
		{
			if(hashSet.contains(k)) {
				System.out.print(k+" ");
				
			}
		}
	}

}
