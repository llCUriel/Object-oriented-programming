package Parte02;

public class ConversorDeInt {

    private byte by;
    private short sh;
    private int in;
    private long lo;
    private float flo;
    private double dou;
    private char cha;
    private boolean bool;
    private String cadena;

    @Override
    public String toString() {
        return "ConversorDeInt{"
                + "by=" + by
                + ", sh=" + sh
                + ", lo=" + lo
                + ", flo=" + flo
                + ", dou=" + dou
                + ", cha=" + cha
                + ", bool=" + bool
                + ", cadena=" + cadena + '}';
    }

    public ConversorDeInt(String cadena, byte by, short sh, int in, long lo, float flo, double dou, char cha, boolean bool) {
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

    public ConversorDeInt() {
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

    public void convIntToByte(int bol) {
        by = (byte) bol;
    }

    public void convIntToShort(int bol) {
        sh = (short) bol;
    }

    public void convIntToLong(int bol) {
        lo = (long) bol;
    }

    public void convIntToDouble(int bol) {
        dou = (double) bol;
    }

    public void convIntToChar(int bol) {
        cha = (char) bol;
    }

    public void convIntToBool(int bol) {
        if (bol == 0) {
            bool = false;
        } else {
            bool = true;
        }
    }

    public void convIntToFloat(int valor) {
        flo = (float) valor;
    }

    public void convIntToString(int bol) {
        cadena = String.valueOf(bol);
    }
}
