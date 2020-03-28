package Parte02;

public class ConversorDeFloat {

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
        return "ConversorDeFloat{"
                + "by=" + by
                + ", sh=" + sh
                + ", in=" + in
                + ", lo=" + lo
                + ", dou=" + dou
                + ", cha=" + cha
                + ", bool=" + bool
                + ", cadena=" + cadena + '}';
    }

    protected void finalize() {
        cadena = null;
        System.gc();
    }

    public ConversorDeFloat() {
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

    public void convFloatToByte(float bol) {
            by = (byte) bol;
    }

    public void convFloatToShort(float bol) {
        sh = (short) bol;
    }

    public void convFloatToInt(float bol) {
        in = (int) bol;
    }

    public void convFloatToLong(float bol) {
        lo = (long) bol;
    }

    public void convFloatToDouble(float bol) {
        dou = (double) bol;
    }

    public void convFloatToChar(float bol) {
        cha = (char) bol;
    }

    public void convFloatToBool(float bol) {
        if (bol == 0) {
            bool = false;
        } else {
            bool = true;
        }
    }

    public void convFloatToString(float bol) {
        cadena = String.valueOf(bol);
    }

}
