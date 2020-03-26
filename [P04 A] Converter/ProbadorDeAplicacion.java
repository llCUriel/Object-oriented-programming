package Parte02;

import java.util.LinkedList;

public class probadorDeAplicacion {

    private ConversorDeShort sh;
    private ConversorDeLong lo;
    private ConversorDeInt in;
    private ConversorDeFloat flo;
    private ConversorDeDouble dou;
    private ConversorDeChar cha;
    private ConversorDeCadena cad;
    private ConversorDeByte by;
    private ConversorDeBoolean bod;
    private LinkedList opciones;
    private int opcion;
    private Teclado tecl;
    private String encabezado;

    public probadorDeAplicacion() {
        sh = new ConversorDeShort();
        lo = new ConversorDeLong();
        in = new ConversorDeInt();
        flo = new ConversorDeFloat();
        dou = new ConversorDeDouble();
        cad = new ConversorDeCadena();
        cha = new ConversorDeChar();
        by = new ConversorDeByte();
        bod = new ConversorDeBoolean();
        opciones = new LinkedList();
        tecl = new Teclado();
        inicializarMenu();
        opcion = 0;
    }

    protected void finalize() {
        sh = null;
        lo = null;
        in = null;
        flo = null;
        dou = null;
        cad = null;
        cha = null;
        by = null;
        bod = null;
        opciones = null;
        tecl = null;
        System.gc();

    }

    public void probarAplicacion() {
        desplegarMenu();
    }

    public void desplegarMenu() {
        System.out.println(encabezado);
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println("\033[33m" + "[0" + i + "]" + opciones.get(i).toString());
        }
        System.out.println("\n► Ingrese una opción, por favor:");
        opcion = tecl.leerEntero();
        desplegarMenuSecundario(opcion);

    }

    public void convertirShort(short dato) {
        sh.convShortToBool(dato);
        sh.convShortToByte(dato);
        sh.convShortToChar(dato);
        sh.convShortToDouble(dato);
        sh.convShortToFloat(dato);
        sh.convShortToInt(dato);
        sh.convShortToLong(dato);
        sh.convShortToString(dato);
        System.out.println(sh.toString());
    }

    public void convertirLong(long dato) {
        lo.convLongToBool(dato);
        lo.convLongToByte(dato);
        lo.convLongToChar(dato);
        lo.convLongToDouble(dato);
        lo.convLongToFloat(dato);
        lo.convLongToInt(dato);
        lo.convLongToShort(dato);
        lo.convLongToString(dato);
        System.out.println(lo.toString());
    }

    public void convertirEntero(int dato) {
        in.convIntToBool(dato);
        in.convIntToByte(dato);
        in.convIntToChar(dato);
        in.convIntToDouble(dato);
        in.convIntToFloat(dato);
        in.convIntToLong(dato);
        in.convIntToShort(dato);
        in.convIntToString(dato);
        System.out.println(in.toString());
    }

    public void convertirFloat(float dato) {
        flo.convFloatToBool(dato);
        flo.convFloatToByte(dato);
        flo.convFloatToChar(dato);
        flo.convFloatToDouble(dato);
        flo.convFloatToInt(dato);
        flo.convFloatToLong(dato);
        flo.convFloatToShort(dato);
        flo.convFloatToString(dato);
        System.out.println(flo.toString());
    }

    public void convertirDouble(double dato) {
        dou.convDoubleToBoolean(dato);
        dou.convDoubleToByte(dato);
        dou.convDoubleToChar(dato);
        dou.convDoubleToFloat(dato);
        dou.convDoubleToInt(dato);
        dou.convDoubleToLong(dato);
        dou.convDoubleToShort(dato);
        dou.convDoubleToString(dato);
        System.out.println(dou.toString());
    }

    public void convertirChar(char dato) {
        cha.convCharToBool(dato);
        cha.convCharToByte(dato);
        cha.convCharToDouble(dato);
        cha.convCharToFloat(dato);
        cha.convCharToInt(dato);
        cha.convCharToLong(dato);
        cha.convCharToShort(dato);
        cha.convCharToString(dato);
        System.out.println(cha.toString());
    }

    public void convertirCadena(String dato) {
        cad.convStringToBoolean(dato);
        cad.convStringToByte(dato);
        cad.convStringToChar(dato);
        cad.convStringToDouble(dato);
        cad.convStringToFloat(dato);
        cad.convStringToInt(dato);
        cad.convStringToLong(dato);
        cad.convStringToShort(dato);
        System.out.println(cad.toString());
    }

    public void convertirByte(byte dato) {
        by.convByteToBool(dato);
        by.convByteToDouble(dato);
        by.convByteToFloat(dato);
        by.convByteToInt(dato);
        by.convByteToLong(dato);
        by.convByteToShort(dato);
        by.convByteToString(dato);
        by.convByteToChar(dato);
        System.out.println(by.toString());
    }

    public void convertirBool(boolean dato) {
        bod.convBooleanToByte(dato);
        bod.convBooleanToChar(dato);
        bod.convBooleanToDouble(dato);
        bod.convBooleanToFloat(dato);
        bod.convBooleanToInt(dato);
        bod.convBooleanToLong(dato);
        bod.convBooleanToShort(dato);
        bod.convBooleanToString(dato);
        System.out.println(bod.toString());
    }

    public void desplegarMenuSecundario(int opcion) {

        switch (opcion) {
            case 0:
                short d0;
                System.out.println("► Ingresa un short.");
                d0 = tecl.leerShort();
                convertirShort(d0);
                break;

            case 1:
                long d1;
                System.out.println("► Ingresa un long.");
                d1 = tecl.leerLong();
                convertirLong(d1);
                break;

            case 2:
                int d2;
                System.out.println("► Ingresa un int.");
                d2 = tecl.leerEntero();
                convertirEntero(d2);
                break;

            case 3:
                float d3;
                System.out.println("► Ingresa un float.");
                d3 = tecl.leerFloat();
                convertirFloat(d3);
                break;

            case 4:
                double d4;
                System.out.println("► Ingresa un double.");
                d4 = tecl.leerDouble();
                convertirDouble(d4);
                break;

            case 5:
                char d5;
                System.out.println("► Ingresa un char.");
                d5 = tecl.leerChar();
                convertirChar(d5);
                break;

            case 6:
                String d6;
                System.out.println("► Ingresa una cadena.");
                d6 = tecl.leerCadena();
                convertirCadena(d6);
                break;

            case 7:
                byte d7;
                System.out.println("► Ingresa un byte.");
                d7 = tecl.leerByte();
                convertirByte(d7);
                break;

            case 8:
                String _d8;
                boolean d8;
                System.out.println("► Ingresa un boolean.");

                _d8 = tecl.leerCadena();
                _d8 = tecl.leerCadena();

                if (_d8.equalsIgnoreCase("true")) {
                    d8 = true;
                } else {
                    d8 = false;
                }
                convertirBool(d8);
                break;
            default:
                System.exit(0);
        }
    }

    public void inicializarMenu() {
        opciones.add("\t\tConversión de short.  ");
        opciones.add("\t\tConversión de long.   ");
        opciones.add("\t\tConversión de int.    ");
        opciones.add("\t\tConversión de float.  ");
        opciones.add("\t\tConversión de double. ");
        opciones.add("\t\tConversión de char.   ");
        opciones.add("\t\tConversión de cadena. ");
        opciones.add("\t\tConversión de byte.   ");
        opciones.add("\t\tConversión de boolean.");
        opciones.add("\t\tSalir.                ");
        encabezado = "\t\tMenú - conversión entre tipos de dato\n";
    }

}
