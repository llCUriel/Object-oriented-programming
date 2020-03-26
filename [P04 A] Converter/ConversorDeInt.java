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
        return "ConversorDeBoolean{"
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
        try {
            by = (byte) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de int a byte");
        }

    }

    public void convIntToShort(int bol) {
        try {
            sh = (short) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de int a short");
        }
    }

    public void convIntToLong(int bol) {
        try {
            lo = (long) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de int a long");
        }
    }

    public void convIntToDouble(int bol) {
        try {
            dou = (double) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de int a double");
        }
    }

    public void convIntToChar(int bol) {
        try {
            cha = (char) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de int a char");
        }
    }

    public void convIntToBool(int bol) {
        try {
            if (bol == 0) {
                bool = false;
            } else {
                bool = true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de int a bool");
        }
    }

    public void convIntToFloat(int valor) {
        try {
            flo = (float) valor;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de int a float");
        }
    }

    public void convIntToString(int bol) {
        try {
            cadena = String.valueOf(bol);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de int a String");
        }
    }
}
