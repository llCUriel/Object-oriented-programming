/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author sdelaot
 */
public interface IEmpleado {
    public void trabajar( String deQue );
    public void trabajar( String enDonde, String deQue );
    public void cobrar( double salario );
    public void cobrar( int horasExtra, double salario );
}
