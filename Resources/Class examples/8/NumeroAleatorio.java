import java.util.Random;

public class NumeroAleatorio {
	private int numero;
	private int limite;
	public NumeroAleatorio() {
		this( 100 );
	}
	public NumeroAleatorio( int limite ) {
		numero = 0;
		this.limite = limite;
	}
	public NumeroAleatorio( NumeroAleatorio numero ) {
		this( numero.limite );
	}
	public int obtenerElNumero( ) {
 		Random r = new Random();
 		numero = r.nextInt( limite );
 		return numero;
 	}
 	public int getNumero() {
 		return numero;
 	}
}