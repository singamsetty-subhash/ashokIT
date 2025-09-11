
public class Loop {

	public static void main(String[] args) {
		int i=1;
		for(;;)
		{
			System.out.println("i="+i);
			i++;
			if(i>3)
				break;
		}
		
		//System.out.println("i"+i);	
		

	}

}
