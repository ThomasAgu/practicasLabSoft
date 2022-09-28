package punto6;

public class Circulo extends FiguraGeometrica{
	
	private int radio;

	public Circulo() {
		super();
	}
	
	
	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
	}


	public int area() {
		return (int) (Math.PI * (this.radio * this.radio));
	}
	
	public void dibujar(){                                                                                  
    		System.out.println("Se dibuja un circulo de radio" + this.getRadio() + " y de color: " + this.getColor());
	}   	
	

}                                                                                                      
