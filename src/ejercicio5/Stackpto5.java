package ejercicio5;
import java.util.ArrayList;
import java.util.Iterator;


public class Stackpto5<E> {
	
	
	private ArrayList<String> items;
	
	public Stackpto5() {
		items = new ArrayList<String>();
	}
	

	public void push(Object item) {
		items.add(item.toString());
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
	
	
	public Iterator<String> iterator(){
		return new Iterator<String>() {
			int posArray = 0;
		
		@Override
		public boolean hasNext() {
			boolean result;
			if (posArray < items.size()) {result = true;}
			else {result = false;}
			return result;}
		@Override
		public String next() {
			posArray++;
			return items.get(posArray -1);
			}
		};
	}
	
}
