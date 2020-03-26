public class JuegoDeDado {
	private Jugador jugador;
	//private Dado dadoUno;
	//private Dado dadoDos;
	private Dado [] dados;
	public void jugar( String nombre ) {
		jugador = new Jugador();
		jugador.setNombre( nombre );
		//dadoUno = new Dado();
		//dadoDos = new Dado();
		dados = new Dado[2];
		dados[0] = new Dado();
		dados[1] = new Dado();
		jugador.tomarLosDados( dados[0], dados[1] );
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