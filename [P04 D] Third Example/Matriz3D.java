public class Matriz3D {

    private int _ncolumnas;
    private int _nfilas;
    private int _profundidad;
    private double mat[][][];

    public Matriz3D(int _nfilas, int _ncolumnas, int _profundiad) {
        this._ncolumnas = _ncolumnas;
        this._nfilas = _nfilas;
        this._profundidad = _profundiad;
        mat = new double[_nfilas][_ncolumnas][_profundiad];
    }

    public void multiplicarIndices(Matriz3D _matriz) {
        for (int i = 0; i < _matriz.getnfilas(); i++) {
            for (int j = 0; j < _matriz.getncolumnas(); j++) {
                for (int k = 0; k < _matriz.getprofundiad(); k++) {
                    _matriz.mat[i][j][k] = i * j * k;
                }
            }
        }
    }

    public void mostrarMatriz3D(Matriz3D _matriz) {
        for (int i = 0; i < _matriz.getnfilas(); i++) {
            for (int j = 0; j < _matriz.getncolumnas(); j++) {
                for (int k = 0; k < _matriz.getprofundiad(); k++) {
                    System.out.print(_matriz.mat[i][j][k] + " ");
                }
                System.out.println();

            }
            System.out.println();
        }
    }

    public int getncolumnas() {
        return _ncolumnas;
    }

    public int getnfilas() {
        return _nfilas;
    }

    public int getprofundiad() {
        return _profundidad;
    }

    protected void finalize() {
        mat = null;
        System.gc();
    }

}
