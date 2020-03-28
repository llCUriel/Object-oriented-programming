package Parte01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {

    private Date fechaActual;
    private DateFormat formatoFecha;

    public String obtFechaActual() {
        fechaActual = new Date();
        formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        return formatoFecha.format(fechaActual);
    }
}
