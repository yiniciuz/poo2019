import java.util.ArrayList;
import java.util.Scanner;

class Transacao{
    int idT;
    float valor;
    String id;

    public Transacao(int idT, float valor, String id) {
        this.idT = idT;
        this.valor = valor;
        this.id = id;
    }

    public String toString() {
        return " " + idT + " : " + id + " : " + valor;
    }
}


class Cliente{
    String id;
    String nome;
    float saldo;

    public Cliente(String id, String nome){
        this.id = id;
        this.nome = nome;
        this.saldo = 0;
    }


    public String toString(){
        return this.id + " : " + this.nome + " : " + this.saldo;
    }
}

class Sistema{
    float sySaldo;
    ArrayList<Cliente> clientes;
    ArrayList<Transacao> transacoes;
    int cont;

    public Sistema(float sySaldo){
        this.sySaldo = sySaldo;
        this.clientes = new ArrayList<Cliente>();
        this.transacoes = new ArrayList<Transacao>();
        this.cont = 0;

    }

    void cadastro (Cliente cliente){
        try{
            this.procurar(cliente.id);
            throw new RuntimeException("cliente ja cadastrado");
        }catch (RuntimeException re){
            clientes.add(cliente);
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

    void addTransacao(String id, float valor){
        this.transacoes.add(new Transacao(cont, valor, id));
        cont += 1;
    }

    void emprestar(String id, float saldo){
        Cliente i = procurar(id);
        if(sySaldo < saldo) {
            System.out.println("valor muito alto");
            return;
        }
        addTransacao(id, -saldo);
        this.sySaldo -= saldo;
        i.saldo += saldo;
    }

    void receber(String id, float saldo){
        Cliente i = procurar(id);
        if(i.saldo < saldo) {
            System.out.println("valor maior que a divida");
            return;
        }
        addTransacao(id, +saldo) ;
        this.sySaldo += saldo;
        i.saldo -= saldo;
    }


    ArrayList<Transacao> getHistorico(){
        return transacoes;
    }

    public String toString(){
        String saida = "";
        for(Cliente cliente : clientes)
            saida += cliente + "\n";
        saida += "saldo: " + this.sySaldo;
        return saida;
    }
}

public class Controller{
    public static void main(String[] args) {
        Sistema sistema = new Sistema(0);
        Scanner scan = new Scanner(System.in);
        while(true){
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            try {
                if (ui[0].equals("init")) {
                    sistema = new Sistema(Float.parseFloat(ui[1]));
                } else if (ui[0].equals("show")) {
                    System.out.println(sistema);
                } else if (ui[0].equals("cadastrar")) {
                    String id = ui[1];
                    String nome = "";
                    for (int i = 2; i < ui.length; i++) {
                        nome += ui[i] + " ";
                    }
                    nome = nome.substring(0, nome.length() - 1);
                    sistema.cadastro(new Cliente(id, nome));
                } else if (ui[0].equals("historico")) {
                    for (Transacao i : sistema.getHistorico())
                        System.out.println(i);
                } else if (ui[0].equals("emprestar")) {
                    sistema.receber(ui[1], Float.parseFloat(ui[2]));
                } else if (ui[0].equals("receber")) {
                    sistema.emprestar(ui[1], Float.parseFloat(ui[2]));
                } else if (ui[0].equals("end")) {
                    break;
                } else {
                    System.out.println("comando invalido!");
                }
            }
            catch(RuntimeException re){
                System.out.println(re.getMessage());
            }
        }
    }
}