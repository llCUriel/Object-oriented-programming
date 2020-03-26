/*
 *@author Ian Alexander Ruiz González - 2CV3
 */

import java.lang.Math;

public class FormulaGeneral {

    private Discriminante discriminante;
    private Raiz raizUno;
    private Raiz raizDos;

    public Raiz[] calcularRaices(EcuacionCuadratica ecuacionGeneral) {
        discriminante = new Discriminante();
        raizUno = new Raiz();
        raizDos = new Raiz();
        
        double valorA = ecuacionGeneral.getA(), valorB = ecuacionGeneral.getB(), valorC = ecuacionGeneral.getC();
        double menosB = -1 * valorB;
        double dosVecesA = 2 * valorA;
        double valorDeDiscriminante = discriminante.obtenerDiscriminante(valorA, valorB, valorC);
        double raizDeDiscriminante = Math.sqrt(Math.abs(valorDeDiscriminante));
        double fraccionA = menosB/dosVecesA;
        double fraccionB = raizDeDiscriminante / dosVecesA;
        
        if (valorDeDiscriminante <= 0) {
            raizUno.setParteReal(fraccionA);
            raizUno.setParteImaginaria(-1*fraccionB);
            raizDos.setParteReal(fraccionA);
            raizDos.setParteImaginaria(fraccionB);
        } else {
            raizUno.setParteReal(fraccionA + fraccionB);
            raizDos.setParteReal(fraccionA - fraccionB);
        }
        return new Raiz[]{raizUno,raizDos};
    }
}
