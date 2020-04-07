public class probadorDeApp {

    private VentanaThread vtn;
    private Teclado tcl;

    public probadorDeApp() {
        vtn = new VentanaThread();
        tcl = new Teclado();
    }

    public void probarApp() {
        vtn.start();
        Integer valor = 0;
        try {
            while (valor >= 0 && valor <= 100) {
                new Mensaje("Ingrese un número entero entre (0-100) : ").mostrarMensajeF();
                String str = tcl.leerCadena();
                valor = Integer.parseInt(str);
                vtn.getVtn().actualizarValor(valor);
            }
            System.exit(0);
        } catch (NumberFormatException e) {
            System.exit(0);
        }
    }
}
