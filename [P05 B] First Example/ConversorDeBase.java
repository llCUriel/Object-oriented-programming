
public class ConversorDeBase {

    private int base;
    private char caracter;

    public ConversorDeBase() {
        this.base = 0;
        this.caracter = '0';
    }

    public int convertirCaracter(char caracter, int base) {
        this.caracter = caracter;
        this.base = base;
        return Character.digit(this.caracter, this.base);
    }
}
