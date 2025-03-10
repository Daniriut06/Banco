public class Credito extends Cuenta {
    private Double limiteCredito;

    public Credito(String numero, String titular, Double saldo, Double limiteCredito) {
        super(numero, titular, saldo);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public boolean retirar(double cantidad) {
        if (getSaldo() + limiteCredito >= cantidad) {
            setSaldo(getSaldo() - cantidad);
            return true;
        }
        return false;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

}
