/*
*@author Ian Alexander Ruiz González - 2CV3
*/

public class EcuacionCuadratica {

    private double a, b, c;

    public void mostrarEcuacionCuadratica() {
        //Todo positivo
        if (b >= 0 && c >= 0) {
            System.out.println("\nTu ecuación cuadrática es: f(x)="+a + "x^2+" + b + "x+" + c);
        } 
        //c negativa
        else if (b >= 0 && c < 0) {
            System.out.println("\nTu ecuación cuadrática es: f(x)="+a + "x^2+" + b + "x" + c);
        } 
        //b negativa
        else if(b <0 && c >=0){
            System.out.println("\nTu ecuación cuadrática es: f(x)="+a + "x^2" + b + "x+" + c);        
        }
        //Ultimo caso no escrito, todo negativo
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
}