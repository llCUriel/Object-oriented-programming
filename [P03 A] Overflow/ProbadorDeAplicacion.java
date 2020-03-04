package Desbordamiento;

public class ProbadorDeAplicacion {

    private HerramientaDeDesbordamiento h;
    private Mensaje n;
    
    public ProbadorDeAplicacion() {
        h = new HerramientaDeDesbordamiento();
        n = new Mensaje();
    }
    
    public void probarApp(){
        n.setCadena(h.toString());
        n.mostrarMensaje();
        h.desbordarHaciaArriba();
        h.desbordarHaciaAbajo();
        n.setCadena(h.toString());
        n.mostrarMensaje();
    }

}
