package asesorias.P01A;

public class Mensaje {

    private String cadena;

    public Mensaje() {
        this.cadena = "";
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public void mostrarMensaje() {
        System.out.println(this.cadena);
    }

    @Override
    public String toString() {
        return "Mensaje{" + "cadena=" + cadena + '}';
    }
    

}
