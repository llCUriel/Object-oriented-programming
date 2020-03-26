/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdao.dao;

import java.util.List;
import jdbcdao.entidades.Categoria;

/**
 *
 * @author sdelaot
 */
public interface ICategoriaDAO {
    public void create( Categoria categoria );
    public void create( List<Categoria> lista );
    public Categoria read( Categoria categoria );
    public List<Categoria> readAll();
    public void update( Categoria categoria );
    public void delete( Categoria categoria );
    public void deleteAll();
}
