import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Ventana extends JFrame {

    private JComboBox combo;
    private JLabel label;

    public Ventana() throws MalformedURLException {
        inicializarComponentes();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("ComboBox");
        new Imagen().mostrarImagen(label, obtenerLigaDeImagen("1"));

    }

    private void jComboBox1ActionPerformed(ActionEvent evt) {
        try {

            String str = obtenerLigaDeImagen(combo.getSelectedItem().toString());
            new Imagen().mostrarImagen(label, str);
        } catch (MalformedURLException ex) {
            System.out.println("Imagen no encontrada");
        }
    }

    public String obtenerLigaDeImagen(String id) {
        String str1 = "http://cdn.sci-news.com/images/2019/02/image_6869-Curiosity.jpg";
        String str2 = "https://media-cdn.tripadvisor.com/media/photo-s/0e/25/86/88/beautiful-sunset.jpg";
        return id.equals("0") ? str1 : str2;
    }

    private void inicializarComponentes() {

        combo = new JComboBox();
        label = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        combo.setModel(new DefaultComboBoxModel(new String[]{"1", "0"}));
        combo.addActionListener(this::jComboBox1ActionPerformed);
        label.setOpaque(true);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combo, 0, 388, Short.MAX_VALUE))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                        .addContainerGap())
        );

        pack();
    }

}
