package agencia;

public abstract class Conta {
    protected int id;
    protected float saldo = 0;
    protected String cliente;
    protected String tipo;

    public Conta(){}
    public Conta(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", saldo=" + saldo +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {

        return saldo;

    }

    public void setSaldo(float saldo) {

        this.saldo = saldo;

    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;

    }

    public void sacar(float valor) {
        if (saldo > 0) {
            saldo -= valor;
        } else {
            System.out.println("SALDO INSUFICIENTE");
        }
    }

    public void depositar(float valor) {
        saldo += saldo+valor;
    }

    public void transferir(Conta outra, float valor) {
        if (saldo > 0) {
            this.saldo = -valor;
            outra.saldo = +valor;
        } else {
            System.out.println("SALDO INSUFICIENTE");
        }
    }

    public abstract void Atualização();
}
