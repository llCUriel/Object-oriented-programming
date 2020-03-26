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
        try {
            sh = (short) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de int a short");
        }
    }

    public void convByteToInt(byte bol) {
        try {
            in = (int) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de byte a  int");
        }
    }

    public void convByteToLong(byte bol) {
        try {
            lo = (long) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de byte a long");
        }
    }

    public void convByteToDouble(byte bol) {
        try {
            dou = (double) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de byte a double");
        }
    }

    public void convByteToChar(byte bol) {
        try {
            cha = (char) bol;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de byte a char");
        }
    }

    public void convByteToBool(byte bol) {
        try {
            if (bol == 0) {
                bool = false;
            } else {
                bool = true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de byte a bool");
        }
    }

    public void convByteToFloat(byte valor) {
        try {
            flo = (float) valor;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de byte a float");
        }
    }

    public void convByteToString(byte bol) {
        try {
            cadena = String.valueOf(bol);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de float a String");
        }
    }

}
