import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        
        Mensaje m = new Mensaje();
        Scanner s = new Scanner(System.in);
        Banco   b = new Banco();
        
        m.setMensaje("Ingrese su nombre completo: ");
        m.mostrarMensaje();
        String nombreCompleto = s.nextLine();        
        m.setMensaje("Ingrese el monto del cheque: ");
        m.mostrarMensaje();
        Integer montoDelCheque = s.nextInt();
        UsuarioDeBanco usuario = b.darDeAltaUsuario(nombreCompleto);
        b.emitirCheque(usuario, montoDelCheque);
    }
   
}
