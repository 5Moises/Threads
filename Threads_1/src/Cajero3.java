
public class Cajero3 extends Thread{
	private int Prioridad;
	private String Estatus;
	public Cajero3()
	{
		
	}
	public Cajero3(int prioridad, String estatus) {
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
                System.out.println("Proceso 3" +"--"+Prioridad +"--"+ Estatus+"\t");
				 //System.out.println("Proceso 3 \t" +"--"+Prioridad +"--"+ Estatus);
				break;
			case 3:
				Estatus="Cliente Atentido";
                System.out.println("Proceso 3" +"--"+Prioridad +"--"+ Estatus+"\t");
				 //System.out.println("Proceso 3 \t" +"--"+Prioridad +"--"+ Estatus);
				break;
			case 5:
                Estatus="Cliente Atentido";
                System.out.println("Proceso 3" +"--"+Prioridad +"--"+ Estatus);
				break;			
			}
			try {
				sleep(200);
			} catch (Exception e) {

			}
		
	}
}
