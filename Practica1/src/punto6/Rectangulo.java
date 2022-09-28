package punto6;

public class Rectangulo extends FiguraGeometrica {

	private int alto;
	private int ancho;
	
	public Rectangulo() {
		super();
	}
	
	public Rectangulo(int alto, int ancho) {
		super();
		this.alto = alto;
		this.ancho = ancho;
	}

	public void dibujar(){
		System.out.println("Se dibuja un rectangulo de altura " + this.alto + " y de ancho " + this.ancho+ " y de color:" + this.getColor() );
	}
	
	public int area(){
		return(this.alto * 2 + this.ancho * 2);
	}
	
	
	
	
	
}
