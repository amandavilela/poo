package fatec.poo.aula5;

public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dataAdmissao;
    private String cargo;
    private Projeto projeto; //ponteiro pro projeto referente
    private Departamento departamento; //ponteiro pra armazenamento de um objeto da classe Departamento

    public Funcionario(int registro, 
                       String nome, 
                       String dataAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public Projeto getProjeto() {
        return projeto;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    //definição do método abstrato
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }

    public Departamento getDepartamento() {
        return departamento;
    }
                               //endereço de
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }    
    
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    
}
