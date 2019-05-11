import java.util.ArrayList;
import java.util.TreeMap;

class Cliente{
    String id;
    String nome;
    float saldo;

    public Cliente(String id, String nome, float saldo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String toString(){
        return id + ": " + nome + ", " + saldo;
    }
}

class Sistema {
    float sySaldo;
    TreeMap<String, Cliente> clientes;
    int cont;

    public Sistema(float sySaldo, TreeMap<String, Cliente> clientes, int cont) {
        this.sySaldo = sySaldo;
        this.clientes = new TreeMap<String, Cliente>();
        this.cont = 0;
    }

    public String toString() {
        String saida = "";
        saida += "saldo do sistema: " + this.sySaldo;
        return saida;
    }

    void cadastrar(Cliente clientes){
        try{
            this.procurar(clientes.id);
            throw new RuntimeException("cliente ja cadastrado");
        }catch (RuntimeException re){
            clientes.put(clientes);
        }
    }

    Cliente procurar (String id){
        for(Cliente i : clientes) {
            if (i.id.equals(id)){
                return i;
            }
        }
        throw new RuntimeException("cliente inexistente");
    }
}