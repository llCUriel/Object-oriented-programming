import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class TiendaDepartamental {

    private String nombreDeLaTienda;
    private LinkedList articulos;
    private LinkedList clientes;

    public TiendaDepartamental() {
        articulos = inicializarAriticulos();
        clientes = new LinkedList();
        nombreDeLaTienda = "Tienda Don Ramón";
    }

    public LinkedList inicializarAriticulos() {
        Object obj = Arrays.asList(
                new Articulo(20, "Detergente")
        );
        return new LinkedList((Collection) obj);
    }

    public void darDeAltaNuevoCliente(Cliente c) {
        clientes.add(c);
    }

    public Cliente buscarCliente(int numeroDeCuenta) {
        int i = 0;
        while (i < clientes.size()) {
            Cliente cli = (Cliente) clientes.get(i);
            if (numeroDeCuenta == cli.getNumeroDeCuenta()) {
                return cli;
            }
        }
        return null;
    }

    public double checarSaldoDeCliente(int numeroDeCuenta) {
        Cliente cli = buscarCliente(numeroDeCuenta);
        if (cli != null) {
            double saldoInicial = cli.getSaldoPrincipioMes();
            double totalDeArticulosAdq = cli.getTotalDeArticulosAdqDurMes();
            double precioDeArticulo = ((Articulo) articulos.get(0)).getPrecioDelArticulo();
            double cred = cli.getTotalDeCredAplicEsteMes();
            return saldoInicial + totalDeArticulosAdq * precioDeArticulo - cred;
        }
        return 0;
    }

    public double checarLimiteDeCredito(int numeroDeCuenta) {
        return buscarCliente(numeroDeCuenta).getLimiteDeCredito();
    }

    public void desplegarEstatusDeCliente(int numeroDeCuenta) {
        String c = "Limite de crédito";
        String n = " excedido";
        boolean lim = checarEstatusDeCliente(numeroDeCuenta);
        String str = lim ? c + n : c + "no " + n;
        System.out.println(nombreDeLaTienda+'\n'+str);
    }

    public boolean checarEstatusDeCliente(int numeroDeCuenta) {
        return checarSaldoDeCliente(numeroDeCuenta) > checarLimiteDeCredito(numeroDeCuenta);
    }
}
