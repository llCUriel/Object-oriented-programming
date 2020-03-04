
public class ProbadorDeAplicacion {

    private CalculadoraDeRaiz m;
    private EcuacionCuadratica n;

    public ProbadorDeAplicacion() {
        m = new CalculadoraDeRaiz();
        n = new EcuacionCuadratica();
    }

    public void probarApp(double coeficienteA, double coeficienteB, double coeficienteC) {

        n.setEcuacionCuadratica(coeficienteA, coeficienteB, coeficienteC);
        n.mostrarEcuacionCuadratica();
        NumeroComplejo raizUno = m.calcularRaiz(true, n);
        NumeroComplejo raizDos = m.calcularRaiz(false, n);
        
        System.out.println("Raiz Uno: "+raizUno.toString());
        
        System.out.println("Raiz Dos: "+raizDos.toString());

    }

}
