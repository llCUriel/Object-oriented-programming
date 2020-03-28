package Parte02;

public class ConversorDeChar {

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
        return "ConversorDeChar{"
                + "by=" + by
                + ", sh=" + sh
                + ", in=" + in
                + ", lo=" + lo
                + ", flo=" + flo
                + ", dou=" + dou
                + ", bool=" + bool
                + ", cadena=" + cadena + '}';
    }

    public ConversorDeChar(String cadena, byte by, short sh, int in, long lo, float flo, double dou, char cha, boolean bool) {
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

    public ConversorDeChar() {
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

    public void convCharToByte(char caracter) {
        by = (byte) caracter;
    }

    public void convCharToShort(char caracter) {
        sh = (short) caracter;
    }

    public void convCharToInt(char caracter) {
        in = Character.getNumericValue(caracter);
    }

    public void convCharToLong(char caracter) {
        lo = Character.getNumericValue(caracter);
    }

    public void convCharToFloat(char caracter) {
        flo = (float) caracter;
    }

    public void convCharToDouble(char caracter) {
        dou = (double) caracter;
    }

    public void convCharToBool(char caracter) {
        switch (caracter) {
            case 'y':
                bool = true;
            case 'n':
                bool = false;
        }
    }

    public void convCharToString(char caracter) {
        cadena = String.valueOf(caracter);
    }

}
