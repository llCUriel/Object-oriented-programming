package asaasa;

import java.util.Scanner;

public class ProbadorDeAplicacion {

    private conversorBoolean conversorUno;
    private Scanner myObj;
    private String misOpciones[];

    public ProbadorDeAplicacion() {
        conversorUno = new conversorBoolean();
        myObj = new Scanner(System.in);
        misOpciones = inicializarArregloDeCadenas();
    }

    public void probarApp() {
        mostrarMenuDeOpciones();
        mostrarSubMenu(myObj.nextInt());
    }

    public void convertirTipoDeDato(int opc, Object tipoDeDato){
        switch (opc) {
            case 0:
                
                break;
            default:
                throw new AssertionError();
        }
    }
    public void mostrarSubMenu(int opc) {
        String cad = " Convertir a ";
        for (int i = 0; i < misOpciones.length; i++) {
            if (opc != i) {
                System.out.println(i + cad + misOpciones[i]);
            }
        }
    }

    public void mostrarMenuDeOpciones() {
        String cad = " Conversor de ";
        for (int i = 0; i < misOpciones.length; i++) {
            System.out.println(i + cad + misOpciones[i]);
        }
    }

    public String[] inicializarArregloDeCadenas() {
        String misOpciones[] = {"Byte",
            "Short",
            "Int",
            "Long",
            "Float",
            "Double",
            "Boolean",
            "Char",
            "String"};
        return misOpciones;
    }
}
