/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author sdelaot
 */
public class ProbadorDeHerenciaMultiple {
    public static void main( String [] args ) {
        EstudianteYEmpleado alguien = new EstudianteYEmpleado( "Saul", 22, "XXXXXXXXXXXXXX",
            "correo","ICE", 7.0, "201056789", "XXXXXXXXXX" );
        System.out.println( alguien );
        alguien.trabajar( "Profesor" );
        alguien.trabajar( "ESCOM", "Profesor" );
        alguien.cobrar( 1000.0 );
        alguien.cobrar( 3, 1000.0 );
        alguien.estudiarEn( "CIC" );
        alguien.estudiarEn( "CIC", 8 );
        EstudianteYEmpleado otro = new EstudianteYEmpleado( alguien );
        System.out.println( otro );
        System.out.println( " Son iguales : " + otro.equals( alguien ) );
        
        alguien.calentar( 10 );
        alguien.entrenar( 15, "cargar pesas" );
    }
}
