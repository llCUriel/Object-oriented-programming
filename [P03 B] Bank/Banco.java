package Parte01;

public class Banco {

    private String nombreDelBanco = "";

    public Banco(String nombreDelBanco) {
        this.nombreDelBanco = nombreDelBanco;
    }

    public Banco() {
        this.nombreDelBanco = "Banco Patito de Mexico";
    }

    public UsuarioDeBanco darDeAltaUsuario(String nombreCompleto) {
        return new UsuarioDeBanco(nombreCompleto);
    }

    public void emitirCheque(UsuarioDeBanco emisor, Integer montoDelCheque) {
        Integer maximoMontoDelCheque = 999999999;
        if (montoDelCheque <= maximoMontoDelCheque && montoDelCheque > 0) {
            Cheque c = new Cheque(montoDelCheque, emisor);
            c.mostrarCheque();
        }
    }

}
