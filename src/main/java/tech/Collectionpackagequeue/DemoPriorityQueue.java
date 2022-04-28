package tech.Collectionpackagequeue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		Queue<Integer> pq = new PriorityQueue<Integer>();
//		ArrayDeque<Integer> pq = new ArrayDeque<Integer>(); // can use offerFirst(), offerLast(), pollFirst(), pollLast();
		
		pq.offer(900);
		pq.offer(122);
		pq.offer(2111);
		pq.offer(888);
		pq.offer(900);
		
		System.out.println(pq);
		
		//pq.removeAll(pq);
		//pq.poll(); // should give [] when queue is empty 
		pq.remove(); // should give exception if queue is empty
		
		
		System.out.println(pq);
		
		
		System.out.println("Print the head element : " + pq.peek());
		System.out.println(" Size of queue is " + pq.size());
		System.out.println(" Check if 900 contains : " + pq.contains(900));
		
		
		
		
	
	
	}

}
