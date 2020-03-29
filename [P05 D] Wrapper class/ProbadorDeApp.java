import java.util.Arrays;
import java.util.LinkedList;

public class ProbadorDeApp {

    private final Menu menuPrincipal;

    public ProbadorDeApp() {
        menuPrincipal = new Menu(inicializarOpciones(),
                "Menú de conversión de primitivos a objeto"
        );
    }

    public LinkedList inicializarOpciones() {
        String str0 = "> ";
        String str1 = "to";
        String str2 = "Object";
        return new LinkedList(Arrays.asList(
                str0 + "byte " + str1 + " Byte" + str2,
                str0 + "short " + str1 + " Short" + str2,
                str0 + "int " + str1 + " Integer" + str2,
                str0 + "long " + str1 + " Long" + str2,
                str0 + "float " + str1 + " Float" + str2,
                str0 + "double " + str1 + " Double" + str2,
                str0 + "boolean " + str1 + " Boolean" + str2,
                str0 + "char " + str1 + " Character" + str2,
                str0 + "Salir"
        ));
    }

    public void probarApp() {
        int opcionSeleccionada = menuPrincipal.desplegarMenu();
        new Mensaje(opcionSeleccionada + ">Ingrese un dato: ").mostrarMensajeF();
        Object nuevoObjeto = obtenerNuevoObjeto(opcionSeleccionada);
        if (nuevoObjeto != null) {
            String str = nuevoObjeto.getClass().getSimpleName() + " = ";
            new Mensaje(str + nuevoObjeto.toString()).mostrarMensajeN();
            new Mensaje("¿Desea realizar alguna otra operación? y/n").mostrarMensajeN();
            if (new Teclado().leerCadena().equalsIgnoreCase("y")) {
                probarApp();
            } else {
                System.exit(0);
            }
        } else {
            System.exit(0);
        }
    }

    public Object obtenerNuevoObjeto(int opcionesSeleccionada) {
        Teclado tcl = new Teclado();
        Object dato;
        switch (opcionesSeleccionada) {
            case 0:
                dato = (byte) tcl.leerByte();
                return (Byte) dato;
            case 1:
                dato = (short) tcl.leerShort();
                return (Short) dato;
            case 2:
                dato = (int) tcl.leerEntero();
                return (Integer) dato;
            case 3:
                dato = (long) tcl.leerLong();
                return (Long) dato;
            case 4:
                dato = (float) tcl.leerFloat();
                return (Float) dato;
            case 5:
                dato = (double) tcl.leerDouble();
                return (Double) dato;
            case 6:
                dato = tcl.leerCadena().equalsIgnoreCase("y");
                return (Boolean) dato;
            case 7:
                dato = (char) tcl.leerChar();
                return (Character) dato;
            default:
                return null;
        }
    }
}
