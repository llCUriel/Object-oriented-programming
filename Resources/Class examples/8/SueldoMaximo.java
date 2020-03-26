/
 * Pedir un numero n, introducir n sueldos, y mostrar el sueldo maximo y el minimo.
 */
import java.util.LinkedList;
import java.util.Scanner;

public class SueldoMaximo {
	public static double leerNumero() {
 		Scanner teclado = new Scanner( System.in );
 		return teclado.nextDouble();
 	}
 	public static void encontrarSueldoMaximoYMinimo( LinkedList<Double> lista ) {
 		double sueldoMaximo = -100000.0;
 		double sueldoMinimo =  100000.0;
 		String dollarHour = " (Dollars/hour)";
 		if( lista.size()>0 ) {
 			System.out.println( " Los sueldos son" + dollarHour + ": " );
 			for( Double unSueldo: lista ) {
 				System.out.print( " $" + unSueldo );
 				if( unSueldo>sueldoMaximo ) {
 					sueldoMaximo = unSueldo;
 					}
 				if( unSueldo<sueldoMinimo ) {
 					sueldoMinimo = unSueldo;
 					}
 				}
 			System.out.println( );
 			System.out.println( " El sueldo maximo es $" + sueldoMaximo + dollarHour );
 			System.out.println( " El sueldo minimo es $" + sueldoMinimo + dollarHour );
 			}
 		else {
 			System.out.println( " No hay ningun sueldo. " );
 			}
 		
 	}
	public static void main( String [] args ) {
		LinkedList<Double> sueldos = new LinkedList<>();
		double sueldo = 0.0;
		System.out.println( "Sueldo maximo." );
		System.out.println( "Para terminar introduzca un flotante cero (0.0)." );
		do {
			System.out.print( "Dame un sueldo: " );
			sueldo = leerNumero();
			if( sueldo!=0 ) {
				sueldos.add( sueldo );
				}
		} while( sueldo!=0 );
		encontrarSueldoMaximoYMinimo( sueldos );
	}
}