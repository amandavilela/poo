package fatec.poo.aula1;

import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        
        System.out.println("Digite a nota da primeira prova: ");
        objAluno.setNtPrv1(Entrada.nextDouble());
        
        System.out.println("Digite a nota da segunda prova: ");
        objAluno.setNtPrv2(Entrada.nextDouble());
        
        System.out.println("Digite a nota do primeiro trabalho: ");
        objAluno.setNtTrab1(Entrada.nextDouble());
        
        System.out.println("Digite a nota do segundo trabalho: ");
        objAluno.setNtTrab2(Entrada.nextDouble());
        
        objAluno.calcMediaProva();
        objAluno.calcMediaTrab();
        
        System.out.println("Media final: " + objAluno.calcMediaFinal());
        
        if(objAluno.isAprovado()==true){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        
    }
    
}
