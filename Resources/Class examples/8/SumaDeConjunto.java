/*
 * Suma de numeros.
 * Pedir numeros hasta que se teclee un 0 
 * Mostrar la suma de todos los numeros introducidos.
 */
import java.util.LinkedList;
import java.util.Scanner;

 
public class SumaDeConjunto {
	public static int leerNumero() {
 		Scanner teclado = new Scanner( System.in );
 		return teclado.nextInt();
 	}
	public static void main( String  [] args ) {
		LinkedList<Integer> numeros = new LinkedList<>();
		int numero = 0;
		System.out.println( "Sumador de numeros." );
		System.out.println( "Para terminar introduzca un entero cero (0)." );
		do {
			System.out.print( "Dame un entero: " );
			numero = leerNumero();
			if( numero!=0 ) {
				numeros.add( numero );
				}
		} while( numero!=0 );
		if( numeros.size()>0 ) {
			int suma = 0;
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
}