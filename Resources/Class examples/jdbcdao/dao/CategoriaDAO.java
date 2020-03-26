/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbcdao.entidades.Categoria;

/**
 *
 * @author sdelaot
 */
public class CategoriaDAO extends BaseDAO implements ICategoriaDAO {

    public CategoriaDAO(int quien) {
        super(quien);
    }

    @Override
    public void create(Categoria categoria) {
        try {
            String query = getBundle().getString( "ipn.escom.categoria.create" );
            Connection conn = this.getConnection();
            conn.setAutoCommit( false );
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt( 1, categoria.getIdCategoria() );
            pstmt.setString( 2, categoria.getNombreCateoria() );
            if( pstmt.executeUpdate()==1 ) {
                System.out.println( categoria + " creada con exito." );
                conn.commit();
                }
            else {
                System.out.println( "Error al crear: " + categoria );
                conn.rollback();
                }
            this.cerrarConexion(conn);
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void create(List<Categoria> lista) {
        try {
            String query = getBundle().getString( "ipn.escom.categoria.create" );
            Connection conn = this.getConnection();
            conn.setAutoCommit( false );
            PreparedStatement pstmt = conn.prepareStatement(query);
            for( Categoria categoria: lista ) {
                pstmt.setInt( 1, categoria.getIdCategoria() );
                pstmt.setString( 2, categoria.getNombreCateoria() );
                pstmt.execute();
                pstmt.clearParameters();
                }
            conn.commit();
//            if( pstmt.executeUpdate()==1 ) {
//                System.out.println( lista + " creada con exito." );
//                conn.commit();
//                }
//            else {
//                System.out.println( "Error al crear: " + lista );
//                conn.rollback();
//                }
            this.cerrarConexion(conn);
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Categoria read(Categoria categoria) {
        try {
            String query = getBundle().getString( "ipn.escom.categoria.read.one" );
            Connection conn = this.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt( 1, categoria.getIdCategoria() );
            ResultSet rs = pstmt.executeQuery();
            while( rs.next() ) {
                categoria.setNombreCateoria( rs.getString( 2 ) );
                }
            this.cerrarConexion( conn );
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categoria;
    }

    @Override
    public List<Categoria> readAll() {
        LinkedList<Categoria> lista = new LinkedList<>();
        try {
            String query = getBundle().getString( "ipn.escom.categoria.read.all" );
            Connection conn = this.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while( rs.next() ) {
                Categoria categoria = new Categoria( rs.getInt( 1 ) );
                categoria.setNombreCateoria( rs.getString( 2 ) );
                lista.add(categoria);
                }
            this.cerrarConexion( conn );
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public void update(Categoria categoria) {
        try {
            String query = getBundle().getString( "ipn.escom.categoria.update" );
            Connection conn = this.getConnection();
            conn.setAutoCommit( false );
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString( 1, categoria.getNombreCateoria() );
            pstmt.setInt( 2, categoria.getIdCategoria() );
            
            if( pstmt.executeUpdate()==1 ) {
                System.out.println( categoria + " actualizada con exito." );
                conn.commit();
                }
            else {
                System.out.println( "Error al actualizar: " + categoria );
                conn.rollback();
                }
            this.cerrarConexion(conn);
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Categoria categoria) {
        try {
            String query = getBundle().getString( "ipn.escom.categoria.delete.one" );
            Connection conn = this.getConnection();
            conn.setAutoCommit( false );
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt( 1, categoria.getIdCategoria() );
            
            if( pstmt.executeUpdate()==1 ) {
                System.out.println( categoria + " borrada con exito." );
                conn.commit();
                }
            else {
                System.out.println( "Error al borrar: " + categoria );
                conn.rollback();
                }
            this.cerrarConexion(conn);
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteAll() {
        try {
            String query = getBundle().getString( "ipn.escom.categoria.delete.all" );
            Connection conn = this.getConnection();
            conn.setAutoCommit( false );
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            if( pstmt.executeUpdate()==1 ) {
                System.out.println( "Tabla  borrada con exito." );
                conn.commit();
                }
            else {
                System.out.println( "Error al borrar la tabla " );
                conn.rollback();
                }
            this.cerrarConexion(conn);
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
