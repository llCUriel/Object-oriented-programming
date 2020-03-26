/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sdelaot
 */
public class FlujoObjectInputStream {
    private final String archivo;
    private ObjectInputStream ois;
    private FileInputStream fis;
    public FlujoObjectInputStream( String archivo ) {
        this.archivo = archivo;
        ois = null;
        fis = null;
    }
    private void abrirFlujo(  ) {
        try {
            fis = new FileInputStream( archivo );
            ois = new ObjectInputStream( fis );
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FlujoObjectInputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FlujoObjectInputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void cerrarFlujo() {
        if( ois!=null ) {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(FlujoObjectInputStream.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    }
    public List<Object> leerObjetos( ) {
        abrirFlujo();
            LinkedList<Object> lista = new LinkedList<>();
        try {
            Object obj = new Object() ;
            while( true ) {
                //System.out.println( " SI " + obj );
                if( fis.available()!=0 ) {
                    obj=ois.readObject();
                    lista.add(obj);
                    }
                else {
                    break;
                    }
            }
        } catch( EOFException eof ) {
            Logger.getLogger(FlujoObjectInputStream.class.getName()).log(Level.SEVERE, null, eof);
            //System.out.println( "AQUI" );
        } catch (IOException ex) {
            Logger.getLogger(FlujoObjectInputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FlujoObjectInputStream.class.getName()).log(Level.SEVERE, null, ex);
        }  finally {
            cerrarFlujo();
        }
        return lista;
    }
}
