package teste;
public class Participante {
    public String nome;
    private String email;
    private int id;

    public Participante(){}
    public Participante(String nome, String email, int id){
        this.nome = nome;
        this.email = email;;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "nome: " + nome + ", email: " + email + ", id: " + id;
    }

}
