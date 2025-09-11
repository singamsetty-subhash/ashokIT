/*
 * create HashSet class object
 * add array1 to HashSet 
 * Add array2 to HashSet
 * copy the elements  from HashSet to array3
 * display array3
 */

import java.util.HashSet;

public class Union_Approch2 {

	public static void main(String[] args) {
		int[] arr1= {2,3,4,5};
		int[] arr2= {6,5,4,7};
		int[] arr3= union(arr1,arr2);
		for(int k:arr3)
		{
			System.out.print(k+"  ");
		}
	}

	private static int[] union(int[] arr1, int[] arr2) {
		//creating HashSet object 
		HashSet <Integer> hashSet=new HashSet<>();
		//adding array1 to HashSet 
		for (int i:arr1)
		{
			hashSet.add(i);
		}
		//adding array2 to HashSet

		for(int i:arr2)
		{
			hashSet.add(i);
		}
		//creation of array 3
		int[] arr3= new int[hashSet.size()];
		int i=0;
		//coping values from HashSet
		for(int x:hashSet)
		{
			arr3[i]=x;
			i++;
		}
		return arr3;
	}

}
