class Employee{
	private int eno;
	private String ename;
	private double sal;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}
public class Example {

	public static void main(String[] args) {

		Employee e1=new Employee();
		e1.setEno(11);
		e1.setEname("Subhash");
		e1.setSal(55000.0);
		System.out.println("employee number="+e1.getEno());
		System.out.println("employee name="+e1.getEname());
		System.out.println("employee Salary="+e1.getSal());
		System.out.println("-----------------------");
		Employee e2=new Employee();
		e2.setEno(12);
		e2.setEname("Raja");
		e2.setSal(65000.0);
		System.out.println("employee number="+e2.getEno());
		System.out.println("employee name="+e2.getEname());
		System.out.println("employee Salary="+e2.getSal());

	}

}
