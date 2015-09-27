package fatec.poo.aula3;

public class Aplic2 {

    public static void main(String[] args) {
        
        Pessoa[] cadastro = new Pessoa[3];
        
        cadastro[0] = new Aluno(101, "carlos silva", "14/09/2000", "Ensino Médio", "17/04/2015");
        cadastro[1] = new Aluno(1010, "Pedro Oliveira", "09/02/2008","Ensino Médio", "01/02/2015");
        cadastro[2] = new Professor(22040, "Carla Souza", "13/04/1978", "08/08/2005");
        
        cadastro[0].setEmail("pedroloko13@gmail.com");
        cadastro[1].setEmail("amanda_hard_rock@gmail.com");
        cadastro[2].setEmail("mc_marcelo@msn.com");
        
        for(int i=0; i<= cadastro.length;i++){
            
            if(cadastro[i] instanceof Aluno){
                System.out.println("\nAluno\n");
                System.out.println("Ra: " + ((Aluno)cadastro[i]).getRa());
                System.out.println("Escolaridade: " + ((Aluno)cadastro[i]).getEscolaridade());
            }else{
                System.out.println("\nProfessor\n");
                System.out.println("Registro Funcional: " + ((Professor)cadastro[2]).getRegFunc());
                System.out.println("Titularidade: " + ((Professor)cadastro[i]).getTitularidade());
            }
            
            System.out.println("Nome: " + cadastro[i].getNome());
            System.out.println("Data Nascimento: " + cadastro[i].getDataNasc());
            System.out.println("E-mail: " + cadastro[i].getEmail());
        }
    
    }
    
}
