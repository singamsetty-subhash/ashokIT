//parentClass
abstract public class Policy {
	private int policyid;
	private double premimumamount;
	public Policy(int policyid, double premimumamount) {
		super();
		this.policyid = policyid;
		this.premimumamount = premimumamount;
	}
	public abstract double calcutale_riskfactor();
	public void calculate_finalamount()
	{
		double riskfactor= calcutale_riskfactor() ;
		 double finalamount=premimumamount+riskfactor;
		System.out.println("primium amount= "+riskfactor);
		System.out.println("Base premium= "+premimumamount);
		System.out.println("final amount= "+finalamount);
		
	}
	
	
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public double getPremimumamount() {
		return premimumamount;
	}
	public void setPremimumamount(double premimumamount) {
		this.premimumamount = premimumamount;
	}

}
