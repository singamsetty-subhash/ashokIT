class MyThread1 extends Thread{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++) {
			System.out.println("i="+i);
			try {
			Thread.sleep(2000);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
class MyThread2 implements Runnable{
	@Override
	public void run()
	{
		for(int j=11;j<=20;j++) {
			System.out.println("j="+j);
			try {
			Thread.sleep(2000);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		t1.start();
		Thread t2=new Thread(new MyThread2());
		t2.start();
		
	}

}
