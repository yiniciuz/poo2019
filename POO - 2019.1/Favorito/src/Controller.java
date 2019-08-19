import java.lang.reflect.Array;
import java.util.ArrayList;

class Contato{
    String getID;
    int numero;
    String fav = "";

    public Contato(String getID, int numero, String fav){
        this.getID = getID;
        this.numero = numero;
        this.fav = "";
    }

    public String toString(){
        return fav + " " + getID + " : " + numero;
    }

}

class Agenda{
    ArrayList<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<Contato>();
    }

    public String toString(){
        String saida = "";
        for(Contato contato : contatos)
            saida += contato + "\n";
        saida += "saldo: ";
        return saida;
    }

    void addContato(String getID, int numero){
        this.contatos.add(new Contato(getID, numero));
    }
}


public class Controller {

}
