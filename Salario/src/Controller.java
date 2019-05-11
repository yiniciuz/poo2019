import java.util.ArrayList;

abstract class Funcionario{
   String nome;
   String funcao;
   abstract double salario();


   public Funcionario(String nome){
       this.nome = nome;
       this.funcao = funcao;
   }

   public String toString(){
       return funcao + ": " + nome;
   }
}

class Professor extends Funcionario{
    char classe;
    double salario() {
        return 0;
    }
}

public class Controller {
    public static void main(String[] args) {
        char classe = 'C';
        String nome = "david";

    public Professor(String nome) {
            super(nome);
        }

        double salario(){
            return 100.0;
        }

    }
    }
}
