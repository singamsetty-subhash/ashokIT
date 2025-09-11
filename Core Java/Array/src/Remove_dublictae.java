/*
 * java program to remove duplicate elements
 * 
 */
public class Remove_dublictae {

	public static void main(String[] args) {
		int[] arr= {4,3,4,2,1,3,4,5};
		remove(arr);
	}

	private static void remove(int[] arr) {
		int[] newarr= new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=0;j<newarr.length;j++)
			{
				if(arr[i]==newarr[j])
				{
					flag=true;
					break;
				}
			}
		
			if(flag==false)
			{
			 newarr[count]=arr[i];
				count++;
			}
		}
		System.out.println("orginal array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("After removing dublicates");
		for(int i=0;i<count;i++)
		{
			System.out.print(newarr[i]+" ");
		}
	}

}
