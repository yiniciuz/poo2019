import java.util.Scanner;

class IMC{
    String nome;
    float peso;
    float altura;

    public IMC(String nome, float peso, float altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String toString(){
        return "nome: " + nome + ", peso: " + peso + ", altura: " + altura;
    }

    public void calculo (float peso, float altura, float IMC){
        float calc = 0;
        calc = this.peso/this.altura;
        System.out.println(IMC);
    }
}


public class IMC {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            String line = scan.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("init")) {
                IMC = new IMC((ui[1]), Integer.parseInt(ui[2]),Integer.parseInt(ui[3]));
            } else if (ui[0].equals("calcular")){
                IMC.calculo();
            }
        }
    }
}
