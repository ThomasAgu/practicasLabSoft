package punto6;
import java.util.Arrays;

public class PaintTest {
	
	
	public static void main(String[] args) {
		
		Paint paintInstance = new Paint();
		paintInstance.init();
		
		FiguraGeometrica figuras[] = new FiguraGeometrica[4];
		figuras =  paintInstance.getFiguras();
		
		//aca es donde se llama al metodo compareTo
		Arrays.sort(figuras);

		for(int i=0; i< figuras.length; i++) {
			
			System.out.println("El area de" + figuras[i].getClass() + "es: " + figuras[i].area());
			if(figuras[i].getClass() == Circulo.class) {
				System.out.println("Radio= "   +  ((Circulo) figuras[i]).getRadio());
			};
		}
		
	}

}
