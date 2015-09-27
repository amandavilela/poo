package fatec.poo.aula3;

public class Aplic1 {

    public static void main(String[] args) {
        Pessoa[] cadastro = new Pessoa[3];
        
        cadastro[0] = new Aluno(101, "carlos silva", "14/09/2000", "Ensino Médio", "17/04/2015");
        cadastro[1] = new Aluno(1010, "Pedro Oliveira", "09/02/2008","Ensino Médio", "01/02/2015");
        cadastro[2] = new Professor(22040, "Carla Souza", "13/04/1978", "08/08/2005");

        cadastro[0].setEmail("pedroloko13@gmail.com");
        System.out.println("Nome: " + cadastro[0].getNome());
        System.out.println("Data Nascimento: " + cadastro[0].getDataNasc());
        System.out.println("E-mail: " + cadastro[0].getEmail());
        
        cadastro[1].setEmail("amanda_hard_rock@gmail.com");
        System.out.println("Ra: " + ((Aluno)cadastro[1]).getRa());
        System.out.println("Nome: " + cadastro[1].getNome());
        System.out.println("Data Nascimento: " + cadastro[1].getDataNasc());
        System.out.println("E-mail: " + cadastro[1].getEmail());
        System.out.println("Escolaridade: " + ((Aluno)cadastro[1]).getEscolaridade());
        
        cadastro[2].setEmail("mc_marcelo@msn.com");
        System.out.println("Registro Funcional: " + ((Professor)cadastro[2]).getRegFunc());
        System.out.println("Nome: " + cadastro[2].getNome());
        System.out.println("Data Nascimento: " + cadastro[2].getDataNasc());
        System.out.println("E-mail: " + cadastro[2].getEmail());
        System.out.println("Titularidade: " + ((Professor)cadastro[1]).getTitularidade());
    
    }
    
}
