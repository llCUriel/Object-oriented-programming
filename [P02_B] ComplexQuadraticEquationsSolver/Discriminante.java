/*
*@author Ian Alexander Ruiz González - 2CV3
*/

import java.lang.Math;

public class Discriminante {

    public double obtenerDiscriminante(double coeficienteA, double coeficienteB, double coeficienteC) {
        double valorUno = Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC;
        return valorUno;
    }

}