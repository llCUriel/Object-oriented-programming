/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author sdelaot
 */
public class Persona implements Serializable {
    private static final long serialVersionUID = 2L;
    private String nombre;
    private int edad;
    private String curp;
    private String correoE;
    public Persona() {
        this( "", 0, "", "" );
    }
    public Persona( String nombre, int edad, String curp, String correoE ) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.curp = curp;
        this.correoE = correoE;
    }
    public Persona( Persona alguien ) {
        super();
        nombre = alguien.nombre;
        edad = alguien.edad;
        curp = alguien.curp;
        correoE = alguien.correoE;
    }
    public void setPersona( String nombre, int edad, String curp, String correoE ) {
        this.nombre = nombre;
        this.edad = edad;
        this.curp = curp;
        this.correoE = correoE;
    }
    @Override
    public String toString() {
        return  " Nombre : " + nombre + "\n" +
                " Edad   : " + edad + "\n" +
                " CURP   : " + curp + "\n" +
                " Correo : " + correoE + "\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }
    
}
