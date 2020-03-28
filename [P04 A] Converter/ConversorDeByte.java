package Parte02;

public class ConversorDeByte {

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
        return "ConversorDeByte{"
                + ", sh=" + sh
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

    public ConversorDeByte() {
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

    public void convByteToShort(byte bol) {
        sh = (short) bol;
    }

    public void convByteToInt(byte bol) {
        in = (int) bol;
    }

    public void convByteToLong(byte bol) {
        lo = (long) bol;
    }

    public void convByteToDouble(byte bol) {
        dou = (double) bol;
    }

    public void convByteToChar(byte bol) {
        cha = (char) bol;
    }

    public void convByteToBool(byte bol) {
        if (bol == 0) {
            bool = false;
        } else {
            bool = true;
        }

    }

    public void convByteToFloat(byte valor) {
        flo = (float) valor;
    }

    public void convByteToString(byte bol) {
        cadena = String.valueOf(bol);
    }

}
