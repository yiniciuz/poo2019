package aluno;
public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private double ira;

    public Aluno(){}
    public Aluno (String nome, int idade, String curso, double ira){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.ira = ira;
    }
    @Override
    public String toString(){
        return "aluno: " + this.nome + " idade: " +this.idade+ " curso: " +this.curso+ " IRA"+ this.ira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getIra() {
        return ira;
    }

    public void setIra(double ira) {
        this.ira = ira;
    }


    public void estudar(String materia){
        System.out.println("o aluno esta estudando a materia " + materia);
    }

    public void matricula(String curso){
        this.curso = curso;
        System.out.println("o aluno esta matriculado em " + curso);
    }
}
