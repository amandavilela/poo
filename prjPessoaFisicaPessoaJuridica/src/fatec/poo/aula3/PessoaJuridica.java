package fatec.poo.aula3;

public class PessoaJuridica extends Pessoa{
    
    private String cgc;
    private double taxaIncentivo;
    
    public PessoaJuridica(String nome, int anoInscricao, String cgc, double taxaIncentivo){
        super(nome, anoInscricao);
        this.cgc = cgc;
        this.taxaIncentivo = taxaIncentivo;
    }
    
}
