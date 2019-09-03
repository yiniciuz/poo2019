package carro1;

public class Carro {
    String marca;
    int ano;
    String cor;
    String modelo;
    double velocidade;

    public void acelerar (){
        velocidade +=10;
    }

    public void frear (){
        if (velocidade >= 10){
            velocidade -= 10;
        }else{
            this.parar();
        }
    }

    public void parar (){
        velocidade = 0;
    }

    public void mudarModelo (String modelo){
        this.modelo = modelo;
    }

    public static int contaCarros(Carro[] carros, String marca){
        int quant = 0;
        for(Carro i : carros){
            if (i.equals(marca)){
                quant ++;
            }
        }return quant;

    }

}