class Student
{
	private int sno;
	private String sname;
	private static String college;
	public Student(int sno,String sname)
	{
		this.sno=sno;
		this.sname=sname;
		Student.college="kits";
	}
	public void display() {
		System.out.println("student No: "+sno);
		System.out.println("student Name: "+sname);
		System.out.println("College Name: "+college);
	}
	
}
public class Keyword {

	public static void main(String[] args) {
		Student s1=new Student(58,"subhash");
		s1.display();
	}

}
