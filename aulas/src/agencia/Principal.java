package agencia;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();
        Scanner scan = new Scanner(System.in);
        String i = scan.next();
        while(i != "sair"){
            switch(i){
                case "show":
                    System.out.println(agencia);
                    break;
                case "addCliente":
                    agencia.adicionar(scan.next());
                    break;
                case "sacar":
                    agencia.sacar(scan.nextFloat());
                case "depositar":
                    agencia.depositar(scan.nextFloat());
                case "transferir":
                    agencia.transferir(scan.next(), scan.nextFloat());
                case "show":
                    System.out.println(agencia);
                default:
                    System.out.println("COMANDO INVALIDO");
            }
            i = scan.next();
        }
    }
}
