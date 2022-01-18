package contadorJoin;

public class ContarJoin extends Thread {
	/**
	 * Nombre de la moneda virtual
	 */
	String nombre;

	public ContarJoin(String nombre) {
		super();
		this.nombre = nombre;
	}
/**
 * Compra las monedas vituales una detras de otra y durante la "compra" espera 5 segundos
 * 
 */
	@Override
	public void run() {
		
		System.out.println("Comprando todos los "+nombre+"...");
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Todos los "+nombre+" comprados");
		
		
	}

}
