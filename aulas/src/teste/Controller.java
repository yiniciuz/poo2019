package teste;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo = Integer.parseInt(scan.nextLine());
        String horario = scan.nextLine();
        String data = scan.nextLine();
        String tipo = scan.nextLine();
        double preco = Integer.parseInt(scan.nextLine());
        int duracao = Integer.parseInt(scan.nextLine());
        Participante[] participantes = new Participante[50];
        Atividade atv = new Atividade(codigo, horario, data, tipo, preco, duracao, participantes);
        atv.preencher();

        int id = Integer.parseInt(scan.nextLine());
        Participante x = atv.busca(id);
        if(x == null){
            System.out.println("Participante inexistente");
        }else{
            System.out.println(x);
        }
    }
}
