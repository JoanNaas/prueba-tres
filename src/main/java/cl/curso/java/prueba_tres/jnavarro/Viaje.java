/**
 * 
 */
package cl.curso.java.prueba_tres.jnavarro;

import java.util.Date;

/**
 * @author José Navarro
 *
 */
public class Viaje implements Comparable<Viaje>{
	
	private Date fecha;
	private int saldoTarjeta;
	private int valorViaje;
	
	
	/**
	 * 
	 */
	public Viaje() {
		// TODO Auto-generated constructor stub
		this.fecha = new Date();
		this.saldoTarjeta = 2000;
		this.valorViaje = 710;
	}
	
	
	/**
	 * @param fecha
	 * @param saldoTarjeta
	 * @param valorViaje
	 */
	public Viaje(Date fecha, int saldoTarjeta, int valorViaje) {
		super();
		this.fecha = fecha;
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the saldoTarjeta
	 */
	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}
	/**
	 * @param saldoTarjeta the saldoTarjeta to set
	 */
	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}
	/**
	 * @return the valorViaje
	 */
	public int getValorViaje() {
		return valorViaje;
	}
	/**
	 * @param valorViaje the valorViaje to set
	 */
	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}
	


	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Viaje viaje) {
		// TODO Auto-generated method stub
		return this.getFecha().compareTo(viaje.getFecha());
		
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getFecha()+ " " + this.getSaldoTarjeta() + " " + this.getValorViaje();
	}


}


	
