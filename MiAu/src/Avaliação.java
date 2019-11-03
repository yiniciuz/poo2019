public class Avaliação {
    private String nome;
    private float nota;
    private String detalhes;

    public Avaliação(){};
    public Avaliação(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public void enviarAvaliação(String detalhes){
        this.detalhes = detalhes;
    }
}
