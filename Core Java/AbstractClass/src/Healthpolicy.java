
public class Healthpolicy extends Policy {
	private boolean issmoker;
	private int age;
	public Healthpolicy(int policyid, double premimumamount, boolean issmoker, int age) {
		super(policyid, premimumamount);
		this.issmoker = issmoker;
		this.age = age;
	}
	
	@Override
	public  double calcutale_riskfactor()
	{
		double riskfactor;
		if(age>=60&&issmoker==true)
			riskfactor=getPremimumamount()*0.60;
		else if(age<60 && issmoker==true)
			riskfactor=getPremimumamount()*0.30;
		else
			riskfactor=getPremimumamount()*0.10;
		return riskfactor;	
	}
}