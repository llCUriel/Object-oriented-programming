
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagen {

    private String linkDeImagen;

    public Imagen(String linkDeImagen) {
        this.linkDeImagen = linkDeImagen;
    }

    public Imagen() {
        linkDeImagen = "";
    }

    protected void finalize() {
        linkDeImagen = null;
        System.gc();
    }

    public void mostrarImagen(JLabel dondeImprimir, String linkDeImagen) throws MalformedURLException {
        this.linkDeImagen = linkDeImagen;
        int jLabelHeight = dondeImprimir.getHeight();
        int jLabelWidth = dondeImprimir.getWidth();
        Image ImagenSeleccionada = Toolkit.getDefaultToolkit().getImage(new URL(this.linkDeImagen)).getScaledInstance(jLabelWidth, jLabelHeight, 0);
        dondeImprimir.setIcon(new ImageIcon(ImagenSeleccionada));
    }

}
