package fatec.poo.aula3;

public class PessoaJuridica extends Pessoa{
    
    private String cgc;
    private double taxaIncentivo;
    
    public PessoaJuridica(String nome, int anoInscricao, String cgc){
        super(nome, anoInscricao);
        this.cgc = cgc;
    }

    public String getCgc() {
        return cgc;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }

    public void setTaxaIncentivo(double taxaIncentivo) {
        this.taxaIncentivo = taxaIncentivo;
    }
    
    @Override
    public double calcBonus(int anoAtual){
        return ((taxaIncentivo*super.totalCompras)*(anoAtual-super.anoInscricao));
    }
    
}
