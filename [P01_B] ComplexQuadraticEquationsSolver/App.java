package asesorias.P01B;

import asesorias.P01A.*;

public class App {

    public static void main(String[] args) {
        String cadena = "";
        for (String arg : args) {
            cadena+=(arg+" ");
        }
        ProbadorDeAplicacion miAplicacion = new ProbadorDeAplicacion();
        miAplicacion.probarAplicacion(cadena);
    }
}

