/*
 * Bubble sort
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {14,3,4,55,12,5};
		bubble(arr);
	}

	private static void bubble(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" s");
			}
		
			}
		
	}


