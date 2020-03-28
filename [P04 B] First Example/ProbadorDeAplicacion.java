package Parte03;

public class ProbadorDeAplicacion {

    private Matriz _matriz;

    public ProbadorDeAplicacion(int _numerodefilas) {
        _matriz = new Matriz(_numerodefilas);
    }

    public void probarApp() {
        int col = 0;
        for (int i = 0; i < _matriz.obtenerFila(); i++) {
            for (int j = 0; j <= i; j++) {
                _matriz.ingresarElemento(i, j, col++);
            }
        }
        _matriz.mostrarMatriz();
    }

    protected void finalize() {
        _matriz = null;
        System.gc();
    }

}
