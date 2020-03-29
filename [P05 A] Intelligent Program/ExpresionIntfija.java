package Parte02;


public class ExpresionIntfija {

    private String expresionInFija;

    public ExpresionIntfija(String expresionInFija) {
        this.expresionInFija = expresionInFija;
    }

    public ExpresionIntfija() {
        this.expresionInFija = "";
    }

    public String[] obtenerDatos(String expresion) {
        this.expresionInFija = expresion;
        return new String[]{obtenerNumero(expresionInFija), obtenerOperador(expresionInFija)};
    }

    public String obtenerNumero(String expresion) {
        String expresionRegular = "(\\-|\\+)?(([0-9]+[.][0-9]+)|([0-9]+))";
        return new ExpresionRegular(expresion, expresionRegular).evaluarExpresionRegular();
    }

    public String obtenerOperador(String expresion) {
        String expresionRegular = ">>|\\+|\\-|\\*|\\/|>>|<<";
        return new ExpresionRegular(expresion, expresionRegular).evaluarExpresionRegular();
    }

}
