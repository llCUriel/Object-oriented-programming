
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
        nuevaEcuacion.mostrarEcuacionCuadratica();
        disc.setDiscriminante(coeficienteA, coeficienteB, coeficienteC);
        
        double menosB =  -1*nuevaEcuacion.getB();
        double dosVecesA = 2 * nuevaEcuacion.getA();
        double valorDeDiscriminante = disc.obtenerDiscriminante();
        double raizDeDiscriminante = 0.0;
        
        if (bandera) {
            
            if (valorDeDiscriminante <= 0) {
                
                raizDeDiscriminante = Math.sqrt(-1*valorDeDiscriminante);
                        
                raizUno.setParteReal(menosB/dosVecesA);
                
                raizUno.setParteImaginaria((-1*raizDeDiscriminante)/dosVecesA);
                // Tiene parte imaginarira y +
                
                
            } else{
                raizDeDiscriminante = Math.sqrt(valorDeDiscriminante);
                raizUno.setParteReal((menosB+valorDeDiscriminante)/dosVecesA);
            }
            
            return raizUno;

        } else {

            if (valorDeDiscriminante <= 0) {
                 raizDeDiscriminante = Math.sqrt(-1*valorDeDiscriminante);
                 
                raizDos.setParteReal(menosB/dosVecesA);
                raizDos.setParteImaginaria((raizDeDiscriminante)/dosVecesA);
                // Tiene parte imaginarira y -
            } else{
                raizDeDiscriminante = Math.sqrt(valorDeDiscriminante);
                raizDos.setParteReal((menosB-raizDeDiscriminante)/dosVecesA);
                // Cuando es puramente real y -
            }   
            return raizDos;
        }
    }
}
