package quartoHotel;

import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("HOTEL RECANTO DO SOSSEGO");

        System.out.println("Digite o numero do quarto: ");
        int nQuarto = Entrada.nextInt();
        System.out.println("Digite o valor da diária: ");
        double vDiaria = Entrada.nextDouble();
        QuartoHotel objQuarto = new QuartoHotel(nQuarto, vDiaria);
        
        do {
            System.out.println("\n\nEscolha uma opcao: ");
            System.out.println("1 - Consultar quarto");
            System.out.println("2 - Reservar quarto");
            System.out.println("3 - Liberar quarto");
            System.out.println("4 - Consultar Faturamento");
            System.out.println("5 - Sair");
            opcao = Entrada.nextInt();
            
            if(opcao==1) {
                System.out.println("Numero do quarto: "+nQuarto);
                if(objQuarto.getSituacao()==false) {
                    System.out.println("Situacao: Liberado");
                }
                else {
                    System.out.println("Situacao: Reservado");
                }
            } 
            
            else if(opcao==2) {
                if(objQuarto.getSituacao() == false) {
                    System.out.println("Digite o RG do hóspede: ");
                    int rg = Entrada.nextInt();
                    objQuarto.reservar(rg);
                    System.out.println("O quarto foi reservado com sucesso");
                } else {
                    System.out.println("Erro: Esse quarto já se encontra reservado");
                }
            } 
            
            else if(opcao==3) {
                if(objQuarto.getSituacao() == true) {
                    System.out.println("Digite a quantidade de dias: ");
                    int dias = Entrada.nextInt();
                    System.out.println("O quarto foi liberado com sucesso e o valor da hospedagem é de "
                            + objQuarto.liberar(dias));
                } else {
                    System.out.println("Erro: Esse quarto já se encontra liberado");
                }
            } 
            
            else if(opcao==4) {
                System.out.println("O faturamento do quarto é de: R$" 
                        + objQuarto.getTotalFaturado());
            }
        } while(opcao!=5);
    }
}
