public class ConversorDeCadena {

    private String str;

    public ConversorDeCadena() {
        this.str = "";
    }

    public Double convertirADouble(String str) {
        this.str = str;
        return Double.valueOf(str);
    }

    public Float convertirAFloat(String str) {
        this.str = str;
        return Float.valueOf(str);
    }

}
