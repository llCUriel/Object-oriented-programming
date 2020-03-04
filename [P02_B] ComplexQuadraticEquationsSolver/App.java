
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        LinkedList coeficientes = new LinkedList();
        ProbadorDeAplicacion miAplicacion = new ProbadorDeAplicacion();
        String cadena = "";
        for (String arg : args) {
            cadena += (arg + " ");
        }
        String h[] = cadena.split(" ", -1);
        for (int i = 0; i < h.length; i++) {
            if (h[i].length() > 0) {
                coeficientes.add(Double.parseDouble(h[i]));
            }
        }
        miAplicacion.probarApp((double) coeficientes.get(0), (double) coeficientes.get(1), (double) coeficientes.get(2));
    }
}
