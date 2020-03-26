package jdbcdao.dao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sdelaot
 */
public class Conexion {

    //static Logger logger = Logger.getLogger(Conexion.class);
    //ResourceBundle bundle = ResourceBundle.getBundle("mx.com.televisa.siasa.properties.DataConection");
    private ResourceBundle bundle;

    public Conexion() throws ClassNotFoundException {
        //PropertyConfigurator.configure("src/log4j.properties");
        bundle = ResourceBundle.getBundle("DataConnection");
        Class.forName(bundle.getString("ipn.escom.musica.class.forname"));
    }

    public Connection getConectionMySql() throws SQLException {
        Connection con = DriverManager.getConnection( 
                bundle.getString( "ipn.escom.musica.diverManager" ), 
                bundle.getString( "ipn.escom.musica.usuario" ), 
                bundle.getString( "ipn.escom.musica.password" ) );
        return con;
    }

    public ResourceBundle getBundle() {
        return bundle;
    }

    public void cerrarConexion(Connection con) {
        try {
            if( con!=null ) {
                con.close();
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            //logger.error(ex.getMessage(), ex);

        }
    }
    public static void main(String[] args) {
        try {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConectionMySql();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
