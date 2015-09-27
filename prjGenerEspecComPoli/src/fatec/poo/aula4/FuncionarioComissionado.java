package fatec.poo.aula4;

public class FuncionarioComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado(int registro, String nome, String dataAdmissao, double taxaComissao) {
        super(registro, nome, dataAdmissao);
        this.taxaComissao = taxaComissao;
    }

    public double getSalBase() {
        return salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }
    
    public void setTotalVendas(double salBase) {
        this.totalVendas = 0;
    }
    
    public void addVendas(double valorVenda) {
        this.totalVendas += valorVenda;
    }
    
    public double calcGratificacao() {
        
        double gratificacao;
        
        if (this.totalVendas <= 5000){
            gratificacao = 0;
        }else if (this.totalVendas > 5000 && this.totalVendas <= 10000){
            gratificacao = 0.035;
        } else {
            gratificacao = 0.05;
        }
        return(gratificacao * calcSalBruto());
    }
    
    @Override
    public double calcSalLiquido() {
        return (super.calcSalLiquido()+calcGratificacao());
    }    
    
    @Override
    public double calcSalBruto() {
        return(getSalBase()+getTaxaComissao()*this.totalVendas);
    }
}
