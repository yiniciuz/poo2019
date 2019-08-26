import java.util.Scanner;
public class IMC {
    String nome;
    float peso;
    float altura;

    public String toString(){
        return "nome: " + nome + ", peso: " + peso + ", altura: " + altura;
    }

    public void calculo (float peso, float altura, float IMC){
        float calc = 0;
        calc = this.peso/this.altura;
        System.out.println(IMC);
    }

}
