package Parte05;

public class ProbadorDeAplicacion {

    private Matriz3D _matriz;

    public ProbadorDeAplicacion(int _filas, int _columnas, int _profundidad) {
        _matriz = new Matriz3D(_filas, _columnas, _profundidad);
    }

    public void probarAplicacion() {
        _matriz.multiplicarIndices(_matriz);
        _matriz.mostrarMatriz3D(_matriz);
    }

    protected void finalize() {
        _matriz = null;
        System.gc();
    }

}
