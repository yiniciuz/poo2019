public class Cliente {
    private String nome;
    private String sobrenome;
    private int idade;
    private String CPF;
    private String endereço;

    public Cliente(){};
    public Cliente(String nome, String sobrenome, int idade, String CPF, String endereço) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.CPF = CPF;
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", CPF='" + CPF + '\'' +
                ", endereço='" + endereço + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void fazerAvalaiação(Avaliação avaliação){
        System.out.println(avaliação);
    }

    public void selecionarTarefa(String tipo){

    }

    public void cadastrarPet(String nomePet, int idadePet, String tipo, String detalhes){
        Pet animal = new Pet(nomePet, idadePet, tipo, detalhes);
    }
}
