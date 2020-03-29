public class Cliente {

    private int numeroDeCuenta;
    private double saldoPrincipioMes;
    private int totalDeArticulosAdqDurMes;
    private int totalDeCredAplicEsteMes;
    private double limiteDeCredito;

    public Cliente(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.limiteDeCredito = 0;
        this.saldoPrincipioMes = 0;
        this.totalDeArticulosAdqDurMes = 0;
        this.totalDeCredAplicEsteMes = 0;
    }

    public void abonarADeuda(int cantidad) {
        saldoPrincipioMes -= cantidad;
    }

    public void consultarSaldo() {
        double saldo = saldoPrincipioMes + totalDeArticulosAdqDurMes * 20 - totalDeCredAplicEsteMes;
        System.out.println("Su saldo: ");
        System.out.println(saldo);
    }

    public void consultarLimiteDeCredito() {
        System.out.println("Limite de crédito: ");
        System.out.println(limiteDeCredito);
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    public void setSaldoPrincipioMes(double saldoPrincipioMes) {
        this.saldoPrincipioMes = saldoPrincipioMes;
    }

    public void setTotalDeArticulosAdqDurMes(int totalDeArticulosAdqDurMes) {
        this.totalDeArticulosAdqDurMes = totalDeArticulosAdqDurMes;
    }

    public void setTotalDeCredAplicEsteMes(int totalDeCredAplicEsteMes) {
        this.totalDeCredAplicEsteMes = totalDeCredAplicEsteMes;
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public double getSaldoPrincipioMes() {
        return saldoPrincipioMes;
    }

    public int getTotalDeArticulosAdqDurMes() {
        return totalDeArticulosAdqDurMes;
    }

    public int getTotalDeCredAplicEsteMes() {
        return totalDeCredAplicEsteMes;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
}
