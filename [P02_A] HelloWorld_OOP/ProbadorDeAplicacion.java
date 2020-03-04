package asesorias.P01A;

public class ProbadorDeAplicacion {

    private Mensaje nuevoMensaje;

    public ProbadorDeAplicacion() {
        this.nuevoMensaje = new Mensaje();
    }

    public void probarAplicacion(String cadena) {
        String miMensaje = cadena;
        this.nuevoMensaje = new Mensaje();
        if (miMensaje.length() <= 0) {
            this.nuevoMensaje.setCadena("Hola Java");
        } else {
            this.nuevoMensaje.setCadena(cadena);
        }
        nuevoMensaje.mostrarMensaje();
    }

    @Override
    public String toString() {
        return "ProbadorDeAplicacion{" + "nuevoMensaje=" + nuevoMensaje + '}';
    }

}
