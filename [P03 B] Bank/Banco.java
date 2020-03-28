package Parte01;

public class Banco {
  
    public UsuarioDeBanco darDeAltaUsuario(String nombreCompleto) {
        UsuarioDeBanco n = new UsuarioDeBanco();
        n.setNombreCompleto(nombreCompleto);
        return n;
    }

    public void emitirCheque(UsuarioDeBanco emisor, Integer montoDelCheque) {
        Integer maximoMontoDelCheque = 999999999;
        if (montoDelCheque <= maximoMontoDelCheque && montoDelCheque > 0) {
            Cheque c = new Cheque();
            c.mostrarCheque(montoDelCheque,emisor);
        }
    }

}
