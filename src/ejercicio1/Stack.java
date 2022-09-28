package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<E> {
	
	
	private ArrayList<Object> items;
	
	public Stack() {
		items = new ArrayList<Object>();
	}
	

	public void push(Object item) {
		items.add(item);
	}
	
	public Object pop() {
		if (!items.isEmpty()) {
			return items.remove(this.items.size()-1);
		}
		return null;
	}
	
	public boolean isEmpty() {
		return (items.size() == 0);
	}
	
	//1 b.
	public Iterator<Object> iterator(){
		return new StackIterator();
	}
	
	public void IterarSinMostrarImplementacion() {
		Iterator<Object> it = this.iterator();
		while(it.hasNext()){
			System.out.println("El elemento: "+ it.next());
		}
	}
	
	
	
	private class StackIterator implements Iterator<Object>{
		
		
		protected int posArray;
		
		public StackIterator() {posArray = 0;}
		@Override
		public boolean hasNext() {
			boolean result;
			if (posArray < items.size()) {
				result = true;
				}
			else {
				result = false;
				}
			return result;

		}

		@Override
		public Object next() {
			
			posArray++;
			return items.get(posArray -1);

		}
		
		
		
	}
	
	

}


	
	


