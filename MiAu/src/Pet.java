public class Pet {
    private String nomePet;
    private int idade;
    private String detalhes;

    public Pet(){};
    public Pet(String nomePet, int idade, String detalhes) {
        this.nomePet = nomePet;
        this.idade = idade;
        this.detalhes = detalhes;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nomePet='" + nomePet + '\'' +
                ", idade=" + idade +
                ", detalhes='" + detalhes + '\'' +
                '}';
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}
