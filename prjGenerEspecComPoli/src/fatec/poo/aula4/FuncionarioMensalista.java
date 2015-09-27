package fatec.poo.aula4;

public class FuncionarioMensalista extends Funcionario {
    private double numSalMinimo;
    private double valSalMinimo;
    
    public FuncionarioMensalista(int registro, String nome, String dataAdmissao, double valSalMinimo) {
        super(registro, nome, dataAdmissao);
        this.valSalMinimo = valSalMinimo;
    }

    @Override
    public double calcSalBruto() {
        return(numSalMinimo * valSalMinimo);
    }

    public double getNumSalMinimo() {
        return numSalMinimo;
    }

    public double getValSalMinimo() {
        return valSalMinimo;
    }

    public void setNumSalMinimo(double numSalMinimo) {
        this.numSalMinimo = numSalMinimo;
    }
    
}
