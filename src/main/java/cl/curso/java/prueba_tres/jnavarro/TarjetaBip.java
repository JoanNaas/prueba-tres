/**
 * 
 */
package cl.curso.java.prueba_tres.jnavarro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author José Navarro
 *
 */
public class TarjetaBip {
	
	private int numeroTarjeta;
	private int saldo;
	private List<Viaje> viajes;
	
	
	/**
	 * 
	 */
	public TarjetaBip() {
		// TODO Auto-generated constructor stub
		this.numeroTarjeta = 1234567890;
		this.saldo = 1000;
		this.viajes = new ArrayList<Viaje>();
	}
	
	
	
	/**
	 * @param numeroTarjeta
	 * @param saldo
	 * @param viajes
	 */
	public TarjetaBip(int numeroTarjeta, int saldo, List<Viaje> viajes) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.saldo = saldo;
		this.viajes = viajes;
	}
	/**
	 * @return the numeroTarjeta
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}
	/**
	 * @param numeroTarjeta the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the viajes
	 */
	public List<Viaje> getViajes() {
		return viajes;
	}
	/**
	 * @param viajes the viajes to set
	 */
	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}
	
	
	public void recargar (int monto)
	{
		this.setSaldo(this.getSaldo() + monto);
	}

	public synchronized void pagarViaje( int PagarViaje)
	{
		
		if (this.getSaldo() >= PagarViaje) {
			this.setSaldo(this.getSaldo() - PagarViaje);
			viajes.add(new Viaje(new Date(), this.getSaldo(), 710 ));
		}
		else
			if (this.getSaldo() < PagarViaje) {
				 throw new SinSaldoException("Saldo insuficiente");
			}
	}
	
	public void imprimir()
	{
		System.out.println("Numero de tarjeta : " + this.numeroTarjeta);
		System.out.println("Saldo : " + this.getSaldo());
		
		
		Collections.sort(viajes);
		
		for (Viaje viaje : viajes) {
			System.out.println(viaje.toString());
		}
		
		
		
		
	}
	
	
	
}
