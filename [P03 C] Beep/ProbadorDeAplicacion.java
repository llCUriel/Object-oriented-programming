package Beep;

public class ProbadorDeAplicacion {
    
    private Beep b;
    private Mensaje m;
        
    public void probarApp(){
        b = new Beep();
        m = new Mensaje();
        b.emitirBeep();
        m.setCadena("Hola mundo nuevamente"+" en todos los planetas");
        m.mostrarMensaje();
    }
    
}
