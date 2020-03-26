public class Matriz {

    private int _numerodecolumnas;
    private int _numerodefilas;
    private double _matriz[][];

    public Matriz(int _fila) {
        this._numerodefilas = _fila;
        _numerodecolumnas = 0;
        _matriz = new double[_fila][];
        for (int i = 1; i <= _fila; i++) {
            _matriz[i - 1] = new double[i];
        }
    }

    public void ingresarElemento(int i, int j, double elemento) {
        for (int k = 0; k < _matriz.length; k++) {
            for (int l = 0; l < _matriz[k].length; l++) {
                if (k == i && l == j) {
                    _matriz[k][l] = elemento;
                }
            }
        }
    }

    public void mostrarMatriz() {
        try {
            for (int i = 0; i < _matriz.length; i++) {
                for (int j = 0; j < _matriz[i].length; j++) {
                    System.out.print(_matriz[i][j] + " ");
                }
                System.out.println();
            }
        } catch (NullPointerException e) {
            System.out.println("La matriz no contiene elementos");
        }
    }

    public int obtenerFila() {
        return _numerodefilas;
    }

    @Override
    public String toString() {
        String retornar
                = "> Columna: \n" + _numerodecolumnas
                + "> Fila: \n" + _numerodefilas
                + "> Arreglo: ";

        for (int i = 0; i < _matriz.length; i++) {
            for (int j = 0; j < _matriz[i].length; j++) {
                retornar += _matriz[i][j];
            }
        }
        return retornar;
    }

    protected void finalize() {
        _matriz = null;
        System.gc();
    }

}
