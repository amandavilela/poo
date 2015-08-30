public class Exemplo6{
    public static void main(String[] args){
        int Soma=0, Cont=0;

        do{
                Cont++;
                Soma+=Cont;
        }while(Cont<=99);

        System.out.println("A soma de 1 a 100 e': "+ Soma);
    }
}