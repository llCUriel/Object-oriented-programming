import java.util.LinkedList;

public class SumaDeNumero {
	private Teclado teclado;
	private LinkedList<Integer> numeros;
	private int suma;
	public SumaDeNumero() {
		numeros = new LinkedList<>();
		teclado = new Teclado();
		suma = 0;
	}
	protected void finalize() {
		teclado = null;
		numeros = null;
		System.gc();
	}
	public void sumarNumeros() {
		numeros.clear();
		int numero = 0;
		System.out.println( "Sumador de numeros." );
		System.out.println( "Para terminar introduzca un entero cero (0)." );
		do {
			System.out.print( "Dame un entero: " );
			numero = teclado.leerNumero();
			if( numero!=0 ) {
				numeros.add( numero );
				}
		} while( numero!=0 );
		if( numeros.size()>0 ) {
			System.out.println( "Los numeros: " );
			for( Integer integer: numeros ) {
				System.out.print( " " + integer );
				suma += integer;
				}
			System.out.println( );
			System.out.println( "La suma de los numeros es: " + suma );
			}
		else {
			System.out.println( "No introdujo ningun numero. " );
			}
	}
	public void obtenerMedia() {
		numeros.clear();
		int numero = 0;
		System.out.println( "Media de numeros." );
		System.out.println( "Para terminar introduzca un entero menor a cero (0)." );
		do {
			System.out.print( "Dame un entero: " );
			numero = teclado.leerNumero();
			if( numero>=0 ) {
				numeros.add( numero );
				}
		} while( numero>=0 );
		if( numeros.size()>0 ) {
			int suma = 0;
			System.out.println( "Los numeros: " );
			for( Integer integer: numeros ) {
				System.out.print( " " + integer );
				suma += integer;
				}
			System.out.println( );
			double media = (double)suma / numeros.size();
			System.out.println( "La media de los numeros es: " + media );
			}
		else {
			System.out.println( "No introdujo ningun numero. " );
			}
	}
}