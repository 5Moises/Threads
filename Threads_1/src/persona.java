
public class persona {	
	private int Prioridad;
	private String Estatus;
	public persona()
	{
		
	}
	public persona(int prioridad, String estatus) {
		super();
		Prioridad = prioridad;
		Estatus = estatus;
	}
	public int getPrioridad() {
		return Prioridad;
	}

	public void setPrioridad(int prioridad) {
		Prioridad = prioridad;
	}

	public String getEstatus() {
		return Estatus;
	}

	public void setEstatus(String estatus) {
		Estatus = estatus;
	}

	
	
	
}
