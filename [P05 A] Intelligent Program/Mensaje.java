package Parte02;

import Parte01.*;
import java.util.LinkedList;

public class Mensaje {

    private String cadena;

    public Mensaje(String cadena) {
        this.cadena = cadena;
    }

    public Mensaje() {
        this.cadena = "";
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public void mostrarMensajeN() {
        System.out.println(cadena);
    }

    public void mostrarMensajeF() {
        System.out.print(cadena);
    }

    public void desplegarRespuestaDelPrograma(String numero, String operador) {
        String str = "Respuesta del programa: ";
        String aux = "";
        if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")) {
            aux = "X" + operador + "=" + numero;
        } else if (operador.equals(">>") || operador.equals("<<")) {
            aux = "X=(X" + operador + numero + ")";
        }
        str += aux;
        this.cadena = aux;

        System.out.println(str);
    }

    public void desplegarResultadoFinal(float resultado, LinkedList historial) {
        String str1 = "Respuesta del programa: ";
        String str2 = "El resultado de sus operaciones ";
        String salidaFinal = str1 + str2 + " ";
        for (int i = 0; i < historial.size(); i++) {
            if (i == historial.size() - 1) {
                salidaFinal += (historial.get(i).toString() + " es "+resultado);
            } else {
                salidaFinal += (historial.get(i).toString() + " , ");
            }
        }
        System.out.println(salidaFinal);
    }

}
