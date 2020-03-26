public class ProbandoSuma {
	public static void main( String [] args ) {
		SumaDeNumero suma = new SumaDeNumero();
		suma.sumarNumeros();
		suma.obtenerMedia();
		
		suma = null;
		System.gc();
	}
}