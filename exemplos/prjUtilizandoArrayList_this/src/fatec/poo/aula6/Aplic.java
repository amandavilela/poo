package fatec.poo.aula6;


public class Aplic {
    public static void main(String[] args) {              
        FuncionarioHorista funchor = 
                new FuncionarioHorista(1010,
                                       "Pedro Silveira",
                                       "12/11/1999",
                                        15.50);
        FuncionarioMensalista funcmen = 
                new FuncionarioMensalista(2020,
                                          "Ana Beatriz",
                                          "15/08/2006",
                                          2.5);
        
        FuncionarioComissionado funcom = 
                new FuncionarioComissionado(3030,
                                       "Carlos Souza",
                                       "17/07/2013",
                                        5);
        
               
        Projeto prj1 = new Projeto("Prj01",
                                   "Seguranca no Trabalho",
                                   "26/10/2015");   
        
        Departamento dep1 = new Departamento("TI",
                                             "Tec. Informação");
        
        Departamento dep2 = new Departamento("VD", "Vendas");
        
        
        
        funchor.setCargo("Programador");
        funcmen.setCargo("Aux. Administrativo");
        funcom.setCargo("Agente de Vendas");
        
        prj1.setDataTermino("27/11/2015");
        
        //estabelecendo a associação binária entre um (1)
        //objeto da classe FuncionarioHorista com um (1)
        //objeto da classe Projeto
        funchor.setProjeto(prj1);
        System.out.println("O funcionario " + funchor.getNome() +
                           " trabalha no projeto " +
                           funchor.getProjeto().getDescricao());
        
         //estabelecendo a associação binária entre um (1)
        //objeto da classe FuncionarioMensalista com um (1)
        //objeto da classe Projeto
        funcmen.setProjeto(prj1);
        System.out.println("O funcionario " + funcmen.getNome() +
                           " trabalha no projeto " +
                           funcmen.getProjeto().getDescricao());
        
         //estabelecendo a associação binária entre um (1)
        //objeto da classe FuncionarioComissionado com um (1)
        //objeto da classe Projeto
        funcom.setProjeto(prj1);
        System.out.println("O funcionario " + funcom.getNome() +
                           " trabalha no projeto " +
                           funcom.getProjeto().getDescricao());
        
        
        
        //estabelecendo a associação binária entre um (1)
        //objeto da classe FuncionarioHorista com um (1)
        //objeto da classe Departamento
        funchor.setDepartamento(dep1);
        System.out.println("\n\nO funcionario " + funchor.getNome() +
                           " trabalha no departamento " +
                           funchor.getDepartamento().getDescricao());
    
        //estabelecendo a associação binária entre um (1)
        //objeto da classe FuncionarioMensalista com um (1)
        //objeto da classe Departamento
        funcmen.setDepartamento(dep1);
        System.out.println("O funcionario " + funcmen.getNome() +
                           " trabalha no departamento " +
                           funcmen.getDepartamento().getDescricao());
           
       //estabelecendo a associação binária entre um (1)
        //objeto da classe FuncionarioComissionado com um (1)
        //objeto da classe Departamento
        funcom.setDepartamento(dep2);
        System.out.println("O funcionario " + funcom.getNome() +
                           " trabalha no departamento " +
                           funcom.getDepartamento().getDescricao());
        
        
        //estabelecendo a associação binária entre um (1)
        //objeto da classe Departamento com objetos das
        //classes Horista, Mensalista e Comissionado
        dep1.addFuncionario(funchor);
        dep1.addFuncionario(funcmen);
        dep2.addFuncionario(funcom);
        
        dep1.listar();
        dep2.listar();
        
        //estabelecendo a associação binária entre um (1)
        //objeto da classe Projeto com objetos das
        //classes Horista, Mensalista e Comissionado
        prj1.addFuncionario(funchor);
        prj1.addFuncionario(funcmen);
        prj1.addFuncionario(funcom);
        
        prj1.listar();
        
    }    
    
}