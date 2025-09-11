class ClassA{
	private int x;
	private static int y;
	//constructor
	public ClassA(int x) {
		this.x=x;
		ClassA.y=100;
	}
	//static methos
	public static void m1() {
		//int c=x+y;//Static method cannot use instance variable so 
		int c=y+y;
		System.out.println(c);
	}
	//instance methos
	public void m2() {
		int c=x+y;//in instance method we can use both static and instance variable
		System.out.println(c);

	}
}
public class Method {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ClassA a=new ClassA(5);
		ClassA.m1();//calling  Static class with [class name. method name]
		a.m1();//calling  Static class with [object name. method name] here JVM internally
				//calls with class name
		a.m2();
	}

}
