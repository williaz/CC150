package edu.bo.ch3;
// no construct data structure myself,may build some method on the top of util, just apply util

import java.util.LinkedList;

//use LinkedList to implement Stack, use pop(),push(),peek()
public class QStack {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		/*LinkedList<Integer> x=new LinkedList<Integer>();
		x.addFirst(7);
		x.addFirst(5);
		x.addFirst(1);
		x.addFirst(3);
		x.addFirst(7);
		
		System.out.println(x);
		System.out.println(x.peek());
		System.out.println(x.pop());
		System.out.println(x.peek());
		x.push(66);
		System.out.println(x.peek());*/
		
		/*SetOfStack<Integer> ss=new SetOfStack<Integer>();
		ss.push(4);
		ss.push(2);
		ss.push(7);
		ss.push(5);
		ss.push(1);
		ss.push(3);
		ss.push(46);
		ss.push(42);
		
		ss.popAt(1);
		
		System.out.println(ss);*/
		
		Integer[] l={1,2,3,4,5};
		
		MyQueue<Integer> qq=new MyQueue<Integer> ();
		
		qq.offer(1);
		qq.offer(2);
		qq.offer(3);
		qq.poll();
		
		System.out.println(qq.peek());

	}

}
