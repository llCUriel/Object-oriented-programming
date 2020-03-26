public class Chick { 
/*
	public Chick() {
		System.out.println("in constructor"); 
	}
	public void aChick() { 
		System.out.println( "NOT A CONSTRUCTOR" );
	} // NOT A CONSTRUCTOR
	*/
	private String name = "Fluffy";
	{ System.out.println("setting field"); } 
	public Chick() {
		System.out.println( name );
		name = "Tiny";
		System.out.println("setting constructor"); 
	}
	public static void main(String[] args) { 
		Chick chick = new Chick();
		System.out.println(chick.name); 
	}
}