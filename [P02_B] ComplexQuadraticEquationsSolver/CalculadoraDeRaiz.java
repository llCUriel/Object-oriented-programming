
public class CalculadoraDeRaiz {

    private Discriminante disc;
    private NumeroComplejo raizUno;
    private NumeroComplejo raizDos;

    public CalculadoraDeRaiz() {
        disc = new Discriminante();
        raizUno = new NumeroComplejo();
        raizDos = new NumeroComplejo();
    }

    public NumeroComplejo calcularRaiz(boolean bandera, EcuacionCuadratica ec) {

        disc.setDiscriminante(ec.getA(), ec.getB(), ec.getC());
        
        double menosB =  -1*ec.getB();
        double dosVecesA = 2 * ec.getA();
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
