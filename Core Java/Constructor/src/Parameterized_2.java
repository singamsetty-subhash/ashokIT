//Parameterize Constructor with  Arguments
	 	class Exmp2{
			int x;
			int y;
			public Exmp2(int a, int b)
			{
				this.x=a;
				this.y=b;
			}
			public  void display()
			{
				System.out.println("X="+x);
				System.out.println("Y="+y);
			}
		}
public class  Parameterized_2  {

	public static void main(String[] args) {
				Exmp2 e1=new Exmp2(10,20);
				e1.display();
			}
}

	

