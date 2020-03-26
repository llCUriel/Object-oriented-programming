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
        return "ConversorDeBoolean{"
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
        try {
            by = (byte) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de long a byte");
        }

    }

    public void convLongToShort(long bol) {
        try {
            sh = (short) bol;

        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de long a short");
        }
    }

    public void convLongToBool(long bol) {
        try {

            if (bol == 0) {
                bool = false;
            } else {
                bool = true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de long a bool");
        }

    }

    public void convLongToInt(long bol) {
        try {
            in = (int) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de boolean a  int");
        }

    }

    public void convLongToFloat(long bol) {
        try {
            flo = (float) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de boolean a float");
        }

    }

    public void convLongToDouble(long bol) {
        try {
            dou = (double) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de boolean a double");
        }

    }

    public void convLongToChar(long bol) {
        try {
            cha = (char) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de boolean a char");
        }

    }

    public void convLongToString(long bol) {
        try {
            cadena = String.valueOf(bol);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de boolean a String");
        }

    }

}
