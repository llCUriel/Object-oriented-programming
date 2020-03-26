/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdao.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sdelaot
 */
public class BaseDAO {
    private int conQuien;
    private Conexion conexion;
    private ResourceBundle bundle;

    /**
     * Crea un objeto base del DAO
     * 
     * @param quien el argumento de conexion con una base de datos<br />
     * 1. MySQL<br />
     * 2. Oracle<br />
     * 3. Otra<br />
     */
    public BaseDAO( int quien ) {
        try {
            conQuien = quien;
            bundle = ResourceBundle.getBundle("DataConnection");
            this.conexion = new Conexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Conexion getConexion() {
        return conexion;
    }
    
    public void cerrarConexion( Connection conn ) {
        conexion.cerrarConexion(conn);
    }
    
    public ResourceBundle getBundle() {
        return bundle;
    }
    public int buscarUltimoId( String tabla, String campoId ) {
        int bd = 0;
        // 
        String query = "SELECT MAX(" + campoId + ")+1 as id FROM " + tabla;
        System.out.println( query );
        try {
            //Connection conn = this.conexion.getConectionSiasa();
            Connection conn = this.conexion.getConectionMySql();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery( query );
            while( rs.next() ) {
                bd = rs.getInt( "id" );
                }
            conexion.cerrarConexion(conn);
        } catch( SQLException sqle ) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, sqle);
        }
        return bd;
    }

    public int getConQuien() {
        return conQuien;
    }

    public void setConQuien(int conQuien) {
        this.conQuien = conQuien;
    }
    public Connection getConnection() {
        Connection conn = null;
        try {    
            switch( getConQuien() ) {
                case 1:
                    conn = this.getConexion().getConectionMySql();
                    break;
                case 2:
                    conn = null;//
                    break;
                case 3:
                    conn = null;//
                    break;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
