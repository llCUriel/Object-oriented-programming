package Parte01;

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

    public float leerFloat() {
        return t.nextFloat();
    }

    public String leerCadena() {
        return t.nextLine();
    }

}
