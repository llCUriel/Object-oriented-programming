package Parte01;

public class Calculadora {

    private float operadorA;
    private float operadorB;
    private float resultado;

    public Calculadora() {
        this.operadorA = 0;
        this.operadorB = 0;
        this.resultado = 0;
    }

    public float sumarNumeros() {
        resultado = operadorA + operadorB;
        return resultado;
    }
    
    public void setOperandos(float operadorA, float operadorB){
        this.operadorA = operadorA;
        this.operadorB = operadorB;
    }

}
