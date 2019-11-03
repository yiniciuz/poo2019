package while_teste;

public class Principal {
    public static void main(String[] args) {
        int[] v = {1,4,5,6,2,8,9,0,3,7};
        int t = v.length;
        int aux = 0;
        while (t < 1){
            for(int i = 0; i < (t-1); i++){
                if(v[i] < v[i++] )
                    aux = v[i];
                    v[i] = v[i+1];
                    v[i+1] = aux;
            }
            t--;
        }
    }
}
