/*
*@author Ian Alexander Ruiz González - 2CV3
*/

import java.lang.Math;

public class Raiz {  

    private double parteImaginaria, parteReal;//no se asigna valor 

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
    
    public void setRaiz(double parteReal, double parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
    
    @Override
    public String toString() {
        return "Raiz{" + "parteReal=" + parteReal + ", parteReal=" + parteImaginaria + '}';
    }
}