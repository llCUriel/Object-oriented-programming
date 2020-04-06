import java.util.Arrays;
import java.util.LinkedList;

public class probadorDeApp {
    
    private final Menu menuPrincipal;
    private Lienzo miLienzo;
    private Ventana ventanaPrincipal;
    private Teclado tcl;
    private Mensaje m;
    
    public probadorDeApp() {
        String titulo = "Calculadora";
        menuPrincipal = new Menu(inicializarOpciones(), titulo);
        tcl = new Teclado();
        ventanaPrincipal = new Ventana(titulo);
        m = new Mensaje();
    }
    
    public LinkedList inicializarOpciones() {
        String str0 = "> ";
        return new LinkedList(Arrays.asList(
                str0 + "Rectángulo",
                str0 + "Circulo",
                str0 + "Recta",
                str0 + "Salir"
        ));
    }
    
    public void probarApp() {
        menuPrincipal.desplegarMenu();
        int opcionSeleccionada = menuPrincipal.obtenerOpcionSeleccionada();
        desplegarFigura(opcionSeleccionada);
        ventanaPrincipal.anadirLienzo(miLienzo);
        ventanaPrincipal.mostrarVentana();

    }
    
    public void desplegarFigura(int idDeFigura) {
        
        Object miObjeto = null;
        
        if (idDeFigura > 2) {
            System.exit(0);
        }
        
        if (idDeFigura == 0) {
            
            m.setCadena("Ingrese base y altura (b,h): ");
            m.mostrarMensajeN();
            double baseDeRectangulo = tcl.leerDouble();
            double alturaDeRectangulo = tcl.leerDouble();
            miObjeto = new Rectangulo(baseDeRectangulo, alturaDeRectangulo);
            miLienzo = new Lienzo(1366, 768, idDeFigura, miObjeto);
            
        } else if (idDeFigura == 1) {
            
            m.setCadena("Ingrese radio (r): ");
            m.mostrarMensajeN();
            double radioDeCirculo = tcl.leerDouble();
            miObjeto = new Circulo(radioDeCirculo);
            miLienzo = new Lienzo(1366, 768, idDeFigura, miObjeto);
            
        } else {
            
            m.setCadena("Ingrese punto inicial y final (x1,y1,x2,y2): ");
            m.mostrarMensajeN();
            double x1 = tcl.leerDouble(), y1 = tcl.leerDouble();
            double x2 = tcl.leerDouble(), y2 = tcl.leerDouble();
            Punto puntoInicial = new Punto(x1, y1);
            Punto puntoFinal = new Punto(x2, y2);
            miObjeto = new Recta(puntoInicial, puntoFinal);
            miLienzo = new Lienzo(1366, 768, idDeFigura, miObjeto);
            
        }
    }
}
