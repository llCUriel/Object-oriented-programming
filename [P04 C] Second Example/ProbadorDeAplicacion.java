public class ProbadorDeAplicacion {

    private Matriz _matriz[];

    public ProbadorDeAplicacion(int _tamaniodematriz) {
        _matriz = new Matriz[_tamaniodematriz];
        for (int i = 0; i < _matriz.length; i++) {
            _matriz[i] = new Matriz(_tamaniodematriz);
        }
    }

    public void probarAplicacion() {
        llenarConPatron();
        mostrarResultado();
    }

    private void llenarConPatron() {
        _matriz[0].llenarMatrizConPatronUno(_matriz[0]);
        _matriz[1].llenarMatrizConPatronDos(_matriz[1]);
    }

    private void mostrarResultado() {
        _matriz[2].multiplicarElementoAElemento(_matriz[2], _matriz[0], _matriz[1]);
        _matriz[2].mostrarMatriz();
    }

    protected void finalize() {
        for (int i = 0; i < _matriz.length; i++) {
            _matriz[i] = null;
        }
        System.gc();
    }

}
