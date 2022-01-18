package monederoBit;

public class Comprar extends Thread{
	MonederoBit m;

	public Comprar(MonederoBit m) {
		super();
		this.m = m;
	}
	/**
	 * Llama a la funcion comprarBit()
	 */
	@Override
	public void run() {
		m.CompraBit();
	
	}
	
	
	

}
