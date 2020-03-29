import java.util.LinkedList;

public class Mensaje {

    private String cadena;

    public Mensaje(String cadena) {
        this.cadena = cadena;
    }

    public Mensaje() {
        this.cadena = "";
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public void mostrarMensajeN() {
        System.out.println(cadena);
    }

    public void mostrarMensajeF() {
        System.out.print(cadena);
    }



}
