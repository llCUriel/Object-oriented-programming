/
 * Media de un conjunto de numeros. 
 * Pedir numeros hasta que se introduzca uno negativo 
 * Calcular la media.
 */
import java.util.LinkedList;
import java.util.Scanner;

 
public class MediaDeConjunto {
	public static int leerNumero() {
 		Scanner teclado = new Scanner( System.in );
 		return teclado.nextInt();
 	}
	public static void main( String  [] args ) {
		LinkedList<Integer> numeros = new LinkedList<>();
		int numero = 0;
		System.out.println( "Media de numeros." );
		System.out.println( "Para terminar introduzca un entero menor a cero (0)." );
		do {
			System.out.print( "Dame un entero: " );
			numero = leerNumero();
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