/* 
 * linear search program
 */

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of array");
		int size = scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter elememt for index:"+i);
			arr[i]=scan.nextInt();
		}
		System.out.println("enter element to search");
		int se = scan.nextInt();
		linear_search(arr,se);
		scan.close();

	}
	private static void linear_search(int[] arr, int se) 
	{
	boolean flag= false;
	for(int i=0;i<arr.length;i++)	{
		if(arr[i]==se)
		{
			
		System.out.println("element found at index:"+i);
		flag=true;
		break;
		}
	}
	if (flag==false)
		System.out.println("element not found");
	}

}
