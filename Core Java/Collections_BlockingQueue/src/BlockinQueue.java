import java.util.concurrent.ArrayBlockingQueue;

class Thread1 extends Thread{
	ArrayBlockingQueue<Integer>abq;
	

	public Thread1(ArrayBlockingQueue<Integer> abq) {
		super();
		this.abq = abq;
	}
	@Override
	public void run() {
		System.out.println("Inside:"+Thread.currentThread().getName());
		for(int i=1;i<=6;i++) {
			try {
				if(i==6) {
					System.out.println("Element Removed:"+abq.take());
				}
				abq.put(i);
				System.out.println("elment put is:"+i);
				}
			catch(Exception ex) {
				System.out.println(ex);
			}
	}
		System.out.println("Finished:"+Thread.currentThread().getName());
}
}
	public class BlockinQueue extends Thread{
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer>abq=new ArrayBlockingQueue<>(5);	
		Thread1 t1=new Thread1(abq);
		t1.start();
	}
}
