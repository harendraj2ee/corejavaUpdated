package com.collection.harendra;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		priorityQueue();
	}
	public static void priorityQueue(){
		PriorityQueue pq = new PriorityQueue();
		//System.out.println(pq.peek());//null
		//System.out.println(pq.element()); //RE:NSEE
		for(int i=0; i<=10; i++){
			pq.offer(i);
		}
		System.out.println(pq);//[0,1,2,3,.....10]
		System.out.println(pq.poll());//0
		System.out.println(pq);//[1,2,3,....,10]
		
		//PriorityQueue custome
		PriorityQueue pq1 = new PriorityQueue(15,new MyComparatorQueue());
		pq1.offer("A");
		pq1.offer("Z");
		pq1.offer("L");
		pq1.offer("B");
		System.out.println("Custom PriorityQuere >> "+pq1);//[Z,L,B,A]
	}
}
class MyComparatorQueue implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = (String) obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}