package Parte02;

import java.util.LinkedList;

public class ProbadorDeApp {

    private ExpresionPostfija exp;
    private ConversorDeCadena conv;
    private Calculadora calc;
    private Teclado tcl;
    private Mensaje msj;

    public ProbadorDeApp() {
        exp = new ExpresionPostfija();
        tcl = new Teclado();
        msj = new Mensaje();
        calc = new Calculadora();
        conv = new ConversorDeCadena();
    }

    public void probarApp() {
        int i = 0;
        float res = (float) 0.0;
        String[] datos = null;
        String entrada = "";
        LinkedList historial = new LinkedList();
        while (!entrada.equalsIgnoreCase("n")) {
            if (i == 0) {
                msj.setCadena("Variable: X=0.0");
                msj.mostrarMensajeN();
            } else {
                String operador = datos[1];
                String numero = corregirNumero(datos[0], operador);
                res = calcularNuevoValor(operador, res, conv.convertirAFloat(numero));
                msj.desplegarRespuestaDelPrograma(numero, operador);
                historial.add(msj.getCadena());
            }
            entrada = obtenerEntrada();
            datos = exp.obtenerDatos(entrada);
            i++;
        }
        msj.desplegarResultadoFinal(res, historial);
    }

    public float calcularNuevoValor(String operador, float operadorA, float operadorB) {
        calc.setOperandos(operadorA, operadorB);
        float res = (float) 0.0;
        switch (operador) {
            case "+":
                res = calc.sumarNumeros();
                break;
            case "-":
                res = calc.restarNumeros();
                break;
            case "*":
                res = calc.multiplicarNumeros();
                break;
            case "/":
                res = calc.dividirNumeros();
                break;
            case "<<":
                res = calc.corrimientoALaIzquierda();
                break;
            case ">>":
                res = calc.corrimientoALaDerecha();
                break;
        }
        return res;
    }

    public String corregirNumero(String numero, String operador) {
        if (operador.equals("+") || operador.equals("-") || operador.equals("/")) {
            return numero.replace(operador, "");
        } else {
            return numero;
        }
    }

    public String obtenerEntrada() {
        msj.setCadena("Entrada al programa:");
        msj.mostrarMensajeF();
        return tcl.leerCadena();
    }

}
