package fatec.poo.model;

public class Vendedor extends Pessoa{
    
    private double salarioBase;
    private double comissao;
    
    public Vendedor(String cpf, String nome){
        
        super(cpf,nome);
        
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
     
}
