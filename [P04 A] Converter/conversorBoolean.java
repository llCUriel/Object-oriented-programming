package asaasa;
public class conversorBoolean {

    private boolean miBooleano;

    public conversorBoolean() {
        this.miBooleano = false;
    }

    public byte convertirAByte() {
        return (byte) ((miBooleano) ? 1 : 0);
    }

    public short convertirAShort() {
        return (short) ((miBooleano) ? 1 : 0);

    }

    public int convertirAEntero() {
        return (int) ((miBooleano) ? 1 : 0);
    }

    public long convertirALong() {
        return (long) ((miBooleano) ? 1 : 0);

    }

    public float convertirAFloat() {
        return (float) ((miBooleano) ? 1 : 0);
    }

    public double convertirADouble() {
        return (double) ((miBooleano) ? 1 : 0);
    }

    public char convertirAChar() {
        return (miBooleano) ? '1' : '0';
    }

    public String convertirAString() {
        return (miBooleano) ? "1" : "0";
    }

    public void mostrarError(String tipoDeError) {
        System.out.println(tipoDeError);
    }

}
