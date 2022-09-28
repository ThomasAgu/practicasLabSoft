package punto5;

public final class PoolConexiones {
	
	private static PoolConexiones instance;
	public String value;
	
	
	private PoolConexiones(String value) {	
	
		this.value = value;
	}
	
	
	public static PoolConexiones getInstance(String value) {
		
		if (instance == null) {
			instance = new PoolConexiones(value);
		}
		
		return instance;
	}

}
