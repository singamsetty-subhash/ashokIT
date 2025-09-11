//Default Constructor
class Example{
	int x;
	int y;
	public  void display()
	{
		System.out.println("X="+x);
		System.out.println("Y="+y);
	}
}
public class Default_Constructor {

	public static void main(String[] args) {
		Example e1=new Example();
		e1.display();
	}

}
