public class Transaccion {
    private Cuenta cuenta;
    private String tipo;
    private Double valor;
    private Double saldo;
    
    public Transaccion(Cuenta cuenta, String tipo, Double valor, Double saldo) {
        this.cuenta = cuenta;
        this.tipo = tipo;
        this.valor = valor;
        this.saldo = saldo;
    }
    public Cuenta getCuenta() {
        return cuenta;
    }
    public String getTipo() {
        return tipo;
    }
    public Double getValor() {
        return valor;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    


    
}
