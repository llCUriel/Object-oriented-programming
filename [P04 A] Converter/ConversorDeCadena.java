package Parte02;

public class ConversorDeCadena {

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
        return "ConversorDeCadena{"
                + "by=" + by
                + ", sh=" + sh
                + ", in=" + in
                + ", lo=" + lo
                + ", flo=" + flo
                + ", dou=" + dou
                + ", cha=" + cha
                + ", bool=" + bool + "}";
    }

    public ConversorDeCadena(String cadena, byte by, short sh, int in, long lo, float flo, double dou, char cha, boolean bool) {
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

    public ConversorDeCadena() {
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

    public void convStringToByte(String cadena) {
        by = Byte.parseByte(cadena);
    }

    public void convStringToShort(String cadena) {
        sh = Short.parseShort(cadena);
    }

    public void convStringToInt(String cadena) {
        in = Integer.parseInt(cadena);
    }

    public void convStringToLong(String cadena) {
        lo = Long.parseLong(cadena);
    }

    public void convStringToFloat(String cadena) {
        flo = Float.parseFloat(cadena);
    }

    public void convStringToDouble(String cadena) {
        dou = Double.parseDouble(cadena);

    }

    public void convStringToChar(String cadena) {
        if (cadena.length() == 1) {
            cha = cadena.charAt(0);
        } else {
            cha = '\u0000';
            System.out.println("Únicamente cadenas con longitud uno");
        }

    }

    public void convStringToBoolean(String cadena) {
        bool = Boolean.parseBoolean(cadena);

    }
}
