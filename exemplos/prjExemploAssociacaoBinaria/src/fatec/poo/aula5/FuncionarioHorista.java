
package fatec.poo.aula5;

public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private double qtdeHorTrab;
    
    public FuncionarioHorista(int registro, 
                              String nome, 
                              String dataAdmisao,
                              double valHorTrab) {
        super(registro, nome, dataAdmisao);
        this.valHorTrab = valHorTrab;
    }

    public double getValHorTrab() {
        return valHorTrab;
    }

    public double getQtdeHorTrab() {
        return qtdeHorTrab;
    }

    public void setQtdeHorTrab(double qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }

    
    @Override
    public double calcSalBruto() {
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao(){
        return (0.075 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
    
}
