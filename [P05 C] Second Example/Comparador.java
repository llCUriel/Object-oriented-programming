package Parte01;

public class Comparador {

    private Object datoUno;
    private Object datoDos;
    private boolean resultado;

    public boolean compararDatos(Object datoUno, Object datoDos) {
        this.datoDos = datoDos;
        this.datoUno = datoUno;
        this.resultado = this.datoUno != this.datoDos;
        return resultado;
    }

}
