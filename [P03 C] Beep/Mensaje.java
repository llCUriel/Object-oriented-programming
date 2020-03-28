package Beep;

public class Mensaje {
    
    private String cadena;
    
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    
    public void mostrarMensaje(){
        System.out.println(cadena);
    }
    
}
