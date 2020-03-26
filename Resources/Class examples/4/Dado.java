public class Dado {
	private final int NUM_CARAS = 6;
	private int caraSuperior;
	public int mostrarCara() {
		caraSuperior = (int)(Math.random()*NUM_CARAS) + 1;
		return caraSuperior;
	}
}