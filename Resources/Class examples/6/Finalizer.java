public class Finalizer { 
	protected void finalize() {
		System.out.println("Calling finalize"); 
	}
	public static void main(String... $n) { 
		Finalizer f = new Finalizer();
		f.finalize();
	}
}