import java.text.DecimalFormat;

public class Recta extends FiguraUnidimensional {

    private Punto puntoInicial;
    private Punto puntoFinal;

    public Recta(Punto puntoInicial, Punto puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
    }

    public Punto getPuntoInicial() {
        return puntoInicial;
    }

    public Punto getPuntoFinal() {
        return puntoFinal;
    }

    @Override
    public double calcularLongitud() {
        double x1 = puntoInicial.getCoordenadaX();
        double y1 = puntoInicial.getCoordenadaY();
        double x2 = puntoFinal.getCoordenadaX();
        double y2 = puntoFinal.getCoordenadaY();
        double operandoA = Math.pow(x2 - x1, 2);
        double operandoB = Math.pow(y2 - y1, 2);
        return Math.sqrt(operandoA + operandoB);
    }

    public String obtenerEcuacionDeLaRecta() {
        DecimalFormat df = new DecimalFormat("#.00");

        double x1 = puntoInicial.getCoordenadaX(), y1 = puntoInicial.getCoordenadaY();
        double x2 = puntoFinal.getCoordenadaX(), y2 = puntoFinal.getCoordenadaY();

        if (x2 == x1 && y2 == y1) {
            return "";
        } else {
            double resta = x2 - x1;
            double m = (y2 - y1);

            if (resta == 0) {
                m = 0;
            } else {
                m = m / resta;
            }
            double b = y2 - m * x2;

            String str = " + ";
            if (b < 0) {
                str = " - ";
            }

            if (m == 0 && b == 0) {
                return "f(x) = 0";
            } else if (m == 0 && b != 0) {
                return "f(x) = " + df.format(b);
            } else if (m != 0 && b == 0) {
                return "f(x) = " + df.format(m) + "x";
            } else {
                return "f(x) = " + df.format(m) + "x" + str + df.format(b);
            }
        }
    }
}
