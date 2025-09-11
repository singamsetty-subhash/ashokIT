
public class Main {

	public static void main(String[] args) {
		Coustmer c=new Coustmer("mobile",1,9999.0);
		c.calculate_bill();
		System.out.println("--------------------------");
		PremimumCoustmer pc =new PremimumCoustmer("Bags",2,5999.0,89);
		pc.calculate_bill();
	}

}
