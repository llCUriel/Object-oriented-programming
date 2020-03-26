import java.util.Random;

public class Ninio {
	public static void main( String [] args ) {
		Pelota playera = new Pelota();
		System.out.println( playera );
		playera.tamanio = 7;
		playera.color = "Azul";
		Pelota pingPong = playera;
		System.out.println( playera==pingPong );
		pingPong = new Pelota();
		pingPong.tamanio = 7;
		pingPong.color = "Azul";
		Random r = new Random();
		String [] acciones = {
			"patear", "levantar", "aventar"
			};
		if( playera.rebotar( acciones[r.nextInt(3)] ) ) {
			System.out.println( "Pelota rebotando" );
			}
		if( playera.rodar( acciones[r.nextInt(3)] ) ) {
			System.out.println( "Pelota rodando" );
			}
		if( playera.correrTrasLaPelota( acciones[r.nextInt(3)] ) ) {
			System.out.println( "Corriendo Tras la Pelota" );
			}
		//System.out.println( "Tamanio: " + playera.tamanio );
		//System.out.println( "Color : " + playera.color );
		System.out.println( playera );
		System.out.println( playera==pingPong );
		System.out.println( playera.equals( pingPong ) );
	}
}