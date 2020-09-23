
public class Cajero1 extends Thread {
	private int Prioridad;
	private String Estatus;
	public Cajero1()
	{
		
	}
	public Cajero1(int prioridad, String estatus) {
		super();
		Prioridad = prioridad;
		Estatus = estatus;
	}
	

	public String getEstatus() {
		return Estatus;
	}
	public void setEstatus(String estatus) {
		Estatus = estatus;
	}
	@Override
	public synchronized void run() {		
			
			switch (Prioridad) {
			case 1:
				Estatus="Cliente Atentido";
                System.out.print("Proceso 1" +"--"+Prioridad +"--"+ Estatus+"\t");
				 //System.out.print("Proceso 1 \t" +"--"+Prioridad +"--"+ Estatus);
				break;
			case 3:
				Estatus="Cliente Atentido";
                System.out.print("Proceso 1" +"--"+Prioridad +"--"+ Estatus+"\t");
				 //System.out.print("Proceso 1 \t" +"--"+Prioridad +"--"+ Estatus);
				break;
			case 5:
                Estatus="Cliente Atentido";
                System.out.print("Proceso 1" +"--"+Prioridad +"--"+ Estatus+"\t");
				break;			
			}
			try {
				sleep(200);
			} catch (Exception e) {

			}		
	}
}
