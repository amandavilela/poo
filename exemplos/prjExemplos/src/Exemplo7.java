import java.util.Scanner;

public class Exemplo7{	
    public static void main(String[] args){

        Scanner Entrada = new Scanner (System.in); // criação de um novo objeto Scanner

        int ra, cont, qtdeAprov=0, qtdeReprov=0;
        String nome;
        double nota1, nota2, media, mediaTur=0;

        for(cont=1;cont<=10;cont++){
                System.out.println("Ra: ");
                ra=Entrada.nextInt();
                System.out.println("Nome: ");
                nome = Entrada.next();
                System.out.println("Nota 1: ");
                nota1 = Entrada.nextDouble();
                System.out.println("Nota 2: ");
                nota2 = Entrada.nextDouble();

                media = (nota1+nota2)/2;
                mediaTur += media;
                System.out.println("Media: " + media);

                if (media>=6){
                        System.out.println("Parabens! voce foi aprovado com a media " + media + ".");
                        qtdeAprov++;
                }else{
                        System.out.println("Sua media e " + media + ". Voce foi reprovado.");
                        qtdeReprov++;
                }
        }
        System.out.println("\n\nQtde. Aprovados: " +qtdeAprov);
        System.out.println("\n\nQtde. Reprovados: " +qtdeReprov);
        System.out.println("\n\nMedia da turma: " +mediaTur/10);
    }
}