package monederoBit;

public class Vender extends Thread {
	MonederoBit m;

	public Vender(MonederoBit m) {
		super();
		this.m = m;
	}
	/**
	 * Llama a la funcion venderBit()
	 */
	@Override
	public void run() {
		m.VendeBit();
	
	}

}