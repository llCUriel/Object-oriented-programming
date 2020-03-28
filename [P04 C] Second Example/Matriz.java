package Parte04;

public class Matriz {

    private int numerodecolumnas;
    private int numerodefilas;
    private double _matriz[][];

    public Matriz(int _tamaniodematriz) {
        this.numerodefilas = _tamaniodematriz;
        this.numerodecolumnas = _tamaniodematriz;
        _matriz = new double[_tamaniodematriz][_tamaniodematriz];
    }

    public void ingresarElemento(int _posx, int _posy, double _elemento) {
        for (int k = 0; k < _matriz.length; k++) {
            for (int l = 0; l < _matriz[k].length; l++) {
                if (k == _posx && l == _posy) {
                    _matriz[k][l] = _elemento;
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

    public void llenarMatrizConPatronUno(Matriz _matriz) {
        int _auxiliar = 0;
        for (int i = 0; i < _matriz.getFila(); i++) {
            for (int j = 0; j < _matriz.getColumna(); j++) {
                _matriz.ingresarElemento(i, j, _auxiliar);
                _auxiliar++;
            }
            _auxiliar = 0;
        }
    }

    public void llenarMatrizConPatronDos(Matriz _matriz) {
        int _auxiliar = 0;
        for (int i = 0; i < _matriz.getFila(); i++) {
            for (int j = 0; j < _matriz.getColumna(); j++) {
                _matriz.ingresarElemento(i, j, _auxiliar);
            }
            _auxiliar++;
        }
    }

    private double obtenerElemento(int _posx, int _posy) {
        double _elemento = 0.0d;
        for (int k = 0; k < this.getFila(); k++) {
            for (int l = 0; l < this.getColumna(); l++) {
                if (k == _posx && _posy == l) {
                    _elemento = _matriz[k][l];
                }
            }
        }
        return _elemento;
    }

    public void multiplicarElementoAElemento(Matriz _tmatriz, Matriz _umatriz, Matriz _dmatriz) {
        for (int i = 0; i < _tmatriz.getFila(); i++) {
            for (int j = 0; j < _tmatriz.getFila(); j++) {
                _tmatriz.ingresarElemento(i, j, _umatriz.obtenerElemento(i, j) * _dmatriz.obtenerElemento(i, j));
            }
        }
    }

    protected void finalize() {
        _matriz = null;
        System.gc();
    }

    public int getFila() {
        return numerodefilas;
    }

    public int getColumna() {
        return numerodecolumnas;
    }

    @Override
    public String toString() {
        String retornar
                = "> Columna: \n" + numerodecolumnas
                + "> Fila: \n" + numerodefilas
                + "> Arreglo: ";

        for (int i = 0; i < _matriz.length; i++) {
            for (int j = 0; j < _matriz[i].length; j++) {
                retornar += _matriz[i][j];
            }
        }
        return retornar;
    }

}
