public class Persona {
	private String nombre;
	private int edad;
	private float peso;
	private float altura;
	private String complexion;
	public boolean estarDurmiendo( int hora ) {
		return dormir( hora );
	}
	/**
	 * la hora va de 0 a 23
	 */ 
	public boolean dormir( int hora ) {
		if( hora>1 && hora<6 ) {
			return true;
			}
		return false;
	}
	/**
	 * la hora va de 0 a 23
	 */ 
	public void comer( int hora ) {
		if( hora>=8 && hora<9 ) {
			System.out.println( "Desayunando" );
			}
		else 
		if( hora>=18 && hora<19 ) {
			System.out.println( "Comiendo" );
			}
		else 
		if( hora>=23 && hora<1 ) {
			System.out.println( "Cenando" );
			}
	}
	public boolean caminar( String direccion ) {
		switch( direccion ) {
			case "norte":
				return true;
			case "sur":
			case "este":
			case "oeste":
				return false;
			}
		return false;
	}
	public void respirar( boolean respiro ) {
		if( respiro ) {
			System.out.println( "Estoy vivo" );
			}
		else {
			System.out.println( "Estoy muerto" );
			}
	}
}