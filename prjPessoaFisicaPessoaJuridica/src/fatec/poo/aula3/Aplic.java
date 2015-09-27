package fatec.poo.aula3;

public class Aplic {
    public static void main(String[] args) {
        
        //instanciação de um objeto da classe Pessoa
        Pessoa objPessoa = new Pessoa("Ana Beatriz","22/09/1990");
        objPessoa.setEmail("anabeatriz@gmail.com");
        System.out.println("Nome: " + objPessoa.getNome());
        System.out.println("Data Nascimento: " + objPessoa.getDataNasc());
        System.out.println("E-mail: " + objPessoa.getEmail());
        
        //instanciação de um objeto da classe Aluno
        Aluno objAluno = new Aluno(1010, "Pedro Oliveira", "09/02/2008","Ensino Médio", "01/02/2015");
        objAluno.setEmail("pedroloko13@gmail.com");
        System.out.println("\n\nRA: " + objAluno.getRa());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data de Nascimento: " + objAluno.getDataNasc());
        System.out.println("Email: " + objAluno.getEmail());
        System.out.println("Escolaridade: " + objAluno.getEscolaridade());
        System.out.println("Data de matricula: " + objAluno.getDataMatricula());
        
        //instanciação de um objeto da classe Professor
        Professor objProfessor = new Professor(22040, "Carla Souza", "13/04/1978", "08/08/2005");
        objProfessor.setEmail("karlinha_bandida@hotmail.com");
        objProfessor.setTitularidade("Doutora");
        System.out.println("Registro Funcional: " + objProfessor.getRegFunc());
        System.out.println("Nome: " + objProfessor.getNome());
        System.out.println("Data de Nascimento: " + objProfessor.getDataNasc());
        System.out.println("Email: " + objProfessor.getEmail());
        System.out.println("Titularidade: " + objProfessor.getTitularidade());
        System.out.println("Data de admissão: " + objProfessor.getDataAdmissao());
                
        
    }    
}
