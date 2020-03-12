/*
*@author Ian Alexander Ruiz González - 2CV3
*/
import java.util.LinkedList;

public class AppCalculadora {

    public static void main(String[] args) {
        
        LinkedList<Double> coeficientes;
        Calculadora miFormula;
        String cadena;

        if (args.length == 3) {
            
            coeficientes = new LinkedList<Double>();
            miFormula = new Calculadora();
            cadena = "";
            //Transforma los argumentos del main para enviarlos o otras clases.
            for (String arg : args) {
                cadena += (arg + " ");
            }
            //Separa la cadena almacenada por medio del caracater " " partiendo de la posición -1
            String h[] = cadena.split(" ", -1);
        
            //Recorre cadena por cadena y hace un casting a double de las cadenas separadas
            for (int i = 0; i < h.length; i++) {
            if (h[i].length() > 0) {
                //Métodos de Java LinkedList donde .add agrega el elemento especificado al final de esta lista.
                coeficientes.add(Double.parseDouble(h[i])); 
            }
            }
            miFormula.calcularValores((double) coeficientes.get(0), (double) coeficientes.get(1), (double) coeficientes.get(2));
        }
        else {
            System.out.println("\nusar:" + "java AppCalculadora coeficienteA coeficienteB coeficienteC");
        }   
    }
}