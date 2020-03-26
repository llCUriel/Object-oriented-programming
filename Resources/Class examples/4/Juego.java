import java.util.Scanner;

public class Juego {
	public static void main( String [] args ) {
		JuegoDeDado juego = new JuegoDeDado();
		juego.jugar( "Luis" );
	}
/*
	int dadoUno;
	int dadoDos;
	String jugador;
	public void tomarDados() {
		System.out.println( "Tomando los dados" );
	}
	public int elegirCombinacion() {
		Scanner teclado = new Scanner( System.in );
		System.out.println( "Introduzca un valor entero (2 y 12): " );
		int numero = 0;
		do {
			numero = teclado.nextInt();
		} while( numero<2 || numero>12 );
		return numero;
	}
	public void agitarDados() {
		System.out.println( "Agitando los dados" );
	}
	public void tirarLosDados() {
		dadoUno = (int)(Math.random()*6.0) + 1;
		dadoDos = (int)(Math.random()*6.0) + 1;
	}
	public void jugar( String nombre ) {
		jugador = nombre;
		tomarDados();
		int miNumero = elegirCombinacion();
		agitarDados();
		tirarLosDados();
		if( miNumero==(dadoUno+dadoDos) ) {
			System.out.println( jugador + " GANASTE con " + miNumero );
			}
		else {
			System.out.println( jugador + " intentelo de nuevo " + 
			miNumero + " |= " + (dadoUno+dadoDos) );
			}
	}
	*/
}