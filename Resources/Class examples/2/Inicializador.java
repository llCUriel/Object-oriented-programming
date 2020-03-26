public class Inicializador {
	boolean check;
	byte b1;
	short s1;
	int i1;
	long l1;
	float e;
	double pi;
	char ca;
	String name;
	public Inicializador() {
		System.out.println( check );
		System.out.println( b1 );
		System.out.println( s1 );
		System.out.println( i1 );
		System.out.println( l1 );
		System.out.println( e );
		System.out.println( pi );
		System.out.println( name );
		
	}
	public static void main( String [] args ) {
		new Inicializador();
	}
}