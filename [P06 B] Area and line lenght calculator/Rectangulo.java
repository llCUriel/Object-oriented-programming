public class Rectangulo extends FiguraBidimensional {

    private double baseDelRectangulo, alturaDelRectangulo;

    public Rectangulo(double baseDelRectanglo, double alturaDelRectangulo) {
        this.baseDelRectangulo = baseDelRectanglo;
        this.alturaDelRectangulo = alturaDelRectangulo;
    }

    @Override
    public double calcularArea() {
        return baseDelRectangulo * alturaDelRectangulo;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (baseDelRectangulo + alturaDelRectangulo);
    }

    public double getBaseDelRectangulo() {
        return baseDelRectangulo;
    }

    public double getAlturaDelRectangulo() {
        return alturaDelRectangulo;
    }

}
