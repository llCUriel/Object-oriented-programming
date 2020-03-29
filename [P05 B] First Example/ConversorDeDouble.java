
public class ConversorDeDouble {

    private Double number;

    public ConversorDeDouble() {
        number = new Double(0.0);
    }

    public double convertirADouble(Double number) {
        this.number = number;
        return this.number.doubleValue();
    }

}
