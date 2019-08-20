public class Carro {

    public String marca;
    public int ano;
    public String cor;
    public String modelo;
    public double velocidade;

    public acelerar (){
        velocidade +=10;
    }

    public frear (){
        if (velocidade >= 10){
            velocidade -= 10;
        }else{
            this.parar();
        }
    }

    public parar (){
        velocidade = 0;
    }

    public mudarModelo (String modelo){

    }

}