import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ProbadorDeAplicacion m = new ProbadorDeAplicacion();
        new Mensaje("Ingrese una cadena: ").mostrarMensaje();
        m.setMsj(new Mensaje(s.nextLine()));
        m.probarApp();
    }

}
