import javax.swing.JOptionPane;

public class Claseprincipal {

	public static void main(String[] args) {

		Cajero1 hilo1 = new Cajero1();
		Cajero2 hilo2 = new Cajero2();
		Cajero3 hilo3 = new Cajero3();
		
		persona personas[] = new persona[100];

		int numero, can1 = 0, can3 = 0, can5 = 0;
		String Estatus = "No Atentido";
		for (int i = 0; i < personas.length; i++) {
			numero = (int) ((Math.random() * 5 + 1));
			switch (numero) {
			case 1:
				personas[i] = new persona(numero, Estatus);
				can1++;
				break;
			case 3:
				personas[i] = new persona(numero, Estatus);
				can3++;
				break;
			case 5:
				personas[i] = new persona(numero, Estatus);
				can5++;
				break;
			default:
				i--;
				break;
			}

		}
		for(int i=0;i<personas.length;i++)
		{
			System.out.println(personas[i].getPrioridad()+" "+Estatus);
		}
		int pri_1[] = new int[can1 - 1];
		int pri_3[] = new int[can3 - 1];
		int pri_5[] = new int[can5 - 1];
		for (int i = 0; i < pri_1.length; i++) {
			pri_1[i] = 1;
		}
		for (int i = 0; i < pri_3.length; i++) {
			pri_3[i] = 3;
		}
		for (int i = 0; i < pri_5.length; i++) {
			pri_5[i] = 5;
		}
     
		for (int i = 0; i < pri_5.length; i++) {

			if ((i+4) <= pri_5.length || (i + 3) <= pri_5.length) {
				hilo1 = new Cajero1(pri_5[i], Estatus);
				hilo2 = new Cajero2(pri_5[i + 1], Estatus);
				hilo3 = new Cajero3(pri_5[i + 2], Estatus);
				hilo1.start();
				try {
					Thread.sleep(10);
				} catch (Exception e) {

				}
				hilo2.start();
				try {
					Thread.sleep(10);
				} catch (Exception e) {

				}
				hilo3.start();
				try {
					Thread.sleep(10);
				} catch (Exception e) {

				}
			} else {

			}

		}
		for (int i = 0; i < pri_3.length; i++) {
			if ((i+3) <= pri_3.length || (i + 4) <= pri_3.length) {
				hilo1 = new Cajero1(pri_3[i], Estatus);
				hilo2 = new Cajero2(pri_3[i + 1], Estatus);
				hilo3 = new Cajero3(pri_3[i + 2], Estatus);
				hilo1.start();
				try {
					Thread.sleep(10);
				} catch (Exception e) {

				}
				hilo2.start();
				try {
					Thread.sleep(10);
				} catch (Exception e) {

				}
				hilo3.start();
				try {
					Thread.sleep(10);
				} catch (Exception e) {

				}
			} else {

			}

		}
		for (int i = 0; i < pri_1.length; i++) {
			if ((i+3) <= pri_1.length || (i + 4) <= pri_1.length) {
				hilo1 = new Cajero1(pri_1[i], Estatus);
				hilo2 = new Cajero2(pri_1[i + 1], Estatus);
				hilo3 = new Cajero3(pri_1[i + 2], Estatus);
				hilo1.start();
				try {
					Thread.sleep(10);
				} catch (Exception e) {

				}
				hilo2.start();
				try {
					Thread.sleep(10);
				} catch (Exception e) {

				}
				hilo3.start();
				try {
					
					Thread.sleep(10);
				} catch (Exception e) {

				}
			} else {

			}

		}
		Estatus=hilo1.getEstatus();		
		for(int i=0;i<personas.length;i++)
		{
			System.out.println(personas[i].getPrioridad()+" "+Estatus);
		}
		JOptionPane.showMessageDialog(null, "Proceso Terminado¡¡¡¡¡¡¡");
	}
}
