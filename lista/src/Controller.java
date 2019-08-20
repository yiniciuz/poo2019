import java.util.Scanner;

class IMC{
    String nome;
    double peso;
    double altura;
    double IMC = 0;

    public IMC(String nome, double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String toString(){
        return "nome: " + nome + ", peso: " + peso + ", altura: " + altura;
    }

    void Calculo(double peso, double altura, double IMC){
        this.IMC = this.peso/this.altura;
    }

}


public class Controller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            try {
                if (ui[0].equals("init")){
                    IMC = new IMC(ui[1], ui[2], ui[3]);
                }

                }
                } else if (ui[0].equals("show")) {

                }
    }
}
