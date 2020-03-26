import java.util.Scanner;

public class Jugador {
	private String nombre;
	private int miNumero;
	private Dado dadoUno;
	private Dado dadoDos;
	public void tomarLosDados( Dado dadoUno, Dado dadoDos ) {
		this.dadoUno = dadoUno;
		this.dadoDos = dadoDos;
	}
	private void elegirCombinacion() {
		Scanner teclado = new Scanner( System.in );
		System.out.println( "Introduzca un valor entero (2 y 12): " );
		//miNumero = 0;
		do {
			miNumero = teclado.nextInt();
		} while( miNumero<2 || miNumero>12 );
	}
	private void agitarDados() {
		System.out.println( "Agitando los dados" );
	}
	public int tirarLosDados() {
		elegirCombinacion();
		agitarDados();
		return dadoUno.mostrarCara() + 
		dadoDos.mostrarCara();
	}
	public int getMiNumero() {
		return miNumero;
	} 
	public void setNombre( String nombre ) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
}