package teste;

import java.util.Scanner;

public class Atividade {
    private int codigo;
    public String horario;
    public String data;
    private String tipo;
    public double preco;
    private int duracao;
    private Participante[] participantes;

    public Atividade(){}
    public Atividade(int codigo, String horario, String data, String tipo, double preco, int duracao, Participante[] participantes) {
        this.codigo = codigo;
        this.horario = horario;
        this.data = data;
        this.tipo = tipo;
        this.preco = preco;
        this.duracao = duracao;
        this.participantes = participantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo.equals("palestra") || tipo.equals("minicurso"))
        this.tipo = tipo;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    public String toString(){
        return "codigo: " + codigo + ", horario: " + horario +
                ", data: " + data + ", preco: " + preco + ", duração: "
                + duracao + ", participantes: " + participantes;
    }

    public Participante busca(int id){
        for(Participante x : this.participantes){
            if(x.getId()==id){
                return x;
            }
        }return null;
    }

    public void preencher(){
        Scanner scan = new Scanner(System.in);
        for(int y = 0; y <this.participantes.length; y++){
            int id = Integer.parseInt(scan.nextLine());
            String nome = scan.nextLine();
            String email = scan.nextLine();
            Participante x = new Participante(nome, email, id);
            this.participantes[y] = x;
        }
    }
}
