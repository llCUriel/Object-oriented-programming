package TiendaDepartamental;

import java.util.Scanner;

public class ProbadorDeApp {

    private TiendaDepartamental n;

    public ProbadorDeApp() {
        n = new TiendaDepartamental();
    }

    public void probarAp() {
        Scanner tecl = new Scanner(System.in);
        Cliente cli = new Cliente(0);

        int numeroDeCuenta = cli.getNumeroDeCuenta();

        cli.setLimiteDeCredito(200);
        cli.setSaldoPrincipioMes(300);
        cli.setTotalDeArticulosAdqDurMes(2);
        cli.setTotalDeCredAplicEsteMes(20);

        n.darDeAltaNuevoCliente(cli);

        n.desplegarEstatusDeCliente(numeroDeCuenta);

        cli.consultarSaldo();

        cli.consultarLimiteDeCredito();

        if (n.checarEstatusDeCliente(numeroDeCuenta)) {
            System.out.println("¿Desea abonar a su deuda? 1/0");
            if (tecl.nextInt() == 1) {
                System.out.println("Ingrese la cantidad a abonar");
                int cantidad = tecl.nextInt();
                cli.abonarADeuda(cantidad);
                cli.consultarSaldo();
            }
            System.exit(0);
        }
    }

}
