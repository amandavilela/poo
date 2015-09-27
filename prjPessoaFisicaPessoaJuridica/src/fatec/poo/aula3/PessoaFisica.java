package fatec.poo.aula3;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private double base;
    
    public PessoaFisica(String cpf, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cpf = cpf;
    }

    @Override
    public double calcBonus(int anoAtual) {
        double bonus = 0;
        if (super.totalCompras >= 12000) {
            bonus = (super.anoInscricao - anoAtual)*base;
        }
        return bonus;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public String getCpf() {
        return cpf;
    }

    public double getBase() {
        return base;
    }
    
    
}
