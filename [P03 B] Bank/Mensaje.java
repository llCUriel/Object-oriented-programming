package Parte01;


public class Mensaje {

    private String mensaje;

  

    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }

    public void mostrarMensaje() {
        System.out.println(mensaje);
    }

    public String toString(){
            return "Mensaje: "+mensaje;
    }

 
}