public class Circulo extends FiguraBidimensional {

    private double radioDelCirculo;
    private final double PI = Math.PI;

    public Circulo(double radioDelCirculo) {
        this.radioDelCirculo = radioDelCirculo;
    }

    @Override
    public double calcularArea() {
        return this.areaDeFigura = PI * Math.pow(radioDelCirculo, 2);
    }

    @Override
    public double calcularPerimetro() {
        return this.perimetroDeFigura = 2 * PI * radioDelCirculo;
    }

    public double getRadioDelCirculo() {
        return radioDelCirculo;
    }
}
