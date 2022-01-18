package contarBitSincornizador;

public class HiloSin implements Runnable {
	
	/**
	 * El contador en cuestion
	 */
	ContadorSin contsin;
	/**
	 * Los hilos que van a tarabajar
	 */
	int dividido;
	/**
	 * Lo que cuenta cada hilo
	 */
	int numeroBitContados;
	
	

	public HiloSin(ContadorSin contsin, int dividido, int numeroBitContados) {
		super();
		this.contsin = contsin;
		this.dividido = dividido;
		this.numeroBitContados = numeroBitContados;
	}


/**
 * Llama al sumar bitcoin del contador y a la misma vez suma 'numeroBitContados' para saber cuanto se ha contado
 */
	@Override
	public void run() {
		for(int i =0;i<dividido;i++) {
			contsin.contarBitcoin();
			numeroBitContados++;
			
		}
		System.out.println("Ya he contado: "+numeroBitContados);
		
	}

}
