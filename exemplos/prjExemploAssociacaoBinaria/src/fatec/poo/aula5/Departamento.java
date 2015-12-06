package fatec.poo.aula5;

public class Departamento {
    private String sigla;
    private String descricao;
    private Funcionario[] funcionarios;
    private int qtdeFunc;
    
    public Departamento(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
        funcionarios = new Funcionario[5];
        qtdeFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void addFuncionario(Funcionario f) {
        funcionarios[qtdeFunc] = f;
        qtdeFunc++;
    }
    
    public void listarFuncionarios(){
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade de Funcionários: " + qtdeFunc);
        
        System.out.println("Registro        Nome        Cargo");
        for (int x = 0; x < qtdeFunc; x++) {
            System.out.print(funcionarios[x].getRegistro() + "     ");
            System.out.print(funcionarios[x].getNome() + "     ");
            System.out.println(funcionarios[x].getCargo());
        }
    }
}