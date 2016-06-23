package edu.bo.ch3;

import java.util.LinkedList;
//3.3
//fix size() of subStack=5,Generic class
public class SetOfStack<T> {
	private final int subSize=5;
	LinkedList<LinkedList<T>> ss=new LinkedList<LinkedList<T>>();
	
	public SetOfStack()
	{
		ss.push(new LinkedList<T>());
		
	}
	
	public void checkSize()//manage sub-stack
	{
		LinkedList<T>head=ss.peek();
		if(head.size()==subSize)
			ss.push(new LinkedList<T>());
		else if(head.isEmpty()&&ss.indexOf(head)!=0)
		{
			ss.pop();
		}
		
	}
	
	public void push(T x)
	{
		checkSize();//null-e
		LinkedList<T>head=ss.peek();
		head.push(x);
		
		
	}
	
	public T pop()
	{
		LinkedList<T>head=ss.peek();
		T x=head.pop();
		checkSize();
		
		return x;
		
	}
	
	public T popAt(int iSub)
	{
		LinkedList<T>sub=ss.get(iSub);
		T x=sub.pop();
		checkSize();
		
		return x;
		
	}
	
	@Override
	public String toString()
	{
		String stackSet="{ ";
		
		for(int i=0;i<ss.size();i++)
		{
			stackSet+=" "+ss.get(i).toString();
		}
		
		stackSet+=" }";
		
		return stackSet;
		
		
	}

}
