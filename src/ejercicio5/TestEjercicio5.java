package ejercicio5;

import java.util.Iterator;

public class TestEjercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackpto5<String> myStack = new Stackpto5<String>();
		myStack.push("hola jorge");
		myStack.push("Asidubas");
		myStack.push("Asidubas");
		myStack.push("Ricardito");
		
		System.out.println("La pila esta vacia?: " + myStack.isEmpty() );
		
		Iterator<String> it = myStack.iterator();
		while(it.hasNext()){
			System.out.println("El elemento: "+ it.next());
		}

	}

}
