/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.entidades;

import herencia.Persona;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author sdelaot
 */
@Entity
public class PersonaEntity {
    @Id
    @GeneratedValue
    private Long idPersona;
    private String nombre;
    private int edad;
    private String curp;
    private String correoE;

    public PersonaEntity( Persona p ) {
        nombre = p.getNombre();
        edad = p.getEdad();
        curp = p.getCurp();
        correoE = p.getCorreoE();
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }
    public Persona getPersona() {
        return new Persona( nombre, edad, curp, correoE );
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
    

    @Override
    public String toString() {
        return "PersonaEntity{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + ", curp=" + curp + ", correoE=" + correoE + "}\n";
    }
    
}
