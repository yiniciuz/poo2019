package atividade_banco;

public abstract class Conta {
    protected double saldo;
    protected String conta;

    public Conta(double saldo, String conta) {
        this.saldo = saldo;
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", conta='" + conta + '\'' +
                '}';
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public abstract void tarifa();
}
