package Beep;

public class Beep {

    private Sonido s;
    
    public void emitirBeep(){
        s = new Sonido();
        s.setSonidoAEmitir("beep");
        s.emitirSonido();
    }
}
