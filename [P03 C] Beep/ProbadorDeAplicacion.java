package Beep;

public class ProbadorDeAplicacion {
    
    private Beep b;
    private Mensaje m;
    
    public ProbadorDeAplicacion(){
        b = new Beep();
        m = new Mensaje();
    }
    
    public void probarApp(){
        b.emitirBeep();
        m.setCadena("Hola mundo nuevamente"+" en todos los planetas");
        m.mostrarMensaje();
    }
    
}
