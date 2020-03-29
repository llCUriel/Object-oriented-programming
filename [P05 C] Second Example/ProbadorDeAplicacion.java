package Parte01;

public class ProbadorDeAplicacion {

    private Calculadora calc;
    private ConversorDeCadena c1;
    private Teclado tcl;
    private Comparador cmp;

    public ProbadorDeAplicacion() {
        calc = new Calculadora();
        c1 = new ConversorDeCadena();
        tcl = new Teclado();
        cmp = new Comparador();
    }

    public void probarApp() {
        char c = '0';
        String str = "";
        float sum = (float) 0.0;
        int ban = 0;
        while (cmp.compararDatos(ban, 1)) {
            new Mensaje("Introduzca un flotante :: ").mostrarMensajeF();
            str = tcl.leerCadena();
            c = str.charAt(0);
            if (cmp.compararDatos(c, 'n')) {
                Float af = c1.convertirAFloat(str);
                calc.setOperandos(sum, af);
                sum = calc.sumarNumeros();
            } else {
                ban = 1;
            }

        }
        new Mensaje("La suma de sus n£meros es :: " + sum).mostrarMensajeN();
    }

}
