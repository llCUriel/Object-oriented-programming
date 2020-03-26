import java.util.Random;

public class Casa {
	public static void main( String  [] args ) {
		Random r = new Random();
		Persona paco = new Persona();
		int respiro = r.nextInt( 20 );
		if( respiro>=0 && respiro<10 ) {
			paco.respirar( true );
			paco.comer( r.nextInt(24) );
		if( paco.caminar( "norte" ) ) {
			System.out.println( "Voy a la licoreria" );
			}
		else {
			System.out.println( "Voy a la iglesia" );
			}
		if( paco.dormir( r.nextInt( 24 ) ) ) {
			System.out.println( "Durmiendo" );
			}
		else {
			System.out.println( "Despierto" );
			}
			
			
			
			}
		else {
			paco.respirar( false );
			}
		
		
	}
}