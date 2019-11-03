package agencia;

public class Corrente extends Conta{
    protected float tarifaMensal;

    public Corrente(){}
    public Corrente(int id, String cliente) {
        super (id, cliente);
        this.tipo = "CC";
    }


    @Override
    public void Atualização() {
        this.saldo -= tarifaMensal;
        System.out.println(this.id + ":" + this.cliente + ": CC");
    }

}
