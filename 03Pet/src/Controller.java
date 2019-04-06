import java.util.Scanner;
import static java.lang.Integer.*;

class Pet {
    String nome;
    private int energia;
    private int saciedade;
    private int limpeza;
    private int energiaMax;
    private int saciedadeMax;
    private int limpezaMax;
    private int idade;
    private int diamante;


    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia >= this.energiaMax)
            this.energia = energiaMax;
        else if(energia < 0)
            this.energia = 0;
        else
            this.energia = energia;
    }

    public int getSaciedade() {
        return saciedade;
    }

    public void setSaciedade(int saciedade) {
        if(saciedade >= this.saciedadeMax)
            this.saciedade = saciedadeMax;
        else if(saciedade < 0)
            this.saciedade = 0;
        else
            this.saciedade = saciedade;
    }

    public int getLimpeza() {
        return limpeza;
    }

    public void setLimpeza(int limpeza) {
        this.limpeza = limpeza;
    }

    public void play(){
        this.setEnergia(this.getEnergia() -2);
        this.setSaciedade(this.getSaciedade() -1);
        this.setLimpeza(this.getLimpeza() -3);
        this.diamante += 1;
        this.idade += 1;
    }


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
                "E:" + this.energia + "/" + this.energiaMax + ", " +
                "S:" + this.saciedade + "/" + this.saciedadeMax + ", " +
                "L:" + this.limpeza + "/" + this.limpezaMax + ", " +
                "D: " + this.diamante + ", I:" + this.idade;
    }
}

public class Controller{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pet pet = new Pet(" ",0, 0, 0);
        System.out.println("init (+nome, energia, saciedade, limpeza), show, end");
        while (true) {
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){
                pet = new Pet(ui[1], Integer.parseInt(ui[2]),
                                     Integer.parseInt(ui[3]),
                                     Integer.parseInt(ui[4]));
            }else if(ui[0].equals("play")){
                pet.play();
            }else if(ui[0].equals("show")){
                System.out.println(pet);
            }else{
                System.out.println("comando invalido");
            }
        }
    }

}