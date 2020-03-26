/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import herencia.entidades.PersonaEntity;
import herencia.jpa.PersonaDAO;

/**
 *
 * @author sdelaot
 */
public class JpaTest {
    public static void main(String[] args) {
        Persona alguien = new Persona( "Luis Flores", 22, "XXXXXXXXXXXXXX", "correo" );
        PersonaEntity pe = new PersonaEntity( alguien );
        PersonaDAO pdao = new PersonaDAO( "personas.odb" );
//        //pdao.create(pe);
        System.out.println( pdao.readAll() );
        pe.setNombre( "Claudia Flores" );
        pdao.udpate(1L, pe);
        System.out.println( pdao.readAll() );
        alguien = new Persona( "Carolina Perez", 21, "XXXXXXXXXXXXXX", "correo" );
        PersonaEntity pe1 = new PersonaEntity( alguien );
        pdao.create(pe1);
        System.out.println( pdao.readAll() );
        pdao.delete( 5L );
        System.out.println( pdao.readAll() );
        pe.setNombre( "Pedro Flores" );
        pdao.udpate(4L, pe);
        System.out.println( pdao.readAll() );
        pdao.cerrarBD();
    }
}
