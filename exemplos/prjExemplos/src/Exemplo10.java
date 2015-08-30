public class Exemplo10{
    public static void main(String[] args){

        double tabNum[];
        tabNum = new double[15];
        double media, somaElementos=0, qtdeAcima;
        int cont;

        for(cont=0;cont<tabNum.length;cont++){
                tabNum[cont]=Math.random()*100;
        }

        for(cont=0;cont<tabNum.length;cont++){
                System.out.println("\nTabNum[" + cont + "] = " + tabNum[cont]);
                somaElementos+=tabNum[cont];
        }

        media=somaElementos/tabNum.length;
        System.out.println("\n\nMedia: " + media);
        System.out.println("Quantidade de elementos: " + tabNum.length);

    }
}