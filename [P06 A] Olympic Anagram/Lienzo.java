
import java.awt.*;

import java.util.ArrayList;
import java.util.Arrays;

public final class Lienzo extends Canvas {

    private ArrayList<Circulo> arregloDeCirculos;
    private ArrayList<Color> arregloDeColores;
    private  Rectangulo miRectangulo;
    private final int tamanioEnX, tamanioEnY;
    private Graphics2D g2d;
    
    public Lienzo(int tamanioEnX, int tamanioEnY) {
        this.tamanioEnX = tamanioEnX;
        this.tamanioEnY = tamanioEnY;
        this.arregloDeCirculos = inicializarArregloDeCirculos();
        this.arregloDeColores = inicializarArregloDeColores();
        this.miRectangulo = new Rectangulo(tamanioEnX, tamanioEnY);
    }

    public ArrayList<Circulo> inicializarArregloDeCirculos() {
        int numeroDeCirculos = 5, radioDeCirculo = tamanioEnX / 5;
        arregloDeCirculos = new ArrayList<>();
        for (int i = 0; i < numeroDeCirculos; i++) {
            arregloDeCirculos.add(new Circulo(radioDeCirculo));
        }
        return arregloDeCirculos;
    }

    public ArrayList<Color> inicializarArregloDeColores() {
        return new ArrayList<>(Arrays.asList(
                new Color(17, 133, 193),
                new Color(251, 178, 55),
                new Color(4, 4, 4),
                new Color(29, 139, 60),
                new Color(236, 52, 76)
        ));
    }

    public int[][] inicializarPosicionesDeCirculos() {
        int separacionEntreCirculos = tamanioEnX / 20;
        int posXInicial = tamanioEnX / 5 - separacionEntreCirculos;
        int posComYDeCirculosSup = tamanioEnY / 5;
        int posComYDeCirculosInf = tamanioEnY / 3;
        int avanceEnXSup = tamanioEnX / 10;
        int avanceEnXInf = tamanioEnX / 10 + (separacionEntreCirculos / 2);

        int[][] posicionesDeCirculos = {
            {posXInicial, posComYDeCirculosSup},
            {posXInicial + avanceEnXInf, posComYDeCirculosInf},
            {posXInicial + 2 * avanceEnXSup + separacionEntreCirculos, posComYDeCirculosSup},
            {posXInicial + 3 * avanceEnXInf, posComYDeCirculosInf},
            {posXInicial + 4 * avanceEnXSup + 2 * separacionEntreCirculos, posComYDeCirculosSup}};
        return posicionesDeCirculos;
    }

    @Override
    public void paint(Graphics g) {
        this.g2d = (Graphics2D) g;
        int[][] posicionesDeCirculos = inicializarPosicionesDeCirculos();
        pintarRectangulo(miRectangulo, 0, 0, Color.WHITE);
        for (int i = 0; i < arregloDeCirculos.size(); i++) {
            int posicionDeCirculoiEnX = posicionesDeCirculos[i][0];
            int posicionDeCirculoiEnY = posicionesDeCirculos[i][1];
            Color colorDelCirculoi = arregloDeColores.get(i);
            Circulo circuloi = arregloDeCirculos.get(i);
            pintarCirculo(circuloi, posicionDeCirculoiEnX, posicionDeCirculoiEnY, (float) (tamanioEnX * 0.010), colorDelCirculoi);
        }
        pintarCadena("TOKYO 2020", (tamanioEnX / 4) + 50, tamanioEnY - 100, 100, new Color(19, 38, 97));
    }

    public void pintarRectangulo(Rectangulo rectanguloAPintar, int posx, int posy, Color colorDelRectangulo) {
        int baseDelRectangulo = (int) rectanguloAPintar.getBaseDelRectangulo();
        int alturaDelRectangulo = (int) rectanguloAPintar.getAlturaDelRectangulo();
        g2d.setColor(colorDelRectangulo);
        g2d.fillRect(posx, posy, posx + baseDelRectangulo, posy + alturaDelRectangulo);
    }

    public void pintarCirculo(Circulo circuloAPintar, int posx, int posy, float ancho, Color colorDelCirculo) {
        int radioDelCirculo = (int) circuloAPintar.getRadioDelCirculo();
        g2d.setColor(colorDelCirculo);
        g2d.setStroke(new BasicStroke(ancho));
        g2d.drawOval(posx, posy, radioDelCirculo, radioDelCirculo);
    }

    public void pintarCadena(String cadenaAPintar, int posx, int posy, int tamanioDeCadena, Color colorDeCadena) {
        g2d.setColor(colorDeCadena);
        g2d.setFont(new Font("Goudy Handtooled BT", Font.BOLD, tamanioDeCadena));
        g2d.drawString(cadenaAPintar, posx, posy);
    }

}
