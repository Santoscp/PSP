package contarBitSincornizador;

public class ContadorSin {
	/**
	 * Desde donde empieza a contar
	 */
	int bitcoin=0;
	
	
	
	
	 public ContadorSin(int bitcoin) {
	
		this.bitcoin = bitcoin;
	}
/**
 * Cuenta los bitcoins
 * @return los bitcoins contados
 */
	int contarBitcoin(){
		 bitcoin++;
		 return bitcoin;
		
	}

	public int getBitcoin() {
		return bitcoin;
	}

	public void setBitcoin(int bitcoin) {
		this.bitcoin = bitcoin;
	}
	
	


}
