/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdao;

import java.util.LinkedList;
import java.util.ResourceBundle;
import jdbcdao.dao.CategoriaDAO;
import jdbcdao.entidades.Categoria;

/**
 *
 * @author sdelaot
 */
public class ProbadorDAO {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle( "DataConnection" );
        Categoria categoria = new Categoria( 2 );
        int conQuien = Integer.parseInt( bundle.getString( "ipn.escom.musica.donde.se.conecta" ) );
        CategoriaDAO dao = new CategoriaDAO( conQuien );
        System.out.println( dao.read(categoria) );
        System.out.println( dao.readAll() );
        categoria.setIdCategoria( 5 );
        categoria.setNombreCateoria( "Pop" );
        dao.update(categoria);
        System.out.println( dao.readAll() );
        LinkedList<Categoria> lista = new LinkedList<>();
        categoria.setIdCategoria( 19 );
        dao.delete(categoria);
        int n = 16;
        categoria = new Categoria( n++ );
        categoria.setNombreCateoria( "Clasica" );
        lista.add(categoria);
        categoria = new Categoria( n++ );
        categoria.setNombreCateoria( "Punk" );
        lista.add(categoria);
        categoria = new Categoria( n++ );
        categoria.setNombreCateoria( "Jazz" );
        lista.add(categoria);
        categoria = new Categoria( n++ );
        categoria.setNombreCateoria( "Blues" );
        lista.add(categoria);
        dao.create(lista);
        System.out.println( dao.readAll() );
    }
}
