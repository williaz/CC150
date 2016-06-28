package edu.bo.ch3;
//3.7
import java.util.Iterator;
import java.util.LinkedList;

public class AnimalShelter {
	private LinkedList<Animal> animal=new LinkedList<Animal>();
	
	public void enqueue(Animal x){
		animal.offer(x);
		
	}
	
	public Animal dequeueAny(){
		return animal.poll();
		
	}
	
	public Animal dequeueDog(){
		
		Animal a;
		
		Iterator<Animal> i=animal.iterator();
		while(i.hasNext())
		{
			a=i.next();
			if(a.getClass().getSimpleName().equals("Dog")){
				i.remove();
				return a;
			}
				
		}
		
		return null;
		
		
	}
	
	
public Animal dequeueCat(){
		
		Animal a;
		
		Iterator<Animal> i=animal.iterator();
		while(i.hasNext())
		{
			a=i.next();
			if(a.getClass().getSimpleName().equals("Cat")){
				i.remove();
				return a;
			}
				
		}
		
		return null;
		
		
	}

}
