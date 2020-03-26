package asesorias.P01A;

public class AppSaludo {

    public static void main(String[] args) {
        String cadena = "";
        for (String arg : args) {
            cadena+=(arg+" ");
        }
        ProbadorDeAplicacion miAplicacion = new ProbadorDeAplicacion();
        miAplicacion.probarAplicacion(cadena);
    }
}

