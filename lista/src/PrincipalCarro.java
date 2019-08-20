public class PrincipalCarro {
    public static void main(String args[]) {
        Carro rebeca = new Carro();

        rebeca.marca = "Honda";
        rebeca.modelo = "Civic";
        rebeca.ano = 2019;
        rebeca.velocidade = 200;

        Carro vinicius = new Carro();

        rebeca.marca = "Benz";
        rebeca.modelo = "G class";
        rebeca.ano = 2019;
        rebeca.velocidade = 60;

        System.out.println("rebeca's car: " + rebeca + ", vinicius's car: " + vinicius);


        rebeca.frear();
        rebeca.frear();
        rebeca.parar();
        rebeca.acelerar();

        System.out.println(carro.rebeca);
    }
}