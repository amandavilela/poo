package fatec.poo.aula6;

public class FuncionarioComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado(int registro, 
                                   String nome, 
                                   String dataAdmissao, 
                                   double taxaComissao) {
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
    
    public void addVendas(double valorVenda) {
        totalVendas += valorVenda;
    }
    
    public double calcGratificacao() {
        
        double gratificacao;
        
        if (totalVendas <= 5000){
            gratificacao = 0;
        }else if (totalVendas > 5000 && totalVendas <= 10000){
            gratificacao = 0.035;
        } else {
            gratificacao = 0.05;
        }
        return(gratificacao * calcSalBruto());
    }
    
    public double calcSalLiquido() {
        return (super.calcSalLiquido()+calcGratificacao());
    }    
    
    @Override
    public double calcSalBruto() {
        return(salBase+taxaComissao/100*totalVendas);
    }
}
