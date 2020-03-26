public class ProbadorChick {
	public static void main( String [] args ) {
		Chick chick = new Chick();
		chick.aChick();
		Chicken chicken = new Chicken();
		System.out.println( chicken.numEggs );
		System.out.println( chicken.name );
	}
}