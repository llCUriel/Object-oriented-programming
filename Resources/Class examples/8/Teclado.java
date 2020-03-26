import java.util.Scanner;

public class Teclado {
	private Scanner teclado;
	public Teclado() {
		teclado = new Scanner( System.in );
	}
	public int leerNumero() {
 		return teclado.nextInt();
 	}
 	protected void finalize() {
 		teclado = null;
 		System.gc();
 	}
}