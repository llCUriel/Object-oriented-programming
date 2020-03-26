/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdao.entidades;

import java.io.Serializable;

/**
 *
 * @author sdelaot
 */
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    // ID_CATEGORIA
    private int idCategoria;
    // NOMBRE_CATEORIA
    private String nombreCateoria;

    public Categoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCateoria() {
        return nombreCateoria;
    }

    public void setNombreCateoria(String nombreCateoria) {
        this.nombreCateoria = nombreCateoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", nombreCateoria=" + nombreCateoria + "}\n";
    }
    
}
