package Ejercicio6;

import java.util.ArrayList;

public class EstudianteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		Estudiante e1 = new Estudiante("Jorge", "lanata", 23,1231241, 5 );
		Estudiante e2 = new Estudiante("Jorge2", "lanata2", 25,12311241, 1 );
		Estudiante e3 = new Estudiante("Pedria", "asdj", 13,1249, 20 );
		Estudiante e4 = new Estudiante("Susana", "Gimenez", 15,412912, 15 );
	
		estudiantes.add(e1);estudiantes.add(e2);estudiantes.add(e3);estudiantes.add(e4);
		
		
		Estudiante.ordenarPorNombreDescendente(estudiantes);
	}

}
