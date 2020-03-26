/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import hilos.MedidorDeCalorias;
import hilos.MedidorDeTiempo;

/**
 *
 * @author sdelaot
 */
public class EstudianteYEmpleado extends Estudiante implements IEmpleado,
    IDeportista {
    private String nss;
    public EstudianteYEmpleado() {
        this( "", 0, "", "", "", 0.0, "", "" );
    }
    public EstudianteYEmpleado( String nombre, int edad, String curp, String correoE,
        String carrera, double promedio, String boleta, 
            String nss ) {
        super( nombre, edad, curp, correoE,
            carrera, promedio, boleta );
        this.nss = nss;
    }
    public EstudianteYEmpleado( EstudianteYEmpleado eye ) {
        super( eye );
        this.nss = eye.nss;
    }
    @Override
    public void cobrar( double salario ) {
        System.out.println( " Gano      " + salario  );
    }
    @Override
    public void cobrar( int horasExtra, double salario ) {
        cobrar( salario );
        double porHoraExtra = 100.0 * horasExtra;
        System.out.println( " Hrs extra " + porHoraExtra  );
        System.out.println( "           ---------------- "  );
        System.out.println( " Total     " + (salario+porHoraExtra)  );
    }
    @Override
    public void trabajar( String deQue ) {
        System.out.println( " Trabajo de " + deQue );
    }
    @Override
    public void trabajar( String enDonde, String deQue ) {
        System.out.println( " Trabajo en " + enDonde );
        trabajar( deQue );
    }
    @Override
    public void calentar( int minutos ) {
        MedidorDeTiempo medidor = new MedidorDeTiempo( minutos );
        medidor.start();
    }
    @Override
    public int entrenar( int caloriasAQuemar, String como ) {
        MedidorDeCalorias medidor = 
                new MedidorDeCalorias( caloriasAQuemar, como );
        int tiempo = medidor.getTiempo();
        medidor.start();
        return tiempo;
    }
    @Override
    public String toString() {
        return super.toString() +
                " nss  : " + nss;
    }
}
