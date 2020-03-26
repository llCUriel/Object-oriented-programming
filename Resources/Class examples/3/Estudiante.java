/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author sdelaot
 */
public class Estudiante extends Persona {
    private static final long serialVersionUID = 1L;
    private String carrera;
    private double promedio;
    private String boleta;
    public Estudiante() {
        this( "", 0, "", "", "", 0.0, "" );
    }
    public Estudiante( String nombre, int edad, String curp, String correoE,
        String carrera, double promedio, String boleta ) {
        super( nombre, edad, curp, correoE );
        this.carrera = carrera;
        this.promedio = promedio;
        this.boleta = boleta;
    }
    public Estudiante( Estudiante unEstudiante ) {
        super( unEstudiante );
        this.carrera = unEstudiante.carrera;
        this.promedio = unEstudiante.promedio;
        this.boleta = unEstudiante.boleta;
    }
    public void estudiarEn( String escuela ) {
        System.out.println( " Estudia en " + escuela );
    }
    public void estudiarEn( String escuela, int horas ) {
        estudiarEn( escuela );
        System.out.println( " Horas      " + horas );
    }
    @Override
    public String toString() {
        return super.toString() +
                " Carrera  : " + carrera + "\n" +
                " Promedio : " + promedio + "\n" +
                " Boleta   : " + boleta + "\n";
    }
}
