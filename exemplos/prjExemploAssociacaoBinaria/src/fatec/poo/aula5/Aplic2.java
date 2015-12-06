package fatec.poo.aula5;

public class Aplic2 {
    public static void main(String[] args) {              
        
        FuncionarioHorista funchor =  new FuncionarioHorista(1010, "Pedro Silveira", "12/11/1999", 15.50);
        FuncionarioMensalista funcmen =  new FuncionarioMensalista(2020, "Ana Beatriz", "15/08/2006", 2.5);
        FuncionarioComissionado funcom = new FuncionarioComissionado(3030, "Carlos Souza", "17/07/2013", 5);
        
        Departamento dep1 = new Departamento("TI", "Tec. Inf.");
        Departamento dep2 = new Departamento("VD", "Vendas");
        
        Projeto prj1 = new Projeto("ABC", "Projeto para alfabetizar o Marcelo", "22/10/2015");
        
        prj1.setDataTermino("23/10/2015");
        
        //estabelecendo a associação binária entre um objeto da classe funcionário horista c/ um objeto da classe departamento.
        funchor.setDepartamento(dep1);
        funcmen.setDepartamento(dep1);
        funcom.setDepartamento(dep2);

        funchor.setCargo("Desenvolvedor");
        funcmen.setCargo("Vendedor");
        funcom.setCargo("Usuário de Frameworks");

        funchor.setProjeto(prj1);
        funcmen.setProjeto(prj1);
        funcom.setProjeto(prj1);
        
        //estabelecendo  a associação binária entre um (1) objeto da classe
        //classe departamento com 1 ou mais (1..*) objetos da classe funcionario
        //manjamo
        //FuncionarioHorista, FuncionarioMensalista, FuncionarioComissionado
        dep1.addFuncionario(funchor);
        dep1.addFuncionario(funcmen);
        dep2.addFuncionario(funcom);
        
        
        prj1.listarProjeto();
              
    }    
}