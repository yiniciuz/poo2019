public class PrincipalCarro {
    public static void main(String args[]) {
        Carro rebeca = new Carro();
        rebeca.marca = "Honda";
        rebeca.modelo = "Civic";
        rebeca.cor = "rosa";
        rebeca.ano = 2019;
        rebeca.velocidade = 200;
        System.out.println(rebeca);

        Carro vinicius = new Carro();
        vinicius.marca = "Benz";
        vinicius.modelo = "G class";
        vinicius.ano = 2019;
        vinicius.cor = "preto";
        vinicius.velocidade = 60;
        System.out.println(vinicius);

        Carro natan = new Carro();
        natan.marca = "BMW";
        natan.modelo = "BMW 18";
        natan.ano = 2019;
        natan.cor = "branco";
        natan.velocidade = 40;
        System.out.println(natan);

        Carro tamires = new Carro();
        tamires.marca = "Fusca";
        tamires.modelo = "Volkswagen";
        tamires.ano = 1989;
        tamires.cor = "azul bebe";
        tamires.velocidade = 50;
        System.out.println(tamires);

        Carro quant[] = {vinicius, rebeca, natan};
        System.out.println(quant);

        Carro.contaCarros(quant, "Honda");
    }
}