package punto6;

public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica>{
	
	private String color;

	public FiguraGeometrica() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//tiene que sobreescribir el metodo compareTo utilizado por el sort por eso la implementacion de comparable
	public int compareTo(FiguraGeometrica compareFigura) {
		
		int compareArea = ((FiguraGeometrica) compareFigura).area();
		
		return this.area() - compareArea;
	}
	
	
	public abstract void dibujar();
	
	public abstract int area();

}

