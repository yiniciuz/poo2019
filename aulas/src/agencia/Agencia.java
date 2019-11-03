package agencia;

import agencia.Cliente;
import agencia.Conta;

import java.util.ArrayList;

public class Agencia extends Conta {
    protected ArrayList<Cliente> clientes;
    protected ArrayList<Conta> contas;

    @Override
    public String toString() {
        return "Agencia{" +
                "clientes= " + clientes + '}';
    }

    public void adicionar(String id){
        for(int i = 0; i < clientes.size(); i ++){
            Cliente cliente = this.clientes.get(i);
            if(clientes.equals(id)){
                System.out.println("CLIENTE JÁ CADASTRADO");
                return;
            }else{
                clientes.add(new Cliente());
                return;
            }
        }
    }

    @Override
    public void Atualização() {

    }
}
