package agencia;

import java.util.ArrayList;
import java.util.Arrays;

public class Cliente{
    private String id;
    private ArrayList<Conta> contas;

    public Cliente(){}

    public Cliente(String id) {
        this.id = id;
        this.contas = new ArrayList<Conta>(contas);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", contas=" + contas +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Cliente> clientes) {
        this.contas = contas;
    }

}
