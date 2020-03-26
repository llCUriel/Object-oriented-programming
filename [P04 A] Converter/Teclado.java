package Parte02;

import java.util.Scanner;

public class Teclado {

    private Scanner t;

    public Teclado() {
        t = new Scanner(System.in);
    }

    protected void finalize() {
        t = null;
        System.gc();
    }

    public int leerEntero() {
        try {
            return t.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("Error.");
        }
        return 0;
    }

    public byte leerByte() {
        try {
            return t.nextByte();
        } catch (NumberFormatException e) {
            System.out.println("Error.");
        }
        return 0;
    }

    public short leerShort() {
        try {
            return t.nextShort();
        } catch (NumberFormatException e) {
            System.out.println("Error.");
        }
        return 0;
    }

    public long leerLong() {
        try {
            return t.nextLong();
        } catch (NumberFormatException e) {
            System.out.println("Error.");
        }
        return 0;
    }

    public float leerFloat() {
        try {
            return t.nextFloat();
        } catch (NumberFormatException e) {
            System.out.println("Error.");
        }
        return 0;
    }

    public double leerDouble() {
        try {
            return t.nextDouble();
        } catch (NumberFormatException e) {
            System.out.println("Error.");
        }
        return 0;
    }

    public char leerChar() {
        try {
            return t.nextLine().charAt(0);
        } catch (NumberFormatException e) {
            System.out.println("Error.");
        }
        return 0;
    }

    public boolean leerBool() {
        try {
            return t.nextBoolean();
        } catch (NumberFormatException e) {
            System.out.println("Error.");
        }
        return false;
    }

    public String leerCadena() {
        try {
            return t.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Error.");
        }
        return null;
    }

}
