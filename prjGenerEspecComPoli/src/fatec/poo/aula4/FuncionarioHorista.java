package fatec.poo.aula4;

public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private double qtdeHorTrab;
    
    public FuncionarioHorista(int registro, String nome, String dataAdmissao, double valHorTrab) {
        super(registro, nome, dataAdmissao);
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHorTrab(double qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }

    public double getValHorTrab() {
        return valHorTrab;
    }

    public double getQtdeHorTrab() {
        return qtdeHorTrab;
    }
    
    @Override
    public double calcSalBruto() {
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcSalLiquido() {
        return(super.calcSalLiquido()+calcGratificacao());
    }
    
    public double calcGratificacao(){
        return(calcSalBruto()*0.075);
    }
    
}
