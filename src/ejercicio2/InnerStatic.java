package ejercicio2;
import static java.lang.Math.pow;

public class InnerStatic {
	
	static final double PI = 3.1416;
	
	
	static class Circulo{
		
		static public double radio;
		
		
		static void setRadio(double value) {
			radio = value;
		}
		
		static double getArea() {
			double a = PI * pow(radio, 2);
			System.out.println("El area es: " + a);
			return a;
		}
		
		static double getLongitudCircunsferencia() {
			double l= 2*PI*radio;
			System.out.println("La longitud es: "+ l);
			return l;
		}
		
	}

	
}
