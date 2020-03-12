
import java.util.List;

/*
*@author Ian Alexander Ruiz González - 2CV3
*/
public class Calculadora {
    
    private EcuacionCuadratica coeficientesABC; 
    private FormulaGeneral ecuacionGeneral; 

    public void calcularValores(double coeficienteA, double coeficienteB, double coeficienteC) {

        coeficientesABC = new EcuacionCuadratica();
        ecuacionGeneral = new FormulaGeneral();

        coeficientesABC.setEcuacionCuadratica(coeficienteA, coeficienteB, coeficienteC);
        coeficientesABC.mostrarEcuacionCuadratica();
        
        Raiz m [] =  m = ecuacionGeneral.calcularRaices(coeficientesABC);
        
        for (int i = 0; i < m.length; i++) {
            System.out.println("X"+(i+1)+" :"+m[i].toString());
        }
    }
}