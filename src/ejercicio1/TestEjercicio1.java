package ejercicio1;

public class TestEjercicio1 {

	public static void main(String[] args ) {
		
		
		Stack<Object> myStack = new Stack();
		myStack.push("hola jorge");
		myStack.push("Asidubas");
		myStack.push("Asidubas");
		myStack.push("Ricardito");
		
		System.out.println("La pila esta vacia?: " + myStack.isEmpty() );
		
		/*Iterator<String> it = myStack.iterator();
		while(it.hasNext()){
			System.out.println("El elemento: "+ it.next());
		}*/
		
		myStack.IterarSinMostrarImplementacion();
		//Ahora la podemos recorrer una vez. Por cada iterador
		
		
		
	}
}
