import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class Pet {
    String nome;
    int energia;
    int saciedade;
    int limpeza;
    /*__int idade;
    int diamantes;*/
    int energiaMax;
    int saciedadeMax;
    int limpezaMax;

    public Pet(String name, int energia,int saciedade,int limpeza){
        this.nome = name;
        this.energia = energia;
        this.saciedade = saciedade;
        this.limpeza = limpeza;
        this.energiaMax = energiaMax;
        this.saciedadeMax = saciedadeMax;
        this.limpezaMax = limpezaMax;
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
        Scanner scan = new Scanner(System.in); /*__ cria uma variavel scan do tipo
                                                Scanner que o parametro é System in, uma entrada do cliente*/
        Pet pet = new Pet(" ",0, 0, 0);
        System.out.println("init, show, end");
        while(true){
            String[] ui; /*__ O '[]' significa que se trata de uma vetor (lista) do tipo string */

        }
    }

}