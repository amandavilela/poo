
package fatec.poo.aula6;

import java.util.ArrayList;
import java.util.HashSet;

public class Projeto {
    private String Sigla;
    private String Descricao;   
    private String DataInicio;
    private String DataTermino;	
    private ArrayList<Funcionario> funcionarios;

    public Projeto(String Sigla, String Descricao, String DataInicio) {
        this.Sigla = Sigla;
        this.Descricao = Descricao;
        this.DataInicio = DataInicio;
        funcionarios = new ArrayList<Funcionario>();
    }

    public void setDataTermino(String DataTermino){
	this.DataTermino = DataTermino;
    }
   
   public String getSigla() {
        return Sigla;
    }

    public String getDescricao() {
        return Descricao;
    }
    
    public String getDataTermino(){
	return(DataTermino);
    }
    
    public String getDataInicio(){
        return(DataInicio);
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios.add(f);
        f.setProjeto(this);
    }
    
    public void listar(){
        System.out.println("\n\nSigla: " + Sigla);
        System.out.println("Descricao: " + Descricao);
        System.out.println("Data Inicio:  " + DataInicio);
        System.out.println("Data Termino: " + DataTermino);
        System.out.println("Qtde. Func: " + funcionarios.size());
        System.out.println("\nRegistro   Nome    Departamento   Categoria");
        
        for (int i=0; i < funcionarios.size(); i++){
            System.out.print(funcionarios.get(i).getRegistro() + "   ");
            System.out.print(funcionarios.get(i).getNome() + "     ");
            System.out.print(funcionarios.get(i).getDepartamento().getDescricao() + "     ");
            
            if (funcionarios.get(i) instanceof FuncionarioHorista)
                System.out.println("Horista");
            else
              if (funcionarios.get(i) instanceof FuncionarioMensalista)
                  System.out.println("Mensalista");
              else
                if (funcionarios.get(i) instanceof FuncionarioComissionado)
                   System.out.println("Comissionado");            
        }
        
    }
}    
