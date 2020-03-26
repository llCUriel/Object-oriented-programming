/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author sdelaot
 */
public class ProbadorIOFlujoObject {
    public static void main(String[] args) {
        // Flujo de escritura
//        FlujoObjectOutputStream flujoOut = new FlujoObjectOutputStream( "objetos.obj" );
//        Persona [] gente = {
//            new Persona( "Saul", 28, "OTSA871213", "saul@gmail.com" ),
//            new Persona( "Guadalupe", 27, "OTGU861213", "guadalupe@gmail.com" ),
//            new Persona( "Pablo", 26, "OTPA851213", "pablo@gmail.com" ),
//            new Persona( "Lola", 25, "OTLO841213", "lola@gmail.com" ),
//            new Persona( "Luis", 24, "OTLU831213", "luis@gmail.com" )
//            };
//        LinkedList<Object> lista = new LinkedList<>();
//        for( Persona p: gente ) {
//            lista.add(p);
//            System.out.println( p );
//            }
//        flujoOut.escribirObjetos(lista);
//        // Flujo de lectura
//        FlujoObjectInputStream flujoIn = new FlujoObjectInputStream( "objetos.obj" );
//        Iterator<Object> itera = flujoIn.leerObjetos().iterator();
//        while( itera.hasNext() ) {
//            Persona p = (Persona) itera.next();
//            System.out.println(p);
//            }
         Estudiante alguien = new Estudiante( "Luis Flores", 22, "XXXXXXXXXXXXXX",
            "correo","ICE", 7.0, "201056789" );
         FlujoObjectOutputStream flujoOut1 = new FlujoObjectOutputStream( "estudiantes.obj" );
        
        LinkedList<Object> lista1 = new LinkedList<>();
        
            lista1.add(alguien);
            System.out.println( alguien );
        
        flujoOut1.escribirObjetos(lista1);
        // Flujo de lectura
        FlujoObjectInputStream flujoIn1 = new FlujoObjectInputStream( "estudiantes.obj" );
        Iterator<Object> itera1 = flujoIn1.leerObjetos().iterator();
        while( itera1.hasNext() ) {
            Estudiante e = (Estudiante) itera1.next();
            System.out.println(e);
            }
    }
}
