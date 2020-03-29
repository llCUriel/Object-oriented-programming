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

    public float restarNumeros() {
        resultado = operadorA - operadorB;
        return resultado;
    }

    public float multiplicarNumeros() {
        resultado = operadorA * operadorB;
        return resultado;
    }

    public float dividirNumeros() {
        resultado = operadorA / operadorB;
        return resultado;
    }

    public float corrimientoALaDerecha() {
        resultado = operadorA / (2*operadorB);
        return Math.abs(resultado);
    }

    public float corrimientoALaIzquierda() {
        resultado = operadorA * (2*operadorB);
        return Math.abs(resultado);
    }

    public void setOperandos(float operadorA, float operadorB) {
        this.operadorA = operadorA;
        this.operadorB = operadorB;
    }

}
