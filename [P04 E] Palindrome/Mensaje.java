public class Mensaje {

    private String mensaje;

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Mensaje() {
        this.mensaje = null;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void mostrarMensaje() {
        System.out.println(mensaje);
    }

    public String toString() {
        return "Mensaje: " + mensaje;
    }

    protected void finalize() {
        mensaje = null;
        System.gc();
    }
}
