import java.util.Scanner;

public class Pet {
    String nome;
    int energia;
    int saciedade;
    int limpeza;
    int energiaMax;
    int saciedadeMax;
    int limpezaMax;

    public Pet(String name, int energia,int saciedade,int limpeza){
        this.nome = name;
        this.energia = energia;
        this.saciedade = saciedade;
        this.limpeza = limpeza;
        this.energiaMax = energia;
        this.saciedadeMax = saciedade;
        this.limpezaMax = limpeza;
    }

    public String toString() {
        return "[" + this.name + "] " +
                "E: " + this.energia + "/" + this.energiaMax + ", " +
                "S: " + this.saciedade + "/" + this.saciedadeMax + ", " +
                "L: " + this.limpeza + "/" + this.limpezaMax;
    }
}

class Controller{
    public static void main(Sting[] args) {
        Scanner scan = new Scanner(System.in);
        Pet pet = new Pet(" ",0, 0, 0);
        System.out.println("init (+ nome, energia, saciedade, limpeza), show, end");
        label:
        while (true) {
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            switch (ui[0]) {
                case "init":
                    pet = new Pet(ui[1], Integer.parseInt(ui[2]), Integer.parseInt(ui[3]), Integer.parseInt(ui[4]);
                case "show":
                    System.out.println(pet);
                case "end":
                    break label;
                default:
                    System.out.println("comando invalido");
            }
        }
    }

}