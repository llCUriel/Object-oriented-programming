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
        return "ConversorDeBoolean{"
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
        try {
            by = (byte) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de float a byte");
        }
    }

    public void convFloatToShort(float bol) {
        try {
            sh = (short) bol;

        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de float a short");
        }
    }

    public void convFloatToInt(float bol) {
        try {
            in = (int) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de float a  int");
        }
    }

    public void convFloatToLong(float bol) {
        try {
            lo = (long) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de float a long");
        }
    }

    public void convFloatToDouble(float bol) {
        try {
            dou = (double) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de float a double");
        }
    }

    public void convFloatToChar(float bol) {
        try {
            cha = (char) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de float a char");
        }
    }

    public void convFloatToBool(float bol) {
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

    public void convFloatToString(float bol) {
        try {
            cadena = String.valueOf(bol);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de float a String");
        }
    }

}
