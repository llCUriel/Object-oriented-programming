package asesorias.P01B;

import java.lang.Math;

public class Discriminante {

    private double coeficienteA, coeficienteB, coeficienteC;

    public Discriminante() {
        this.coeficienteA = 0;
        this.coeficienteB = 0;
        this.coeficienteC = 0;
    }

    public boolean determinarTipoDeSolucion() {
        double valorDeDiscriminante = obtenerDiscriminante();
        return (valorDeDiscriminante > 0) ? true : false;
    }

    public double obtenerDiscriminante() {
        double valorUno = Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC;
        return Math.sqrt(valorUno);
    }

    public void setEcuacionCuadratica(double coeficienteA, double coeficienteB, double coeficienteC){
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }

    
    public double getCoeficienteA() {
        return coeficienteA;
    }

    public void setCoeficienteA(double coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    public double getCoeficienteB() {
        return coeficienteB;
    }

    public void setCoeficienteB(double coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public double getCoeficienteC() {
        return coeficienteC;
    }

    public void setCoeficienteC(double coeficienteC) {
        this.coeficienteC = coeficienteC;
    }

}
