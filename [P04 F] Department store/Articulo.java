public class Articulo {

    private double precioDelArticulo;
    private String nombre;

    public Articulo(double precioDelArticulo, String nombre) {
        this.precioDelArticulo = precioDelArticulo;
        this.nombre = nombre;
    }

    public double getPrecioDelArticulo() {
        return precioDelArticulo;
    }

    public void setPrecioDelArticulo(double precioDelArticulo) {
        this.precioDelArticulo = precioDelArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
