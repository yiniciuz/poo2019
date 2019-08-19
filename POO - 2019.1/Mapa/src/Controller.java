import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;


class Pessoa{
    String id;
    int idade;

    public Pessoa(String id, int idade) {
        this.id = id;
        this.idade = idade;
    }

    public String toString(){
        return id + " : " + idade;
    }
}

class Banco{
    TreeMap<String, Pessoa> pessoas;

    public Banco(){
        pessoas = new TreeMap<String, Pessoa>();
    }

    void inserir(String id, int idade){
        Pessoa pessoa = pessoas.get(id);
        if(pessoa == null){
            pessoas.put(id, new Pessoa(id, idade));
        }
    }

    void remover(String id, int idade){
        Pessoa pessoa = pessoas.get(id);
        if(pessoa == pessoas.get(id)){
            pessoas.remove(id);
        }

    }

    public String toString(){
        String saida = "";
        for(String key : pessoas.keySet())
            saida += pessoas.get(key) + "\n";
        return saida;
    }
}

public class Controller {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.inserir("Stegen", 26);
        banco.inserir("Semedo", 25);
        banco.inserir("Pique", 32);
        banco.inserir("Lenglet", 23);
        banco.inserir("Alba", 30);
        banco.inserir("Arthur", 22);
        banco.inserir("Busquets", 30);
        banco.inserir("Rakitic", 31);
        banco.inserir("Coutinho", 26);
        banco.inserir("Messi", 31);
        banco.inserir("Suarez", 32);

        //teste do remover
        banco.inserir("Malcom", 22);
        banco.remover("Malcom", 22);

        System.out.println(banco);
    }
}