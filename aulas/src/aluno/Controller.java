package aluno;
public class Controller {
    public static void main(String[] args) {
        Aluno rebeca = new Aluno("Rebeca", 19, "Design Digital", 7.6);

        System.out.println(rebeca);
        rebeca.estudar("POO");

        Aluno vinicius = new Aluno();
        vinicius.setNome ("vinicius");
        vinicius.setIdade (21);
        vinicius.matricula("Desig Digital");
    }
}
