
import java.util.regex.Pattern;

public class ConversorDeNumeroALetra {

    private final String[] UNIDADES = {"", "un ", "dos ", "tres ", "cuatro ", "cinco ", "seis ", "siete ", "ocho ", "nueve "};
    private final String[] DECENAS  = {"diez ", "once ", "doce ", "trece ", "catorce ", "quince ", "dieciseis ", "diecisiete ", "dieciocho ", "diecinueve", "veinte ", "treinta ", "cuarenta ", "cincuenta ", "sesenta ", "setenta ", "ochenta ", "noventa "};
    private final String[] CENTENAS = {"", "ciento ", "doscientos ", "trecientos ", "cuatrocientos ", "quinientos ", "seiscientos ", "setecientos ", "ochocientos ", "novecientos "};

    public  String convertirNumeroALetra(Integer numeroAConvertir) {
        String numero = String.valueOf(numeroAConvertir);
        String literal = "";
        if (numero.indexOf(",") == -1) {
            numero = numero + ",00";
        }
        if (Pattern.matches("\\d{1,9},\\d{1,2}", numero)) {

            String Num[] = numero.split(",");
            if (Integer.parseInt(Num[0]) == 0) {
                literal = "cero ";
            } else if (Integer.parseInt(Num[0]) > 999999) {
                literal = getMillones(Num[0]);
            } else if (Integer.parseInt(Num[0]) > 999) {
                literal = getMiles(Num[0]);
            } else if (Integer.parseInt(Num[0]) > 99) {
                literal = getCentenas(Num[0]);
            } else if (Integer.parseInt(Num[0]) > 9) {
                literal = getDecenas(Num[0]);
            } else {
                literal = getUnidades(Num[0]);
            }
            return literal;
        } else {
            return literal = null;
        }
    }
    private String getUnidades(String numero) {// 1 - 9
        String num = numero.substring(numero.length() - 1);
        return UNIDADES[Integer.parseInt(num)];
    }
    private String getDecenas (String numero) {// 99                        
        int n = Integer.parseInt(numero);
        if (n < 10) {
            return getUnidades(numero);
        } else if (n > 19) {
            String u = getUnidades(numero);
            if (u.equals("")) {
                return DECENAS[Integer.parseInt(numero.substring(0, 1)) + 8];
            } else {
                return DECENAS[Integer.parseInt(numero.substring(0, 1)) + 8] + "y " + u;
            }
        } else {
            return DECENAS[n - 10];
        }
    }
    private String getCentenas(String numero) {
        if (Integer.parseInt(numero) > 99) {
            if (Integer.parseInt(numero) == 100) {
                return " cien ";
            } else {
                return CENTENAS[Integer.parseInt(numero.substring(0, 1))] + getDecenas(numero.substring(1));
            }
        } else {
            return getDecenas(Integer.parseInt(numero) + "");
        }
    }
    private String getMiles   (String numero) {// 999 999
        String c = numero.substring(numero.length() - 3);
        String m = numero.substring(0, numero.length() - 3);
        String n = "";
        if (Integer.parseInt(m) > 0) {
            n = getCentenas(m);
            return n + "mil " + getCentenas(c);
        } else {
            return "" + getCentenas(c);
        }

    }
    private String getMillones(String numero) {
        String miles = numero.substring(numero.length() - 6);
        String millon = numero.substring(0, numero.length() - 6);
        String n = "";
        if (millon.length() > 1) {
            n = getCentenas(millon) + "millones ";
        } else {
            n = getUnidades(millon) + "millon ";
        }
        return n + getMiles(miles);
    }
    protected void finalize() {
        System.gc();
    }

}
