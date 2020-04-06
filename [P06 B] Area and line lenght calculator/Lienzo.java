import java.awt.*;
import java.text.DecimalFormat;

public final class Lienzo extends Canvas {

    private final int tamanioEnX, tamanioEnY;
    private int idFigura;
    private Object figuraAPintar;
    private Graphics2D g2d;

    public Lienzo(int tamanioEnX, int tamanioEnY, int idDeFigura, Object figuraAPintar) {
        this.tamanioEnX = tamanioEnX;
        this.tamanioEnY = tamanioEnY;
        this.idFigura = idDeFigura;
        this.figuraAPintar = figuraAPintar;
    }

    @Override
    public void paint(Graphics g) {
        this.g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, tamanioEnX, tamanioEnY);
        g2d.setColor(Color.BLACK);
        if (idFigura == 0) {
            representarRectangulo((Rectangulo) figuraAPintar);
        } else if (idFigura == 1) {
            representarCirculo((Circulo) figuraAPintar);
        } else if (idFigura == 2) {
            representarRecta((Recta) figuraAPintar);
        }
    }

    public void representarCirculo(Circulo circ) {
        DecimalFormat df = new DecimalFormat("#.00");
        String str = "Circulo";
        Color colorDeCadenas = new Color(19, 38, 97);
        int centroEnX = tamanioEnX / 2;
        int centroEnY = tamanioEnY / 2;
        double radio = circ.getRadioDelCirculo();
        double aux = radio;
        if (radio > 550) {
            radio = 550;
        }
        g2d.setColor(Color.RED);
        g2d.fillOval((int) (centroEnX - radio / 2), (int) (centroEnY - radio / 2), (int) radio, (int) radio);
        g2d.setStroke(new BasicStroke((float) (2.5)));
        g2d.setColor(Color.BLACK);
        g2d.drawLine(centroEnX, centroEnY, (int) (centroEnX - radio / 2), centroEnY);
        String StrRadio = "R = " + String.valueOf(df.format(aux)) + " [U]";
        String StrArea = "A = " + String.valueOf(df.format(circ.calcularArea())) + " [U^2] ; ";
        String StrPer = "P = " + String.valueOf(df.format(circ.calcularPerimetro())) + " [U]";
        pintarCadena(StrRadio, (int) (centroEnX - radio / 3), centroEnY, (int) (radio * 0.07), colorDeCadenas);
        g2d.drawLine(0, tamanioEnY - 80, tamanioEnX, tamanioEnY - 80);
        g2d.drawLine(0, 105, tamanioEnX, 105);
        pintarCadena(str, tamanioEnX / 2 - 165, 100, 100, colorDeCadenas);
        pintarCadena(StrArea + StrPer, 0, tamanioEnY - 40, 40, colorDeCadenas);
    }

    public void representarRectangulo(Rectangulo rec) {
        DecimalFormat df = new DecimalFormat("#.00");
        String str = "Rectángulo";
        Color colorDeCadenas = new Color(19, 38, 97);
        int centroEnX = tamanioEnX / 2;
        int centroEnY = tamanioEnY / 2;
        double base = rec.getBaseDelRectangulo();
        double altura = rec.getAlturaDelRectangulo();

        double auxbase = base;
        double auxaltu = altura;

        if (base == altura) {
            if (base > 1300) {
                auxbase = 500;
                auxaltu = auxbase;
            }
        } else {
            if (base > 1300) {
                auxbase = 1300;
            }

            if (altura > 500) {
                auxaltu = 500;
            }
        }

        g2d.setColor(Color.RED);
        g2d.fillRect((int) (centroEnX - auxbase / 2), (int) (centroEnY - auxaltu / 2), (int) auxbase, (int) auxaltu);
        pintarCadena("B = " + String.valueOf(base) + " [U]", centroEnX - 50, (int) (centroEnY + auxaltu / 2), 20, colorDeCadenas);
        pintarCadena("H = " + String.valueOf(altura) + " [U]", (int) (centroEnX - auxbase / 2), centroEnY, 20, colorDeCadenas);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke((float) (2.5)));
        String StrArea = "A = " + String.valueOf(df.format(rec.calcularArea())) + " [U^2] ; ";
        String StrPer = "P = " + String.valueOf(df.format(rec.calcularPerimetro())) + " [U]";
        g2d.setStroke(new BasicStroke((float) (2.5)));
        g2d.drawLine(0, tamanioEnY - 80, tamanioEnX, tamanioEnY - 80);
        g2d.drawLine(0, 125, tamanioEnX, 125);
        pintarCadena(str, tamanioEnX / 2 - 265, 100, 100, colorDeCadenas);
        pintarCadena(StrArea + StrPer, 0, tamanioEnY - 40, 40, colorDeCadenas);
    }

    public void representarRecta(Recta rect) {
        DecimalFormat df = new DecimalFormat("#.00");
        String ec = rect.obtenerEcuacionDeLaRecta();
        Color colorDeCadenas = new Color(19, 38, 97);
        int centroEnX = tamanioEnX / 2;
        int centroEnY = tamanioEnY / 2;
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke((float) (2.5)));
        String StrL = "L = " + String.valueOf(rect.calcularLongitud()) + " [U] ; " + ec;
        g2d.setStroke(new BasicStroke((float) (2.5)));
        g2d.drawLine(0, tamanioEnY - 80, tamanioEnX, tamanioEnY - 80);
        g2d.drawLine(0, 125, tamanioEnX, 125);
        pintarCadena(StrL, 0, tamanioEnY - 40, 40, colorDeCadenas);

        Punto puntoInicial = rect.getPuntoInicial();
        Punto puntoFinal = rect.getPuntoFinal();

        double x1 = puntoInicial.getCoordenadaX();
        double y1 = puntoInicial.getCoordenadaY();
        double x2 = puntoFinal.getCoordenadaX();
        double y2 = puntoFinal.getCoordenadaY();
        String str = "Recta";
        String puntos = "Pi(" + df.format(x1) + "," + df.format(y1) + "); Pf(" + df.format(x2) + "," + df.format(y2) + ") ";

        if (x1 == x2 && y1 == y2) {
            str = "Punto";
        }
        pintarCadena(str, tamanioEnX / 2 - 150, 100, 100, colorDeCadenas);

        g2d.setColor(Color.RED);

        
        
        if (x1 == x2 && y1 == y2) {

            g2d.fillOval(centroEnX - 15, centroEnY - 15, 30, 30);
            pintarCadena(puntos, centroEnX - 100, centroEnY + 40, 20, colorDeCadenas);

        } else if (x1 == x2 && y1 != y2) {

            g2d.drawLine(tamanioEnX / 2, 150, tamanioEnX / 2, tamanioEnY - 100);
            pintarCadenaRotada(puntos, centroEnX + 20, centroEnY - 100, 90, 20, colorDeCadenas);

        } else if (y1 == y2 && x1 != x2) {

            g2d.drawLine(centroEnX - 200, centroEnY, centroEnX + 200, centroEnY);
            pintarCadena(puntos, centroEnX - 100, centroEnY - 20, 20, colorDeCadenas);

        } else if ((y2 - y1 / x2 - x1) < 0) {
            
            pintarCadenaRotada(puntos, centroEnX - 50, centroEnY - 80, 45, 20, colorDeCadenas);
            g2d.setColor(Color.RED);
            g2d.drawLine(centroEnX + 200, centroEnY + 200, centroEnX - 200, centroEnY - 200);
            
        } else if ((y2 - y1 / x2 - x1) > 0) {
            
            pintarCadenaRotada(puntos, centroEnX - 50, centroEnY + 40, -45, 20, colorDeCadenas);
            g2d.setColor(Color.RED);
            g2d.drawLine(centroEnX + 200, centroEnY - 200, centroEnX - 200, centroEnY + 200);
        
        }
    }

    public void pintarCadenaRotada(String texto, double x, double y, int angulo, int tamanioDeCadena, Color colorDeCadena) {
        g2d.setFont(new Font("Goudy Handtooled BT", Font.BOLD, tamanioDeCadena));
        g2d.setColor(colorDeCadena);
        g2d.translate((float) x, (float) y);
        g2d.rotate(Math.toRadians(angulo));
        g2d.drawString(texto, 0, 0);
        g2d.rotate(-Math.toRadians(angulo));
        g2d.translate(-(float) x, -(float) y);
    }

    public void pintarCadena(String cadenaAPintar, int posx, int posy, int tamanioDeCadena, Color colorDeCadena) {
        g2d.setColor(colorDeCadena);
        g2d.setFont(new Font("Goudy Handtooled BT", Font.BOLD, tamanioDeCadena));
        g2d.drawString(cadenaAPintar, posx, posy);
    }

}
