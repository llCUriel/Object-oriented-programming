public class ProbandoElJuego {
	public static void main( String [] args ) {
		JuegoAdivinaElNumero juego = new JuegoAdivinaElNumero();
		juego.jugar();
		
		juego = null;
		System.gc();
	}
}