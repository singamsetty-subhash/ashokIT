/*
 * finding max  consecutively repeated number
 * ex {2,3,4,1,1,1,3,4,1,2,3,3,}
 * max consitevely repeated is 1.
 */
import java.util.Scanner;

public class Max_Consecutively_repeated {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of array");
		int size = scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter elementof index:"+i);
			arr[i]=scan.nextInt();
		}
		find_max(arr);
		scan.close();
	}

	private static void find_max(int[] arr) {
		int max=0,count=1,element=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
				count++;
			else 
				 count=1;
		
		if (count>max) {
			max=count;
			element=arr[i];
		}
	}
		System.out.println("element "+element+" is repated "+max+" times");
}}
