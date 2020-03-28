package Parte05;

import java.util.Scanner;

public class AppMatriz3D {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a, b, c;
        a = n.nextInt();
        b = n.nextInt();
        c = n.nextInt();
        ProbadorDeAplicacion m = new ProbadorDeAplicacion(a,b,c);
        m.probarAplicacion();

    }

}
