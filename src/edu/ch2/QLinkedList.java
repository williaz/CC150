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
	
	//2.4
	public static<T extends Comparable<T>> void partitionList(LinkedList<T>ll,T x)
	{
		ll.remove(ll.indexOf(x));
		ll.addFirst(x);// put x as head
		int iX=0;//start from 0
		
		//Iterator<T> itr=ll.descendingIterator();
		T value;
		
		for(int i=ll.size()-1;i>=0;)
		{
			value=ll.get(i);
			
			if(value.compareTo(x)<0)
			{
				ll.removeLastOccurrence(value);
				ll.addFirst(value);
				iX++;
			}	
			else if(value.compareTo(x)==0)
			{
				if(ll.lastIndexOf(value)==iX)
				{
					//System.out.println("Sure me");
					break;//break the loop
				}
					
				else
				{
					ll.removeLastOccurrence(value);
					ll.addFirst(value);
					iX++;
				}
			}
			else
			{
				i--;
			}
			
			
		}
	
		
	}
	
	public static LinkedList<Integer> sumDigit(LinkedList<Integer> x,LinkedList<Integer> y)
	{
		LinkedList<Integer> sum=new LinkedList<Integer>();
		//LinkedList<Integer> min=new LinkedList<Integer>();
	    sum.add(0);
	    int value;
	    
	    Iterator<Integer> iX=x.descendingIterator();
	    Iterator<Integer> iY=y.descendingIterator();
	    
	    while(iX.hasNext()&&iY.hasNext())
	    {
	    	value=iX.next()+iY.next()+sum.getFirst();
	    	
	    	if(value<=9)
	    	{
	    		sum.removeFirst();
	    		sum.addFirst(value);
	    		sum.addFirst(0);
	    	}
	    	else
	    	{
	    		sum.removeFirst();
	    		sum.addFirst(value-10);
	    		sum.addFirst(1);
	    		
	    	}
	    }
	    
	    if(sum.getFirst().equals(0))
	    	sum.removeFirst();

		
		return sum;
	}
	
	public static LinkedList<Integer> sumDigitTail(LinkedList<Integer> x,LinkedList<Integer> y)
	{
		LinkedList<Integer> sum=new LinkedList<Integer>();
		//LinkedList<Integer> min=new LinkedList<Integer>();
	    sum.addLast(0);;
	    int value;
	    
	    Iterator<Integer> iX=x.iterator();
	    Iterator<Integer> iY=y.iterator();
	    
	    while(iX.hasNext()&&iY.hasNext())
	    {
	    	value=iX.next()+iY.next()+sum.getLast();
	    	
	    	if(value<=9)
	    	{
	    		sum.removeLast();
	    		sum.addLast(value);
	    		sum.addLast(0);
	    	}
	    	else
	    	{
	    		sum.removeLast();
	    		sum.addLast(value-10);
	    		sum.addLast(1);
	    		
	    	}
	    }
	    
	    if(sum.getLast().equals(0))
	    	sum.removeLast();

		
		return sum;
	}

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		//char[] cc={'F','F', 'O', 'L','L','O','W',' ','U', 'P'};
		int[] cc={3,4,8,3,1,9,5,2,8,7};
		
		//LinkedList<Character> l=new LinkedList<Character>();
		LinkedList<Integer> l=new LinkedList<Integer>();
		for (int i=0;i<cc.length;i++)
		{
			
			l.add(cc[i]);
		}
		
		System.out.println("Before: "+l+"start from "+l.indexOf('F'));*/
		
		//QLinkedList.removeDup(l);
		//QLinkedList.removeDupNb(l);
		//System.out.println(l);
		
		//System.out.println(QLinkedList.findLastTh(l, 4));
		//QLinkedList.removeMidddle(l);
		//QLinkedList.partitionList(l, 5);
		//System.out.println(l);
		/*LinkedList<Integer> x=new LinkedList<Integer>();
		x.add(6);
		x.add(1);
		x.add(7);
		LinkedList<Integer> y=new LinkedList<Integer>();
		y.add(2);
		y.add(9);
		y.add(5);
		
		System.out.println(x+" + "+y+" = "+QLinkedList.sumDigit(x, y));*/
		
		LinkedList<Integer> x=new LinkedList<Integer>();
		x.addFirst(6);
		x.addFirst(1);
		x.addFirst(7);
		LinkedList<Integer> y=new LinkedList<Integer>();
		y.addFirst(2);
		y.addFirst(9);
		y.addFirst(5);
		
		System.out.println(x+" + "+y+" = "+QLinkedList.sumDigitTail(x, y));
		

	}

}
