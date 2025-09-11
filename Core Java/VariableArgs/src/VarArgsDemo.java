class SomeClass{
	static void add(int...x)
	{
		int sum=0;
		/*for(int i=0;i<x.length;i++) {
			sum+=x[i];
		}*/
		for(int y:x )
		{
			sum=sum+y;
		}
		System.out.println(sum);
	}
}
public class VarArgsDemo {

	public static void main(String[] args) {
		SomeClass.add(10,20,30,40);
	}

}
