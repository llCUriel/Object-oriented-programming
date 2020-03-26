package Beep;

import java.awt.Toolkit;

public class Sonido {

    private String sonidoAEmitir;

    public Sonido(String sonidoAEmitir) {
        this.sonidoAEmitir = sonidoAEmitir;
    }

    public Sonido() {
        this.sonidoAEmitir = "";
    }

    public String getSonidoAEmitir() {
        return sonidoAEmitir;
    }

    public void setSonidoAEmitir(String sonidoAEmitir) {
        this.sonidoAEmitir = sonidoAEmitir;
    }

    @Override
    public String toString() {
        return "Sonido{" + "sonidoAEmitir=" + sonidoAEmitir + '}';
    }

    public void emitirSonido() {
        if (sonidoAEmitir.equalsIgnoreCase("beep")) {
            Toolkit.getDefaultToolkit().beep();
        }
    }

}
