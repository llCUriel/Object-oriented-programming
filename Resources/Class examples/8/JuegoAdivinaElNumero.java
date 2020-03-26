public class JuegoAdivinaElNumero {
	private Jugador jugador;
	private NumeroAleatorio numero;
	public JuegoAdivinaElNumero() {
		jugador = new Jugador();
		numero = new NumeroAleatorio();
	}
	public JuegoAdivinaElNumero( int limite ) {
		jugador = new Jugador();
		numero = new NumeroAleatorio( limite );
	}
	protected void finalize() {
		jugador = null;
		numero = null;
		System.gc();
	}
	public void jugar() {
		System.out.println( "Juego: Adivina el numero. " );
 		System.out.print( "Obteniendo numero ... " );
 		int numeroAAdivinar = numero.obtenerElNumero( );
 		System.out.println( "hecho" );
 		int elNumero = 0;
 		do {
 			System.out.print( "Que numero es? " );
 			elNumero = jugador.ingresarNumero();
 			if( numeroAAdivinar<elNumero ) {
 				System.out.println( "Menor ... " );
 				}
 			else {
 				System.out.println( "Mayor ... " );
 				}
 		} while( numeroAAdivinar!=elNumero );
 		System.out.println( "Acertaste " );
	}
}