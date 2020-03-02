package asesorias.P01B;

public class CalculadoraDeRaiz {

    private Calculadora miCalculadora;
    private Discriminante disc;
    private NumeroComplejo raizUno;
    private NumeroComplejo raizDos;
    private EcuacionCuadratica nuevaEcuacion;

    public CalculadoraDeRaiz() {
        miCalculadora = new Calculadora();
        disc = new Discriminante();
        raizUno = new NumeroComplejo();
        raizDos = new NumeroComplejo();
        nuevaEcuacion = new EcuacionCuadratica();
    }

    public NumeroComplejo calcularRaiz(boolean bandera, double coeficienteA, double coeficienteB, double coeficienteC) {

        nuevaEcuacion.setEcuacionCuadratica(coeficienteA, coeficienteB, coeficienteC);

        double valorUno = (-1) * nuevaEcuacion.getB();
        double valorDos = 2 * nuevaEcuacion.getA();
        double valorDeDiscriminante = disc.obtenerDiscriminante();
        
        if (bandera) {

            double resultadoUno = (valorUno +  valorDeDiscriminante)/valorDos;
            double resultadoDos = (valorUno -  valorDeDiscriminante)/valorDos;
            raizUno.setParteReal(resultadoUno);
            raizDos.setParteReal(resultadoDos);
            //En el caso real
        } else {
            
          
            //En el caso imaginario
        }
        return null;

    }
}
