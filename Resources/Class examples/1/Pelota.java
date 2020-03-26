public class Pelota {
	int tamanio;
	String color;
	@Override
	public boolean equals( Object obj ) {
		if( obj==null ) {
			return false;
			} 
		if( !(obj instanceof Pelota) ) {
			return false;
			}
		Pelota temporal = (Pelota)obj;
		return (tamanio==temporal.tamanio && color.equals( temporal.color ));
	}
	/**
	 * devuelve true si rebota en caso contrario devuelve 
	 * false
	 */ 
	public boolean rebotar( String accion ) {
		if( aventar( accion ) ) {
			return true;
			}
		return false;
	}
	public boolean rodar( String accion ) {
		if( !rebotar( accion ) || patear( accion ) ) {
			return true;
			}
		return false;
	}
	public boolean patear( String accion ) {
		if( correrTrasLaPelota( accion ) ) {
			return true;
			}
		return false;
	}
	public boolean aventar( String accion ) {
		if( levantar( accion ) ) {
			return true;
			}
		return false;
	}
	public boolean correrTrasLaPelota( String accion ) {
		switch( accion ) {
			case "patear":
			case "aventar":
				return true;
			default:
			return false;
			}
		//return false;
	}
	public boolean levantar( String accion ) {
		if( accion.equals( "levantar" ) ) {
			return true;
			}
		return false;
	}
	/*@Override
	public String toString() {
		return "Tamanio: " + tamanio + "\n" +
			"Color : " + color + "\n";
	}
	*/
}