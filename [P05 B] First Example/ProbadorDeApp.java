
public class ProbadorDeApp {

    private ConversorDeCadena c1;
    private ConversorDeDouble c2;
    private ConversorDeFloat c3;
    private ConversorDeBase c4;
    private Mensaje msj;

    public ProbadorDeApp() {
        c1 = new ConversorDeCadena();
        c2 = new ConversorDeDouble();
        c3 = new ConversorDeFloat();
        c4 = new ConversorDeBase();
        msj = new Mensaje();
    }

    public void probarApp() {
        String cadena = "1234";
        String cadenaf = "1.358";
        String cadenad = "102.3654";

        for (int n = 0; n < cadena.length(); n++) {
            char c = cadena.charAt(n);
            int i = c4.convertirCaracter(c, 10);
            msj.setCadena("El n£mero entero es : " + i);
            msj.mostrarMensaje();
        }

        Float fo = c1.convertirAFloat(cadenaf);
        msj.setCadena("El objeto Flotante es : " + fo);
        msj.mostrarMensaje();
        
        float f = c3.convertirAFloat(fo);
        msj.setCadena("El número flotante es : " + f);
        msj.mostrarMensaje();
        
        Double D = c1.convertirADouble(cadenad);
        msj.setCadena("El objeto Double es : " + D);
        msj.mostrarMensaje();
        
        double d = c2.convertirADouble(D);
        msj.setCadena("El número double es : " + d);
        msj.mostrarMensaje();
    }

}
