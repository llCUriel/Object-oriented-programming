package asesorias.P01B;
import java.lang.Math;

public class NumeroComplejo {
    
    private double parteImaginaria, parteReal;
    
    public NumeroComplejo(){
        this.parteImaginaria = 0;
        this.parteReal = 0;
    }

    public double obtenerMagnitud(){
        return Math.sqrt(Math.pow(parteReal, 2) + Math.pow(parteImaginaria, 2));
    }
    
    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }
    
    public void setNumeroComplejo(double parteReal, double parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;        

    }

    @Override
    public String toString() {
        return "NumeroComplejo{" + "parteImaginaria=" + parteImaginaria + ", parteReal=" + parteReal + '}';
    }
    
   
}
