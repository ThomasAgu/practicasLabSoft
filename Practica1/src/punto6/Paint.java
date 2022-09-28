package punto6;

public class Paint {

	
	private FiguraGeometrica figuras[] = new FiguraGeometrica[4];

	public Paint() {
		super();
		
	}
	
	public void init() {
		Circulo figura1 = new Circulo();
		figura1.setColor("azul");
		figura1.setRadio(2);

		
		Circulo figura2 = new Circulo();
		figura2.setColor("amarllo");
		figura2.setRadio(3);
		
		Rectangulo figura3 = new Rectangulo(2,3);
		figura3.setColor("verde");
		
		Rectangulo figura4 = new Rectangulo(4,10);
		figura4.setColor("rojo");
		
		
		figuras[0] = figura1;
		figuras[1] = figura2;
		figuras[2] = figura3;
		figuras[3] = figura4;
		
	}

	public FiguraGeometrica[] getFiguras() {
		return figuras;
	}

	public void setFiguras(FiguraGeometrica[] figuras) {
		this.figuras = figuras;
	}
	
	
	
	
	
}
