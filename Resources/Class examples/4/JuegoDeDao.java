public class JuegoDeDado {
	private Jugador jugador;
	private Dado dadoUno;
	private Dado dadoDos;
	public void jugar( String nombre ) {
		jugador = new Jugador();
		jugador.setNombre( nombre );
		dadoUno = new Dado();
		dadoDos = new Dado();
		jugador.tomarDados( dadoUno, dadoDos );
		int elNumero = jugador.tirarLosDados();
		if( elNumero==jugador.getMiNumero() ) {
			System.out.println( jugador.getNombre() + 
				" GANASTE con " + jugador.getMiNumero() );
			}
		else {
			System.out.println( jugador.getNombre() + 
				" intentelo de nuevo " + 
					jugador.getMiNumero() + " |= " + (elNumero) );
			}
	}
}