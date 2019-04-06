import java.sql.SQLOutput;
import com.sun.jdi.connect.Connector;
import java.awt.desktop.SystemSleepListener;
import java.util.ArrayList;
import java.util.Scanner;

class Passageiro {
    String id;
    int idade;

    public Passageiro(String id, int idade) {
        this.id = id;
        this.idade = idade;
    }

    public String toString() {
        return this.id + " " + this.idade;
    }

    public boolean Preferencial(int idade) {
        if (idade <= 60) {
            return true;
        } else {
            return false;
        }
    }
}
class Topic {
    ArrayList <Passageiro> poltronas;
    int preferenciais;

    public Topic(int capacidade, int preferenciais){
        poltronas = new ArrayList<Passageiro>();
        for(int i = 0; i < capacidade; i++){
            poltronas.add(null);
        }
        this.preferenciais = preferenciais;
    }
    public String toString(){
        String saida = "[ ";
        for(int i = 0; i < poltronas.size(); i++){
            if(i < preferenciais)
                saida += "@ ";
            else
                saida += "= ";
        }
        return saida + "]";
    }

    public void inserir(Passageiro pass){
        
    }
}

public class Controller {
    public static void main(String[] args) {
        Topic topic = new Topic(0,0);
        Scanner scan = new Scanner(System.in);
        while (true){
            String line = scan.nextLine();
            String[ ] ui = line.split(" ");
            if(ui[0].equals("init")) {
                topic = new Topic(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if(ui[0].equals("show")) {
                System.out.println(topic);
            }else if(ui[0].equals("end")) {
                break;
            }else
                System.out.println("comando invalido");
        }
    }
}

