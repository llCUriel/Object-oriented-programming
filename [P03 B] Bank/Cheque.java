package Parte01;

import java.util.Arrays;
import java.util.LinkedList;

public class Cheque {

    private Fecha fecha;
    private Integer montoDelCheque;
    private UsuarioDeBanco emisor;

    public Cheque() {
        this.montoDelCheque = 0;
        this.fecha = new Fecha();
    }
    
    public Cheque(Integer montoDelCheque, UsuarioDeBanco emisor){
        this.montoDelCheque = montoDelCheque;
        this.emisor = emisor;
        this.fecha = new Fecha();
    }

    public void mostrarCheque() {
        ConversorDeNumeroALetra conversor = new ConversorDeNumeroALetra();
        Mensaje m = new Mensaje();

        String nombreDeUsuario = emisor.getNombreCompleto();
        String conversionDeNumero = conversor.convertirNumeroALetra(montoDelCheque);
        String fechaActual = fecha.obtFechaActual();

        LinkedList<String> plantilla = obtenerPlantillaDeCheque();
        LinkedList<String> datos = new LinkedList<String>(Arrays.asList(fechaActual, nombreDeUsuario, conversionDeNumero, nombreDeUsuario));
        
        int i = 0;
        while (i < datos.size()) {
            String str01 = plantilla.get(i);
            String str02 = datos.get(i);
            if (i == 2) {
                str02+=  "\t\t" + "$ "+Integer.toString(montoDelCheque);
            }
            m.setMensaje(str01 + str02);
            m.mostrarMensaje();
            i++;
        }
    }

    private LinkedList<String> obtenerPlantillaDeCheque() {
        String str01 = "Banco Patito de Mexico \t\t\t\t\t\tFecha: ";
        String str02 = "Nombre: ";
        String str03 = "Cantidad c/letra: ";
        String str04 = "Firma: ";
        return new LinkedList<String>(Arrays.asList(str01, str02, str03, str04));
    }

    protected void finalize() {
        fecha = null;
        emisor = null;
        System.gc();
    }

}
