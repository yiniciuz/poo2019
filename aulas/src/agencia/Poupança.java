package agencia;

public class Poupança extends Conta{
    protected float rendimento;

    public Poupança(){}
    public Poupança(int id, String cliente) {
        super (id, cliente);
        this.tipo = "CP";
        this.rendimento = 1;
    }

    public void Atualização() {
        this.saldo += (this.saldo/00.1);
        System.out.println(this.id + ":" + this.cliente + this.saldo + this.saldo + ": CP");
    }
}
