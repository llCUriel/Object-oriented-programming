package Parte02;

public class ConversorDeShort {

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
        return "ConversorDeShort{"
                + "by=" + by
                + ", in=" + in
                + ", lo=" + lo
                + ", flo=" + flo
                + ", dou=" + dou
                + ", cha=" + cha
                + ", bool=" + bool
                + ", cadena=" + cadena + '}';
    }

    protected void finalize() {
        cadena = null;
        System.gc();
    }

    public ConversorDeShort() {
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

    public void convShortToFloat(short valor) {
        flo = (float) valor;

    }

    public void convShortToByte(short bol) {
        by = (byte) bol;
    }

    public void convShortToInt(short bol) {
        in = (int) bol;
    }

    public void convShortToLong(short bol) {
        lo = (long) bol;
    }

    public void convShortToDouble(short bol) {
        dou = (double) bol;
    }

    public void convShortToChar(short bol) {
        cha = (char) bol;
    }

    public void convShortToBool(short bol) {
        if (bol == 0) {
            bool = false;
        } else {
            bool = true;
        }

    }

    public void convShortToString(short bol) {
        cadena = String.valueOf(bol);

    }

}
