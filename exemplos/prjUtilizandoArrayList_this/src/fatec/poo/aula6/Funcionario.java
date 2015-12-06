package fatec.poo.aula6;

public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dataAdmissao;
    private String cargo;
    private Projeto projeto;
    private Departamento departamento;
        

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

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}
