public class Jugador {
	private Teclado teclado;
	public Jugador() {
		teclado = new Teclado();
	}
	public int ingresarNumero() {
		return teclado.leerNumero();
	}
	protected void finalize() {
		teclado = null;
		System.gc();
	}
}