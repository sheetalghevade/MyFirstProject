package collections;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("Sheetal");
		pq.add("Dhruv");
		pq.add("Aeeraj");
		
		System.out.println(pq.peek());
	}

}
