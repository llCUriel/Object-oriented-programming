package Beep;

public class Beep {

    private Sonido s;

    public Beep() {
        s = new Sonido();
    }
    
    public void emitirBeep(){
        s.setSonidoAEmitir("beep");
        s.emitirSonido();
    }
}
