import java.util.Scanner;

public class Teclado {

    private Scanner t;

    public Teclado() {
        t = new Scanner(System.in);
    }

    protected void finalize() {
        t = null;
        System.gc();
    }

    public String leerCadena() {
        return t.nextLine();
    }

}
