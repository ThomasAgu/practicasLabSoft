package ejercicio3;
import java.util.AbstractSet;
import java.util.Iterator;

public class StringConverterSet extends AbstractSet {
	
	private AbstractSet<String> mySet;
	private IteratorStringAdapter iterador;
	
	
	@Override
	public Iterator iterator() {
		return new IteratorStringAdapter();
	}
	

	@Override
	public int size() {
		return mySet.size();
		
	}
	
	private class IteratorStringAdapter implements Iterator{
		
		protected int posArray;
		
		public IteratorStringAdapter() {posArray = 0;}
		@Override
		public boolean hasNext() {
			boolean result; 
			
			if (posArray <= mySet.size()) {
				result = true;
			}
			else {
				result = false;
			}
			// TODO Auto-generated method stub
			return result;
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
			posArray++;
			return mySet.remove(posArray-1);
		}
		
	}

	

}
