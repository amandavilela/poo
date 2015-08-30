package fatec.poo.aula1;

import java.util.Scanner;

public class Aplic {
	
	public static void main(String[] args){
		
		Scanner Entrada = new Scanner(System.in);
		ContaTelefonica objContaTel = new ContaTelefonica();
		
		int numTelefone, tipoTel, totalPulsos, totalInter, totalServDesp; 
		
		System.out.println("Digite o numero de telefone: ");
		numTelefone = Entrada.nextInt();
		
		System.out.println("Digite o tipo do telefone: ");
		tipoTel = Entrada.nextInt();
		
		System.out.println("Digite a quantidade de pulsos: ");
		totalPulsos = Entrada.nextInt();
		
		System.out.println("Digite a quantidade de interurbanos (em minutos): ");
		totalInter = Entrada.nextInt();
		
		System.out.println("Digite a quantidade de servi�os de despertador: ");
		totalServDesp = Entrada.nextInt();
		
		System.out.println("O valor total da conta do numero " + numTelefone + " é: " + objContaTel.calcValorConta());
		
	}

}
