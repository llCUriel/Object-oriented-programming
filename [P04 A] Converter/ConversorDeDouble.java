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
            by = (byte) valor;
 
    }

    public void convDoubleToShort(double valor) {
            sh = (short) valor;
    }

    public void convDoubleToInt(double valor) {
            in = (int) valor;
    }

    public void convDoubleToLong(double valor) {
            lo = (long) valor;
    }

    public void convDoubleToFloat(double valor) {
            flo = (float) valor;
    }

    public void convDoubleToChar(double valor) {
            cha = (char) valor;
    }

    public void convDoubleToBoolean(double valor) {
            if (valor == 0) {
                bool = false;
            } else {
                bool = true;
            }
    }

    public void convDoubleToString(double valor) {
            cadena = Double.toString(valor);
    }
}
