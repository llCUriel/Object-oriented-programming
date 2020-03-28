package Desbordamiento;

public class ProbadorDeAplicacion {

    private HerramientaDeDesbordamiento h;
    private Mensaje n;
    

    public void probarApp(){
        h = new HerramientaDeDesbordamiento();
        n = new Mensaje();
        n.setCadena(h.toString());
        n.mostrarMensaje();
        h.desbordarHaciaArriba();
        h.desbordarHaciaAbajo();
        n.setCadena(h.toString());
        n.mostrarMensaje();
    }

}
