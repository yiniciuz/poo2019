import java.util.ArrayList;
import java.util.Scanner;

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

    public Sistema(float sySaldo){
        this.sySaldo = sySaldo;
        this.clientes = new ArrayList<Cliente>();
    }

    void cadastro (Cliente cliente){
            if(this.procurar(cliente.id) != null){
                System.out.println("cliente ja cadastrado");
                return;
            }
            clientes.add(cliente);
    }

    Cliente procurar (String id){
        for(Cliente cli : clientes) {
            if (cli.id.equals(id)){
                return cli;
            }
        }
        return null;
    }

    void emprestar (String id, float saldo){
        Cliente i = procurar(id);
        if(i == null){
            System.out.println("cliente inexistente");
            return;
        }
        if(sySaldo < saldo){
            System.out.println("erro: saldo insuficiente");
            return;
        }
        this.sySaldo -= saldo;
        i.saldo += saldo;
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
            if (ui[0].equals("init")){
                sistema = new Sistema(Float.parseFloat(ui[1]));
            }else if(ui[0].equals("show")){
                System.out.println(sistema);
            }else if(ui[0].equals("cadastrar")){
                String id = ui[1];
                String nome = "";
                for(int i = 2; i < ui.length; i++){
                    nome += ui[i] + " ";
                }nome = nome.substring(0, nome.length() -1);
                sistema.cadastro(new Cliente(id, nome));
            }else if(ui[0].equals("emprestar")){
                sistema.emprestar(ui[1], Float.parseFloat(ui[2]));
            }else if(ui[0].equals("end")){
                break;
            }else{
                System.out.println("comando invalido!");
            }
        }
    }
}