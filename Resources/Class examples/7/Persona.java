public class Persona {
	private String nombre;
	private int edad;
	private float peso;
	private float altura;
	private String complexion;
	public Persona() {
		this( "", 0, 0.0f, 0.0f, "" );
	}
	public Persona( String nombre, int edad, float peso,
		float altura, String complexion ) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.complexion = complexion;	
	}
	public Persona( Persona alguien ) {
		this.nombre = alguien.nombre;
		this.edad = alguien.edad;
		this.peso = alguien.peso;
		this.altura = alguien.altura;
		this.complexion = alguien.complexion;
	}
	@Override
	public String toString() {
		return "nombre =" + nombre + "\n" +
				"edad =" + edad + "\n" +
				"peso =" + peso + "\n" +
				"altura =" + altura + "\n" +
				"complexion =" + complexion + "\n";
	}
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
	public boolean dormir( int hora, String donde ) {
		if( dormir( hora ) ) {
			System.out.println( " En " + donde );
			return true;
			}
		return false;
	}
	public boolean dormir( int hora, String donde, boolean cansado ) {
		if( dormir( hora, donde ) ) {
			System.out.println( " Cansado " + cansado );
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
	public void comer( int hora, String comida ) {
		comer( hora );
		System.out.println( " " + comida );
	}
	/*
	public boolean comer( int hora, String comida ) {
		comer( hora );
		System.out.println( " " + comida );
		return false;
	}*/
	
	public void comer( int hora, String comida, String enDonde ) {
		comer( hora, comida );
		System.out.println( " " + enDonde );
	}
	public void comer( int hora, String comida, String enDonde, 
		String conQuien ) {
		comer( hora, comida, enDonde );
		System.out.println( " " + conQuien );
	}
	public void comer( int hora, String comida, String enDonde, 
		String conQuien, boolean satisfecho ) {
		comer( hora, comida, enDonde, conQuien );
		if( satisfecho ) {
			System.out.println( " Satisfecho " );
			}
		else {
			System.out.println( " Necesito postre " );
			}
	}
	public boolean comer( int hora, String comida, boolean hambre ) {
		if( hambre ) {
			comer( hora );
			System.out.println( " " + comida );
			return true;
			}
		return false;
	}
	/*
	public boolean comer( int horaDeComer, String comidaCorrida, boolean tieneHambre ) {
		if( tieneHambre ) {
			comer( horaDeComer );
			System.out.println( " " + comidaCorrida );
			return true;
			}
		return false;
	}*/
	public boolean comer( String comida, boolean hambre, int hora ) {
		if( hambre ) {
			comer( hora );
			System.out.println( " " + comida );
			return true;
			}
		return false;
	}
	public boolean comer( boolean hambre, int hora, String comida ) {
		if( hambre ) {
			comer( hora );
			System.out.println( " " + comida );
			return true;
			}
		return false;
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
	public void respirar( boolean respiro, boolean tieneAsma ) {
		respirar( respiro );
		if( tieneAsma  ) {
			System.out.println( "Con dificultad" );
			}
		else {
			System.out.println( "Sin problema" );
			}
	}
}