package fatec.poo.aula3;

public abstract class Pessoa {
    
    private String nome;
    int anoInscricao;
    double totalCompras;
    
    public Pessoa(String nome, int anoInscricao){
        this.nome = nome;
        this.anoInscricao = anoInscricao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
    abstract public double calcBonus(int anoAtual);
    
    public void addCompras(double vlrCompra) {
        this.totalCompras += vlrCompra;
    }

}    
 
