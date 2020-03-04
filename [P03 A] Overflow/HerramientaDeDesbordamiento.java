package Desbordamiento;


public class HerramientaDeDesbordamiento {
    
    private int numeroPositivo, numeroNegativo;
    

    public HerramientaDeDesbordamiento(int numeroPositivo, int numeroNegativo){
        this.numeroPositivo = numeroPositivo;
        this.numeroNegativo = numeroNegativo;
    }

    public HerramientaDeDesbordamiento(){
        this.numeroPositivo = Integer.MAX_VALUE;
        this.numeroNegativo = Integer.MIN_VALUE;
    }    
    public int desbordarHaciaArriba(){
        return numeroPositivo+=1;
    }
    public int desbordarHaciaAbajo(){
        return numeroNegativo-=1;
    }    

    public int getNumeroPositivo() {
        return numeroPositivo;
    }

    public void setNumeroPositivo(int numeroPositivo) {
        this.numeroPositivo = numeroPositivo;
    }

    public int getNumeroNegativo() {
        return numeroNegativo;
    }

    public void setNumeroNegativo(int numeroNegativo) {
        this.numeroNegativo = numeroNegativo;
    }

    @Override
    public String toString() {
        return "HerramientaDeDesbordamiento{" + "numeroPositivo=" + numeroPositivo + ", numeroNegativo=" + numeroNegativo + '}';
    }
    
    
}
