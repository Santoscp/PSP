package monederoBit;

public class MonederoBit {
	/**
	 * Idea para una base de datos pero no esta implementada
	 */
	int dinero;
	/**
	 * Boleano que nos permite acceder a 'comprarBit()' y a 'venderBit()' usando el model productor/consumidor
	 */
	boolean disponible=true;
	
	
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public MonederoBit(int dinero) {
		super();
		this.dinero = dinero;
	}
	/**
	 * Es el primer metodo que se puede acceder, no se puede vender los Bit, sin haberlos comprados antes,
	 * muestra un mensaje por pantalla y notifica que ya se pueden vender
	 */
	public synchronized void CompraBit() {
		while(disponible==false) {
			try {
				wait();
				
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		}
		disponible=false;
		dinero++;
		System.out.println("--------------------");
		System.out.print(" Bit comprados ");
		notifyAll();
		
	
		
	}
	/**
	 * Solo se puede vender una vez comprados, muestra un mensaje por pantalla,
	 * notifica que ya se pueden volver a comprar 
	 */
	public synchronized void VendeBit() {
		while(disponible==true) {
			try {
				wait();
				
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		}
		disponible=true;
		dinero--;
		System.out.println("--------------------");
		System.out.print(" Bit Vendidos ");
		
		notifyAll();
		
	
		
	}
	
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	

}
