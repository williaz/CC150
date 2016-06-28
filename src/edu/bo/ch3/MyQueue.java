package edu.bo.ch3;

import java.util.LinkedList;
//3.5 FIFO
public class MyQueue <T>{
	private LinkedList<T> first;
	private LinkedList<T> last;
	
	public MyQueue(){
		first=new LinkedList<T> ();
		last=new LinkedList<T> ();
		/*for(int i=0;i<l.length;i++)
		{
			first.push(l[i]);
		}*/
		
	}
	// add to tail
	public void offer(T x){
		
		if(first.isEmpty()&&(!last.isEmpty()))
			switchStack();
		
		first.push(x);
		
		
		
	}
	
	private void switchStack(){
		T x;
		if(!first.isEmpty())
		{
			
			while(!first.isEmpty())
			{
				x=first.pop();
				last.push(x);
			}
		}
		else if(!last.isEmpty())
		{
			
			while(!last.isEmpty())
			{
				
				x=last.pop();
				System.out.println(x);
				first.push(x);
			}
		}
	
	}
	
	public T peek(){
	
		if(last.isEmpty()&&(!first.isEmpty()))
			switchStack();

		return last.peek();
		
		
	}
	
	public T poll(){
		if(last.isEmpty()&&!first.isEmpty())
			switchStack();
		
		return last.pop();
		
	}

}
