package fatec.poo.aula6;

public class FuncionarioMensalista extends Funcionario{
    private double valSalMin;
    private double numSalMin;

    public FuncionarioMensalista(int regFunc,
                                 String nome, 
                                 String dataAdmissao,
                                 double numSalMin) {
        super(regFunc, nome, dataAdmissao);
        this.numSalMin = numSalMin;
    }

    public void setValSalMin(double valSalMin) {
        this.valSalMin = valSalMin;
    }

    public double getValSalMin() {
        return valSalMin;
    }

    public double getNumSalMin() {
        return numSalMin;
    }

    
    @Override
    public double calcSalBruto() {
        return(numSalMin * valSalMin);
    }
    
    
}
