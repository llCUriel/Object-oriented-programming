import java.util.LinkedList;

public class Menu {

    private LinkedList opcionesDeMenu;
    private String tituloDelMenu;
    private int opcionSeleccionada;

    public Menu(LinkedList opcionesDeMenu, String tituloDelMenu) {
        this.opcionesDeMenu = opcionesDeMenu;
        this.tituloDelMenu = tituloDelMenu;
    }

    public int obtenerOpcionSeleccionada() {
        new Mensaje("Ingrese una opción [0-" + (opcionesDeMenu.size() - 1) + "]: ").mostrarMensajeF();
        this.opcionSeleccionada = Integer.parseInt(new Teclado().leerCadena());
        return opcionSeleccionada;
    }

    public void desplegarMenu() {
        int i = 0;
        new Mensaje(tituloDelMenu).mostrarMensajeN();
        while (i < opcionesDeMenu.size()) {
            new Mensaje(i + opcionesDeMenu.get(i).toString()).mostrarMensajeN();
            i++;
        }
    }
}
