package fatec.poo.aula6;

import java.util.ArrayList;

public class Departamento {
      private String sigla;
      private String descricao;
      private ArrayList<Funcionario> funcionarios;
      
      private int qtdeFunc;

    public Departamento(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
        funcionarios = new ArrayList<Funcionario>();
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }
      
    public void addFuncionario(Funcionario f){
        funcionarios.add(f);
        f.setDepartamento(this);
    }
    
    public void listar(){
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Descricao: " + descricao);        
        System.out.println("Qtde. Funcionarios: " + funcionarios.size());
        System.out.println("Registro      Nome         Cargo");
         
        for (int x=0; x <  funcionarios.size(); x++){
             System.out.print(funcionarios.get(x).getRegistro() + "   ");
             System.out.print(funcionarios.get(x).getNome() + "     ");
             System.out.println(funcionarios.get(x).getCargo());
        }
    }
      
}
