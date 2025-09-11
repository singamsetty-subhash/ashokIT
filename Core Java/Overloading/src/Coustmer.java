//parent Class
public class Coustmer {
	private String item;
	private int qty;
	private double price;
	public Coustmer(String item, int qty, double price) {
		super();
		this.item = item;
		this.qty = qty;
		this.price = price;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	void calculate_bill()
	{
		double amount=price*qty;
		System.out.println("item: "+item);
		System.out.println("quantity: "+qty);
		System.out.println("amount"+amount);
	}
}
