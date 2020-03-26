public class UsuarioDeBanco {

    private String nombreCompleto;

    public UsuarioDeBanco() {
        this.nombreCompleto = "";
    }

    public UsuarioDeBanco(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    protected void finalize() {
        nombreCompleto = null;
        System.gc();
    }

}
