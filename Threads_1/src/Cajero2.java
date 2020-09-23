
public class Cajero2 extends Thread{
	private int Prioridad;
	private String Estatus;
	public Cajero2()
	{
		
	}
	public Cajero2(int prioridad, String estatus) {
		super();
		Prioridad = prioridad;
		Estatus = estatus;
	}

	@Override
	public synchronized void run() {
				
			switch (Prioridad) {
			case 1:
				Estatus="Cliente Atentido";
                System.out.print("Proceso 2" +"--"+Prioridad +"--"+ Estatus+"\t");
				 //System.out.print("Proceso 2 \t" +"--"+Prioridad +"--"+ Estatus);
				break;
			case 3:
				Estatus="Cliente Atentido";
                System.out.print("Proceso 2" +"--"+Prioridad +"--"+ Estatus+"\t");
				 //System.out.print("Proceso 2 \t" +"--"+Prioridad +"--"+ Estatus);
				break;
			case 5:
                Estatus="Cliente Atentido";
                System.out.print("Proceso 2" +"--"+Prioridad +"--"+ Estatus+"\t");
				break;			
			}
			try {
				sleep(200);
			} catch (Exception e) {

			}
		
	}
	public String getEstatus() {
		return Estatus;
	}
	public void setEstatus(String estatus) {
		Estatus = estatus;
	}
}
