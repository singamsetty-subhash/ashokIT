//child Class
public class PremimumCoustmer extends Coustmer{
	private int redumpoints;

	public PremimumCoustmer(String item, int qty, double price, int redumpoints  ) {
		super(item, qty, price);
		this.redumpoints = redumpoints;
	}

	public int getRedumpoints() {
		return redumpoints;
	}

	public void setRedumpoints(int redumpoints) {
		this.redumpoints = redumpoints;
	}
	@Override
	void calculate_bill()
	{
		double amount=getPrice()*getQty()-redumpoints*100;
		System.out.println("item: "+getPrice());
		System.out.println("quantity: "+getQty());
		System.out.println("redumpoints: "+redumpoints);
		System.out.println("amount"+amount);
	}
}
