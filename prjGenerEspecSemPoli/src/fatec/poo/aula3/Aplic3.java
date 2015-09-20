package fatec.poo.aula3;

import java.util.Scanner;

public class Aplic3 {

    public static void main(String[] args) {    
    
        int opcao;
        String nome;
        int ra;
        int rf;
        String email;
        String escolaridade;
        String dtMatricula;
        String dtNascimento;
        String titularidade;
        String dtAdmissao;
        
        Pessoa[] cadastro = new Pessoa[10];
        
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("\n\nEscolha uma opcao: ");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Cadastrar Professor");
        System.out.println("3 - Listar Alunos");
        System.out.println("4 - Listar Professores");
        System.out.println("5 - Encerrar");
        opcao = Entrada.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("\nDigite o nome do aluno: ");
                nome = Entrada.next();
                System.out.println("\nDigi1te o RA: ");
                ra = Entrada.nextInt();
                System.out.println("\nDigite o email: ");
                email = Entrada.next();
                System.out.println("\nDigite a escolaridade: ");
                escolaridade = Entrada.next();
                System.out.println("\nDigite a data da matricula: ");
                dtMatricula = Entrada.next();
                System.out.println("\nDigite a data de nascimento: ");
                dtNascimento = Entrada.next();
                cadastro[cadastro.length] = new Aluno(ra,nome,dtNascimento,escolaridade,dtMatricula);
                break;
            case 2:
                System.out.println("\nDigite o nome do professor: ");
                nome = Entrada.next();
                System.out.println("\nDigite o Registro Funcional: ");
                rf = Entrada.nextInt();
                System.out.println("\nDigite o email: ");
                email = Entrada.next();
                System.out.println("\nDigite a titularidade: ");
                titularidade = Entrada.next();
                System.out.println("\nDigite a data de admissao: ");
                dtAdmissao = Entrada.next();
                System.out.println("\nDigite a data de nascimento: ");
                dtNascimento = Entrada.next();
                cadastro[cadastro.length] = new Professor(rf,nome,dtNascimento,dtAdmissao);
                break;
            case 3:
                for(int i=0; i<= cadastro.length;i++){
                    if(cadastro[i] instanceof Aluno){
                        System.out.println("\nAluno\n");
                        System.out.println("Ra: " + ((Aluno)cadastro[i]).getRa());
                        System.out.println("Escolaridade: " + ((Aluno)cadastro[i]).getEscolaridade());
                    }
                    System.out.println("Nome: " + cadastro[i].getNome());
                    System.out.println("Data Nascimento: " + cadastro[i].getDataNasc());
                    System.out.println("E-mail: " + cadastro[i].getEmail());
                    }
                break;
            case 4:
                for(int i=0; i<= cadastro.length;i++){
                    if(cadastro[i] instanceof Professor){
                        System.out.println("\nProfessor\n");
                        System.out.println("Registro Funcional: " + ((Professor)cadastro[2]).getRegFunc());
                        System.out.println("Titularidade: " + ((Professor)cadastro[i]).getTitularidade());
                    }
                    System.out.println("Nome: " + cadastro[i].getNome());
                    System.out.println("Data Nascimento: " + cadastro[i].getDataNasc());
                    System.out.println("E-mail: " + cadastro[i].getEmail());
                }
                break;
            case 5:
                break;
            default:
                System.out.println("\nEscolha uma opcao valida.\n");
         }
    }
    
}
