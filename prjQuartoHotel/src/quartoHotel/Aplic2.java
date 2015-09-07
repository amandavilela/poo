package quartoHotel;

import java.util.Scanner;

public class Aplic2 {

    public static void main(String[] args) {
        
        int numQuarto;
        double vlrDiaria;
        int opcao;
        int pos;
        int nQuarto;
        boolean continua = true;
        
        Scanner Entrada = new Scanner(System.in);
        
        QuartoHotel[] quartos = new QuartoHotel[10];
        
        for(int cont=0;cont<quartos.length;cont++){
            System.out.println("Digite o número do quarto: ");
            numQuarto=Entrada.nextInt();
            System.out.println("Digite o valor da diária: ");
            vlrDiaria=Entrada.nextDouble();
         
            quartos[cont] = new QuartoHotel(numQuarto, vlrDiaria);
        }
        
        do{
            System.out.println("Digite o numero do quarto: ");
            nQuarto = Entrada.nextInt();
            
            if(achaQuarto(nQuarto)){
              
                do{
                    
                    System.out.println("\n\nEscolha uma opcao: ");
                    System.out.println("1 - Consultar quarto");
                    System.out.println("2 - Reservar quarto");
                    System.out.println("3 - Liberar quarto");
                    System.out.println("4 - Consultar Faturamento");
                    System.out.println("5 - Sair");
                    opcao = Entrada.nextInt();

                    if(opcao==1) {
                        System.out.println("Numero do quarto: "+nQuarto);
                        if(quartos[pos].getSituacao()) {
                            System.out.println("Situacao: Reservado");
                        }
                        else {
                            System.out.println("Situacao: Liberado");
                        }
                    } 

                    else if(opcao==2) {
                        if(quartos[pos].getSituacao()) {
                            System.out.println("Erro: Esse quarto já se encontra reservado");
                        } else {
                            System.out.println("Digite o RG do hóspede: ");
                            int rg = Entrada.nextInt();
                            quartos[pos].reservar(rg);
                            System.out.println("O quarto foi reservado com sucesso");
                        }
                    } 

                    else if(opcao==3) {
                        if(quartos[pos].getSituacao()) {
                            System.out.println("Digite a quantidade de dias: ");
                            int dias = Entrada.nextInt();
                            System.out.println("O quarto foi liberado com sucesso e o valor da hospedagem é de "
                                    + quartos[pos].liberar(dias));
                        } else {
                            System.out.println("Erro: Esse quarto já se encontra liberado");
                        }
                    } 

                    else if(opcao==4) {
                        System.out.println("O faturamento do quarto é de: R$" 
                                + quartos[pos].getTotalFaturado());
                    }
                    else if(opcao==5) {
                        continua = false;
                    }
                    
                }while(opcao!=5);
            
            } else {
                System.out.println("Quarto não encontrado.");
            }
        } while(continua);
    }
    
    public boolean achaQuarto(int num){
            
            boolean tem = false;
            
            for(int cont=0;cont<quartos.length;cont++){
                if(quartos[cont].getNumQuarto() == num){
                    pos = cont;
                    tem = true;
                }
            }
            return tem;
        }
}
