package Parte02;

public class ConversorDeDouble {

    private String cadena;
    private byte by;
    private short sh;
    private int in;
    private long lo;
    private float flo;
    private double dou;
    private char cha;
    private boolean bool;

    @Override
    public String toString() {
        return "ConversorDeDouble{"
                + "by=" + by
                + ", sh=" + sh
                + ", in=" + in
                + ", lo=" + lo
                + ", flo=" + flo
                + ", cha=" + cha
                + ", bool=" + bool
                + ", cadena=" + cadena + '}';
    }

    public ConversorDeDouble(String cadena, byte by, short sh, int in, long lo, float flo, double dou, char cha, boolean bool) {
        this.cadena = cadena;
        this.by = by;
        this.sh = sh;
        this.in = in;
        this.lo = lo;
        this.flo = flo;
        this.dou = dou;
        this.cha = cha;
        this.bool = bool;

    }

    protected void finalize() {
        cadena = null;
        System.gc();
    }

    public ConversorDeDouble() {
        cadena = null;
        by = 0;
        sh = 0;
        in = 0;
        lo = 0L;
        flo = 0.0f;
        dou = 0.0d;
        cha = '\u0000';
        bool = false;
    }

    public void convDoubleToByte(double valor) {
        try {
            by = (byte) valor;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de double a byte");
        }
    }

    public void convDoubleToShort(double valor) {
        try {
            sh = (short) valor;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de double a short");
        }
    }

    public void convDoubleToInt(double valor) {
        try {
            in = (int) valor;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de double a int");
        }
    }

    public void convDoubleToLong(double valor) {
        try {
            lo = (long) valor;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de double a long");
        }
    }

    public void convDoubleToFloat(double valor) {
        try {
            flo = (float) valor;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de double a float");
        }
    }

    public void convDoubleToChar(double valor) {
        try {
            cha = (char) valor;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de double a char");
        }
    }

    public void convDoubleToBoolean(double valor) {
        try {
            if (valor == 0) {
                bool = false;
            } else {
                bool = true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de double a boolean");
        }
    }

    public void convDoubleToString(double valor) {
        try {
            cadena = Double.toString(valor);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de double a String");
        }
    }
}
