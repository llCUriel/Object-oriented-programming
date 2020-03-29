package Parte01;


public class ConversorDeFloat {

    private Float number;

    public ConversorDeFloat() {
        number = new Float(0.0);
    }

    public float convertirAFloat(Float number) {
        this.number = number;
        return this.number.floatValue();
    }

}
