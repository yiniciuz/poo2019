import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Usuario{
    String id;
    ArrayList<Usuario> seguidores;
    ArrayList<Usuario> seguidos;
    Map<Integer, String> tweets;

    public Usuario(String id){
        this.id = id;
        seguidores = new ArrayList<Usuario>();
        seguidos = new ArrayList<Usuario>();
        tweets = new TreeMap<Integer, String>();
    }

    public void seguir(Usuario other){
        for(Usuario user : seguidos)
            if(user.id.equals(other.id))
                return;
            this.seguidos.add(other);
            other.seguidores.add(this);
    }

    public String toString(){
        String saida = id + "\n seguidos: ";
        for (Usuario user : seguidos)
            saida += user.id + " ";
        saida += "\n seguidores: ";
        for (Usuario user : seguidores)
            saida += user.id +" ";
        saida += "\n";
        return saida;
    }
}

class Sistema{
    Map<String, Usuario> usuarios;


    public Sistema(){
        usuarios = new TreeMap<String, Usuario>();
    }

    public void addUsuario(String id){
        Usuario user = usuarios.get(id);
        if(user == null){
            usuarios.put(id, new Usuario(id));
        }
    }

    public Usuario getUsuario(String id){
        Usuario user = usuarios.get(id);
        if(user == null)
            throw new RuntimeException("ERRO: USUARIO INEXISTENTE");
        return user;
    }

    public String toString(){
        String saida = "";
        for(Usuario user : usuarios.values())
            saida += user + "\n";
        return saida;
    }
}

class Tweet{
   Map<Integer, String> tweets;
}

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();
        while(true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            try {
                if (ui[0].equals("add")) {
                    sistema.addUsuario(ui[1]);
                } else if (ui[0].equals("show")) {
                    System.out.println(sistema);
                } else if (ui[0].equals("seguir")) {
                    Usuario primeiro = sistema.getUsuario(ui[1]);
                    Usuario segundo = sistema.getUsuario(ui[2]);
                    primeiro.seguir(segundo);
                } else if (ui[0].equals("end")) {
                    break;
                } else {
                    System.out.println("ERRO: COMANDO INVALIDO");
                }
            }catch(RuntimeException rt){
                System.out.println(rt.getMessage());
            }
        }
    }
}
