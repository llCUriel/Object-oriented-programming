package asesorias.P01B;

public class EcuacionCuadratica {

    private double a, b, c;
    private NumeroComplejo raizUno;
    private NumeroComplejo raizDos;

    public EcuacionCuadratica() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.raizUno = new NumeroComplejo();
        this.raizDos = new NumeroComplejo();
    }

    public void mostrarEcuacionCuadratica() {

    }

    public void setEcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public NumeroComplejo getRaizUno() {
        return raizUno;
    }

    public void setRaizUno(NumeroComplejo raizUno) {
        this.raizUno = raizUno;
    }

    public NumeroComplejo getRaizDos() {
        return raizDos;
    }

    public void setRaizDos(NumeroComplejo raizDos) {
        this.raizDos = raizDos;
    }

}
