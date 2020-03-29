import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionPostfija {

    private String expresion;

    public ExpresionPostfija(String expresion) {
        this.expresion = expresion;
    }

    public ExpresionPostfija() {
        this.expresion = "";
    }

    public String[] obtenerDatos(String expresion) {
        this.expresion = expresion;
        return new String[]{obtenerNumero(this.expresion), obtenerOperador(this.expresion)};
    }

    public String obtenerNumero(String expresion) {
        String expresionRegular = "(\\-|\\+)?(([0-9]+[.][0-9]+)|([0-9]+))";
        return evaluarExpresionRegular(expresion, expresionRegular);
    } 

    public String obtenerOperador(String expresion) {
        String expresionRegular = ">>|\\+|\\-|\\*|\\/|>>|<<";
        return evaluarExpresionRegular(expresion, expresionRegular);
    }

    public String evaluarExpresionRegular(String str, String expresionRegular) {
        Pattern pattern = Pattern.compile(expresionRegular, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(expresion);
        while (matcher.find()) {
            return matcher.group(0);
        }
        return "";
    }

}
