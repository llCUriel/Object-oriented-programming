package Parte02;

public class ConversorDeBoolean {

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
                + ", lo=" + lo
                + ", flo=" + flo
                + ", dou=" + dou
                + ", cha=" + cha
                + ", cadena=" + cadena + '}';
    }

    public ConversorDeBoolean(String cadena, byte by, short sh, int in, long lo, float flo, double dou, char cha, boolean bool) {
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

    public ConversorDeBoolean() {
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

    public void convBooleanToByte(boolean bol) {
        try {
            by = (byte) (bol ? 1 : 0);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de boolean a byte");
        }
    }

    public void convBooleanToShort(boolean bol) {
        try {
            sh = (short) (bol ? 1 : 0);

        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de boolean a short");
        }
    }

    public void convBooleanToInt(boolean bol) {
        try {
            in = (bol) ? 1 : 0;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de boolean a  int");
        }
    }

    public void convBooleanToLong(boolean bol) {
        try {
            lo = (bol) ? 1L : 0L;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de boolean a long");
        }
    }

    public void convBooleanToFloat(boolean bol) {
        try {
            flo = (bol) ? 1.0f : 0.0f;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de boolean a float");
        }
    }

    public void convBooleanToDouble(boolean bol) {
        try {
            dou = (bol) ? 1.0d : 0.0d;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de boolean a double");
        }
    }

    public void convBooleanToChar(boolean bol) {
        try {
            cha = (bol) ? '1' : '0';
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de boolean a char");
        }
    }

    public void convBooleanToString(boolean bol) {
        try {
            cadena = String.valueOf(bol);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de boolean a String");
        }
    }

}
