import java.util.Iterator;
import java.util.PriorityQueue;

public class ArrayBlockingQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		pq.add(20);
		pq.add(30);
		pq.add(15);
		pq.add(25);
		pq.add(32);
		Iterator<Integer>itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(pq.poll());
		}
		
	}

}
