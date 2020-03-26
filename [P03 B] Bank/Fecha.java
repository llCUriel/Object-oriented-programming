package Parte01;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {

    private Date fechaActual;
    private DateFormat formatoFecha;

    public Fecha() {
        fechaActual = new Date();
        formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    }

    protected void finalize() {
        fechaActual = null;
        formatoFecha = null;
        System.gc();
    }

    public String obtFechaActual() {
        return formatoFecha.format(fechaActual);
    }
}
