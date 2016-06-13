/**
 * 
 */
package cl.curso.java.prueba_tres.jnavarro;

/**
 * @author José Navarro
 *
 */
public class PagarViaje extends Thread{
	
	private TarjetaBip tarjetabip;
	private int valorViaje;
	
	/**
	 * 
	 */
	public PagarViaje() {
		// TODO Auto-generated constructor stub
		this.tarjetabip = new TarjetaBip();
		this.valorViaje = 710;
	}
	
	
	
	/**
	 * @param tarjetabip
	 * @param valorViaje
	 */
	public PagarViaje(TarjetaBip tarjetabip, int valorViaje) {
		super();
		this.tarjetabip = tarjetabip;
		this.valorViaje = valorViaje;
	}
	/**
	 * @return the tarjetabip
	 */
	public TarjetaBip getTarjetabip() {
		return tarjetabip;
	}
	/**
	 * @param tarjetabip the tarjetabip to set
	 */
	public void setTarjetabip(TarjetaBip tarjetabip) {
		this.tarjetabip = tarjetabip;
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
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		tarjetabip.pagarViaje(this.getValorViaje());
	}
	

}
