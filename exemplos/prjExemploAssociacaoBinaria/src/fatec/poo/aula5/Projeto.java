package fatec.poo.aula5;

public class Projeto {
    
    private String sigla;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private Funcionario[] funcionarios;
    private int qtdeFunc;

    
    public Projeto(String sigla, String descricao, String data) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.dataInicio = data;
        this.funcionarios = new Funcionario[5];
        this.qtdeFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }
    
    public void addFuncionario(Funcionario f) {
        funcionarios[qtdeFunc] = f;
        qtdeFunc++;
    }    
    
    public void listarProjeto() {
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de Inicio: " + dataInicio);
        System.out.println("Data de Término: " + dataTermino);
        System.out.println("Quantidade de Funcionários: " + qtdeFunc);
        
        System.out.println("Registro           Nome           Departamento           Tipo");
        for (int x = 0; x < qtdeFunc; x++) {
            System.out.print(funcionarios[x].getRegistro() + "     ");
            System.out.print(funcionarios[x].getNome() + "     ");
            System.out.println(funcionarios[x].getDepartamento());
            
            if(funcionarios[x] instanceof FuncionarioHorista)
                System.out.println("Horista");
            else
                if (funcionarios[x] instanceof FuncionarioMensalista)
                    System.out.println("Mensalista");
                    else
                        if (funcionarios[x] instanceof FuncionarioComissionado)
                            System.out.println("Comissionado");
            
            }
    }
}
