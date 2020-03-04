public class ProbadorDeAplicacion {
    private CalculadoraDeRaiz m;
    
    public ProbadorDeAplicacion(){
        m = new CalculadoraDeRaiz();
    }
    
    public void probarApp(){
        NumeroComplejo n = m.calcularRaiz(true, 5.0, 3.0, 4.0);
        System.out.println(n.toString());
        NumeroComplejo s = m.calcularRaiz(false, 5.0, 3.0, 4.0);
        System.out.println(s.toString());
    }



}
