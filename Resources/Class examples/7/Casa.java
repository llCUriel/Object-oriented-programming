import java.util.Random;

public class Casa {
	public static void main( String  [] args ) {
		Random r = new Random();
		Persona paco = new Persona( "Francisco Villegas", 17, 55.4f, 172.0f, "Delgado" );
		System.out.println( paco );
		int respiro = r.nextInt( 20 );
		if( respiro>=0 && respiro<10 ) {
			paco.respirar( true, false );
			paco.comer( r.nextInt(24) );
		if( paco.caminar( "norte" ) ) {
			System.out.println( "Voy a la licoreria" );
			}
		else {
			System.out.println( "Voy a la iglesia" );
			}
		if( paco.dormir( r.nextInt( 24 ), "Playa" ) ) {
			System.out.println( "Durmiendo" );
			}
		else {
			System.out.println( "Despierto" );
			}
		paco.comer( r.nextInt(24), "Tacos" );
		paco.comer( r.nextInt(24), "Pizza", "Dominos" );
		paco.comer( r.nextInt(24), "Hamburguesa", "Cafeteria", "Luis" );
		int hambre = r.nextInt( 20 );
		if( hambre<10 ) {	
			paco.comer( r.nextInt(24), "Quesadillas", "Casa", "Mama", true );
			}	
		else {
			paco.comer( r.nextInt(24), "Quesadillas", "Casa", "Mama", false );
			}
			
			}
		else {
			paco.respirar( false );
			}
		
		
	}
}