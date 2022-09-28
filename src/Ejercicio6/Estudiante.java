package Ejercicio6;

import java.util.ArrayList;

public class Estudiante{
	
	private String apellido;
	private String nombre;
	private int edad;
	private int legajo;
	private int materiasAprobadas;
	
	public Estudiante(String apellido, String nombre, int edad, int legajo, int materiasAprobadas) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.legajo = legajo;
		this.materiasAprobadas = materiasAprobadas;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public int getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(int materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}
	
	

	@Override
	public String toString() {
		return "Estudiante [apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad + ", legajo=" + legajo
				+ ", materiasAprobadas=" + materiasAprobadas + "]";
	}

	public static ArrayList<Estudiante> ordenarPorCantidadDeMaterias(ArrayList<Estudiante> arr) {
		
		arr.sort((Estudiante e1, Estudiante e2)-> Integer.compare(e1.getMateriasAprobadas(),e2.getMateriasAprobadas()));
		for(Estudiante estudiante:arr) {
			System.out.println(estudiante.toString());
		}
		return arr;
	}
	
	public static ArrayList<Estudiante> ordenarPorEdaddecendente(ArrayList<Estudiante> arr) {
			
			arr.sort((Estudiante e1, Estudiante e2)-> Integer.compare(e2.getEdad(),e1.getEdad()));
			for(Estudiante estudiante:arr) {
				System.out.println(estudiante.toString());
			}
			return arr;
		}
	

	public static ArrayList<Estudiante> ordenarLegajoAscendente(ArrayList<Estudiante> arr) {
		
		arr.sort((Estudiante e1, Estudiante e2)-> Integer.compare(e1.getLegajo(),e1.getLegajo()));
		for(Estudiante estudiante:arr) {
			System.out.println(estudiante.toString());
		}
		return arr;
	}
	
	public static ArrayList<Estudiante> ordenarPorNombreDescendente(ArrayList<Estudiante> arr) {
		
		arr.sort((Estudiante e1, Estudiante e2)-> e2.getApellido().compareTo(e1.getApellido()));
		for(Estudiante estudiante:arr) {
			System.out.println(estudiante.toString());
		}
		return arr;
	}
	
	
	

}
