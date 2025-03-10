public abstract class Cuenta {
    private String numero;
    private String Titular;
    private Double saldo;

    public Cuenta(String numero, String titular, Double saldo) {
        this.numero = numero;
        Titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return Titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    protected void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public abstract boolean retirar(double cantidad);
    

}
