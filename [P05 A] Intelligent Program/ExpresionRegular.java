import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionRegular {

    private String expresionR;
    private String expresion;

    public ExpresionRegular(String expresion,String expresionR) {
        this.expresion = expresion;
        this.expresionR = expresionR;
    }

    public String evaluarExpresionRegular() {
        Pattern pattern = Pattern.compile(expresionR, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(expresion);
        while (matcher.find()) {
            return matcher.group(0);
        }
        return "";

    }

}
