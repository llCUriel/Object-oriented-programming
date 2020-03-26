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
        return "ConversorDeBoolean{"
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
        try {
            flo = (float) valor;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de short a float");
        }
    }

    public void convShortToByte(short bol) {
        try {
            by = (byte) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de short a byte");
        }

    }

    public void convShortToInt(short bol) {
        try {
            in = (int) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de short a  int");
        }

    }

    public void convShortToLong(short bol) {
        try {
            lo = (long) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de short a long");
        }

    }

    public void convShortToDouble(short bol) {
        try {
            dou = (double) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de short a double");
        }

    }

    public void convShortToChar(short bol) {
        try {
            cha = (char) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de short a char");
        }

    }

    public void convShortToBool(short bol) {
        try {
            if (bol == 0) {
                bool = false;
            } else {
                bool = true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de short a bool");
        }

    }

    public void convShortToString(short bol) {
        try {
            cadena = String.valueOf(bol);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de float a String");
        }

    }

}
