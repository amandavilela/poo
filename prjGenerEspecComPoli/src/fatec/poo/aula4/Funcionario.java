package fatec.poo.aula4;

public abstract class Funcionario {
    
    private int registro;
    private String nome;
    private String dataAdmissao;
    private String cargo;

    public Funcionario(int registro, String nome, String dataAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public String getCargo(){
        return cargo;
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
    
    //definicao do meto abstrato
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.1*calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto()-calcDesconto());
    }
    
}
