/
 * El juego de adivinar un numero. 
 * Para ello pedir un numero "n", 
 * ir pidiendo numeros indicando “mayor” o “menor” segun sea la comparacion 
 * con respecto a "n". 
 * El juego termina cuando el usuario acierta.
 */
 import java.util.Scanner;
 import java.util.Random;
 
 public class AdivinaElNumero {
 	public static int leerNumero() {
 		Scanner teclado = new Scanner( System.in );
 		return teclado.nextInt();
 	}
 	public static int obtenerElNumero( int limite ) {
 		Random r = new Random();
 		return r.nextInt( limite );
 	}
 	public static void main( String [] args ) {
 		System.out.println( "Juego: Adivina el numero. " );
 		System.out.print( "Obteniendo numero ... " );
 		int n = obtenerElNumero( 100 );
 		System.out.println( "hecho" );
 		int numero = 0;
 		do {
 			System.out.print( "Que numero es? " );
 			numero = leerNumero();
 			if( n<numero ) {
 				System.out.println( "Menor ... " );
 				}
 			else {
 				System.out.println( "Mayor ... " );
 				}
 		} while( n!=numero );
 		System.out.println( "Acertaste " );
 	}
 }