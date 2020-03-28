package Parte02;

public class ConversorDeLong {

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
        return "ConversorDeLong{"
                + "by=" + by
                + ", sh=" + sh
                + ", in=" + in
                + ", flo=" + flo
                + ", dou=" + dou
                + ", cha=" + cha
                + ", bool=" + bool
                + ", cadena=" + cadena + '}';
    }

    public ConversorDeLong(String cadena, byte by, short sh, int in, long lo, float flo, double dou, char cha, boolean bool) {
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

    public ConversorDeLong() {
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

    public void convLongToByte(long bol) {
        by = (byte) bol;
    }

    public void convLongToShort(long bol) {
        sh = (short) bol;
    }

    public void convLongToBool(long bol) {
        if (bol == 0) {
            bool = false;
        } else {
            bool = true;
        }
    }

    public void convLongToInt(long bol) {
        in = (int) bol;
    }

    public void convLongToFloat(long bol) {
        flo = (float) bol;
    }

    public void convLongToDouble(long bol) {
        dou = (double) bol;
    }

    public void convLongToChar(long bol) {
        cha = (char) bol;
    }

    public void convLongToString(long bol) {
        cadena = String.valueOf(bol);
    }

}
