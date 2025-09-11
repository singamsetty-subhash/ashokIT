/*
 * constructor and static blocks will execute when object is created first block is executed 
 * in order to declared  
 * and then constructor is called
 * how many times object called constructor is repeated but static block will print once in a program 
 */
class ClassB{
	private int x;
	private static int y;
	//constructor
	public ClassB(int x) {
		this.x=x;
		System.out.println("im from Constructor");
	}
	static {
		y=100;
		System.out.println("im from static Block1");
	}
	static {
		System.out.println("im from static Block2");
	}
	public void display()
	{
	System.out.println("Addition="+(x+y));

	}
}
public class Block {
	public static void main(String[] args) {
		ClassB a=new ClassB(5);
		a.display();
		ClassB b=new ClassB(15);
		b.display();
		ClassB c=new ClassB(55);
		c.display();
	
	}

}
