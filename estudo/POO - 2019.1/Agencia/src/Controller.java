import java.util.Scanner;
import java.util.TreeMap;

class Cliente{
    String id;
    String nome;
    float CC = 0;
    float CP = 0;

    public Cliente(String id,String nome){
        this.id = id;
        this.nome = nome;
    }

    public String toString() {
        return id + ":" + nome + ": CC " + CC + ": CP " + CP;
    }
}

class Sistema {
    TreeMap<String, Cliente> clientes;

    public Sistema() {
        clientes = new TreeMap<String, Cliente>();
    }

    public void inserir(String id, String nome) {
        Cliente cliente = clientes.get(id);
        if (clientes == null) {
            clientes.put(id, new Cliente(id, nome));
        }
    }

    public String toString(){
        String saida = "";
        for(String key : clientes.keySet())
            saida += clientes.get(key) + "\n";
        return saida;
    }

    void depositoCC(String id, float CC){
        Cliente cliente = clientes.get(id);
        cliente.CC += CC;
    }

    void depositoCP(String id, float CP){
        Cliente cliente = clientes.get(id);
        cliente.CP += CP;
    }

    void saqueCC(String id, float CC){
        Cliente cliente = clientes.get(id);
        cliente.CC -= CC;
    }

    void saqueCP(String id, float CP){
        Cliente cliente = clientes.get(id);
        cliente.CP -= CP;
    }

}


public class Controller {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner scan = new Scanner(System.in);
        while (true) {
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            if(ui[0].equals("addCliente")){
                    new Cliente(ui[1], ui[2]);
                }else if(ui[0].equals("depositoCC")){
                    sistema.depositoCC(ui[1], Float.parseFloat(ui[2]));
                }else if(ui[0].equals("depositoCP")){
                    sistema.depositoCP(ui[1], Float.parseFloat(ui[2]));
                }else if(ui[0].equals("saqueCC")){
                    sistema.saqueCC(ui[1], Float.parseFloat(ui[2]));
                }else if(ui[0].equals("saqueCP")){
                    sistema.saqueCP(ui[1], Float.parseFloat(ui[2]));
                }else if(ui[0].equals("show")){
                    System.out.println(sistema);
                }else if(ui[0].equals("end")){
                    break;
                }else{
                    System.out.println("comando invalido!");
            }
        }
    }
}