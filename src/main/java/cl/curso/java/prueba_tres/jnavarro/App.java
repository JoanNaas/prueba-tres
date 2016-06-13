package cl.curso.java.prueba_tres.jnavarro;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        TarjetaBip bip = new TarjetaBip();
        PagarViaje pagar = new PagarViaje(bip, 710);
        PagarViaje pagar1 = new PagarViaje(bip, 710);
        
        try {
        	pagar.start();
            pagar.join();

		} catch (SinSaldoException e) {
			// TODO: handle exception
			System.out.println(e);
		}
        
        
        bip.imprimir();
        
        
        
        
       
    	
    	
    }
}
