package edu.ch2;
// aim to practice collection, so not solve the questions strictly
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class QLinkedList {
	
	//2.1
	public static void removeDup(LinkedList<Character> l)
	{
		HashSet<Character> hs=new HashSet<Character>();
		Iterator<Character> it=l.iterator();
		
		char c;
		while(it.hasNext())
		{
			c=it.next();
			if(hs.contains(c))
			{
				
				it.remove();
			}
			else
			{
				hs.add(c);
			}
		}
		
	}
	
	//2.1 Non buffer
	public static void removeDupNb(LinkedList<Character> l)
	{
		//Iterator<Character> it=l.iterator();
		//Iterator<Character> iRunner;
		
		char c;
		
		for(int i=0;i<l.size();i++)
		{
			c=l.get(i);
			
			while(l.lastIndexOf(c)!=i)
			{
				l.remove(l.lastIndexOf(c));
			}
			
		}
		
		
		
	}
	
	//2.2 Generic
	public static <T> T findLastTh(LinkedList<T> ll,int num)
	{
		//use ListIterator =ll.listIterator(ll.size-num) instead
		ListIterator<T> i=ll.listIterator(ll.size()-num);
		
		
		return i.next();
		
		
	}
	
	//2.3
	public static<T> void removeMidddle(LinkedList<T>ll)
	{
		ll.remove(ll.size()/2);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cc={'F','F', 'O', 'L','L','O','W',' ','U', 'P'};
		
		LinkedList<Character> l=new LinkedList<Character>();
		for (int i=0;i<cc.length;i++)
		{
			
			l.add(cc[i]);
		}
		
		System.out.println("Before: "+l);
		
		//QLinkedList.removeDup(l);
		//QLinkedList.removeDupNb(l);
		//System.out.println(l);
		
		//System.out.println(QLinkedList.findLastTh(l, 4));
		QLinkedList.removeMidddle(l);
		System.out.println(l);

	}

}
