import java.util.Scanner;

public class prime_Between_Years {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int syear=scan.nextInt();
		int eyear=scan.nextInt();
		scan.close();
		        System.out.println("Prime years between "+syear+"and "+eyear+ "are:");
		        for (int year = syear; year <= eyear; year++) {
		            if (isPrime(year)) {
		                System.out.println(year);
		            }
		        }
		    }

		    public static boolean isPrime(int number) {
		        if (number <= 1) 
		        	return false;
		        for (int i = 2; i <= Math.sqrt(number); i++) {//We only need to check up to the square root because if a number has a factor larger than its square root, the other factor must be smaller.
		            if (number % i == 0)
		                return false;
		        }
		        return true;
		    }
		

}


