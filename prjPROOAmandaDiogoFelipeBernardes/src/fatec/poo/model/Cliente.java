package fatec.poo.model;

public class Cliente extends Pessoa{
    
    private double limiteCred;
    private double limiteDisp;
    
    public Cliente(String cpf, String nome, double limiteCred, double limiteDisp){
        
        super(cpf,nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteDisp;
        
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
    
}
