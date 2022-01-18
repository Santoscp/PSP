package model;

import java.util.Scanner;

import contadorJoin.ContarJoin;
import contarBitSincornizador.ContadorSin;
import contarBitSincornizador.HiloSin;
import monederoBit.Comprar;
import monederoBit.MonederoBit;
import monederoBit.Vender;



public class Ejecutable {
	

	public static void main(String[] args) {
		MonederoBit m= new MonederoBit(10);
		ContarJoin cjbit=new ContarJoin("Bitcoin");
		ContarJoin cjethe=new ContarJoin("Ethereum");
		ContarJoin cjlumen=new ContarJoin("Lumen");
		ContadorSin csin=new ContadorSin(100);
		int contador;
		
		
		
		Scanner teclado=new Scanner(System.in);
		int opcion1,opcion2,opcionhilos;
		
		
	

		
		do {
			
			System.out.println("Elija opcion");
			System.out.println("1-Lotes");
			System.out.println("2-Comprar monedas");
			System.out.println("3-Contar el dinero virtual");
			System.out.println("4-Salir");
			
			opcion1=teclado.nextInt();
			switch (opcion1) {
			case 1:
				do {
				System.out.println("Elija opcion");
				System.out.println("1-Comprar lote");
				System.out.println("2-Vender lote");
				System.out.println("3-Salir");
				opcion2=teclado.nextInt();
				switch (opcion2) {
				case 1: 
					if(m.isDisponible()) {
					Comprar c=new Comprar(m);
					c.start();
					}else {
						System.out.println("--------------------");
						System.out.println("Ya tienes Bitcoin comprados");
						
					}
					
					break;
				case 2:
					if(!m.isDisponible()) {
					
					Vender v=new Vender(m);
					v.start();
					}else {
						System.out.println("--------------------");
						System.out.println("No tienes Bitcoin");
					}
					
					break;
				
				
					
				}
				}while(opcion2!=3);
			
				
			
			
			
				
			break;
			case 2:
			
				cjbit.start();
				try {
					cjbit.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cjethe.start();
				try {
					cjethe.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cjlumen.start();
				try {
					cjlumen.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
				
				
			
				break;
				
			case 3:
				System.out.println("Cuantos hilos quieres que cuenten?");
				opcionhilos=teclado.nextInt();
				System.out.println("Cuanto quieres contar?");
				contador=teclado.nextInt();
				Thread[] hilos = new Thread[opcionhilos];
				for(int i=0;i<opcionhilos;i++) {
					Thread hilo = new Thread(new HiloSin(csin,contador/opcionhilos,0));
					hilo.start();
					 hilos[i] = hilo;
					try {
						hilo.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				break;
				
				
			
			
				
			}
			
		}while(opcion1!=4);
		
	}
	
	


}
