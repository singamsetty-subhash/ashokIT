//java program using Static variable 
class Student{
	 private int sno;//Instance variable
	 private String sname;//Instance variable
	 private static String collegeName;//static variable
	 public Student(int sno,String sname)
	 {
		 this.sno=sno;//local variable
		 this.sname=sname;//local variable
		 Student.collegeName="Kits Akshar Institute Of Technology";
	 }
	 public void display()
	 {
		 System.out.println("student No : "+sno);
		 System.out.println("student Name : "+sname);
		 System.out.println("student  college  : "+collegeName);
	 }
}
 
public class Main {

	public static void main(String[] args) {
		Student s1=new Student(58,"Subhash");
		Student s2=new Student(30,"Raja");
		Student s3=new Student(02,"Bindu");
		s1.display();
		System.out.println("----------------------------------------------------------");
		s2.display();
		System.out.println("----------------------------------------------------------");
		s3.display();
	}

}
