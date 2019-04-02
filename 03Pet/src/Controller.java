import java.util.Scanner;

import static java.lang.Integer.*;

class Pet {
    String nome;
    int energia;
    int saciedade;
    int limpeza;
    int energiaMax;
    int saciedadeMax;
    int limpezaMax;
    int idade;
    int diamante;

    public Pet(String name, int energia,int saciedade,int limpeza){
        this.nome = name;
        this.energia = energia;
        this.saciedade = saciedade;
        this.limpeza = limpeza;
        this.energiaMax = energia;
        this.saciedadeMax = saciedade;
        this.limpezaMax = limpeza;
        this.idade = idade;
        this.diamante = diamante;
    }

    public String toString() {
        return "[" + this.nome + "] " +
                "E: " + this.energia + "/" + this.energiaMax + ", " +
                "S: " + this.saciedade + "/" + this.saciedadeMax + ", " +
                "L: " + this.limpeza + "/" + this.limpezaMax + ", " +
                "idade: " + this.idade + " - diamantes: " + this.diamante;
    }
}

public class Controller{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pet pet = new Pet(" ",0, 0, 0);
        System.out.println("init (+nome, energia, saciedade, limpeza), show, end")
        while (true) {
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){
                pet = new Pet(ui[1], Integer.parseInt(ui[2]),
                                     Integer.parseInt(ui[3]),
                                     Integer.parseInt(ui[4]));
            }else if(ui[0].equals("show")){
                System.out.println(pet);
            }else{
                System.out.println("fail: comando invalido");
            }
        }
    }

}