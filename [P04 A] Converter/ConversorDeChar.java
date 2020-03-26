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
        try {
            by = (byte) caracter;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de char a byte");
        }
    }

    public void convCharToShort(char caracter) {
        try {

            sh = (short) caracter;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de char a short");
        }
    }

    public void convCharToInt(char caracter) {
        try {
            in = Character.getNumericValue(caracter);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de char a int");
        }
    }

    public void convCharToLong(char caracter) {
        try {
            lo = Character.getNumericValue(caracter);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de char a int");
        }
    }

    public void convCharToFloat(char caracter) {
        try {
            flo = (float) caracter;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de char a float");
        }
    }

    public void convCharToDouble(char caracter) {
        try {

            dou = (double) caracter;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de char a double");
        }
    }

    public void convCharToBool(char caracter) {
        try {
            switch (caracter) {
                case 'y':
                    bool = true;
                case 'n':
                    bool = false;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error al convertir de char a boolean");
        }
    }

    public void convCharToString(char caracter) {
        try {
            cadena = String.valueOf(caracter);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir de char a String");
        }
    }

}
