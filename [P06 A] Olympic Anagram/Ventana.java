import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Ventana extends javax.swing.JFrame implements WindowListener {

    private final int tamanioEnX;
    private final int tamanioEnY;
    
    public Ventana(String tituloDeVentana) {
        super(tituloDeVentana);
        this.setTitle(tituloDeVentana);
        this.tamanioEnX = 1366;
        this.tamanioEnY = 768;
        this.setSize(tamanioEnX, tamanioEnY);
        this.setResizable(false);
        this.add(new Lienzo(tamanioEnX, tamanioEnY));
        this.setExtendedState(Ventana.MAXIMIZED_BOTH);
    }

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Ventana abierta");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Ventana cerrada");
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Ventana cerrada");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Ventana iconificada");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Ventana desiconnificada");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Ventana desactivada");
    }
}
