package quartoHotel;

public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao;
    private double totalFaturado;
    
    public QuartoHotel(int n, double v) {
        numQuarto = n;
        valorDiaria = v;
        situacao = false;
    }
    
    public void reservar(int rg) {
        numRG = rg;
        situacao = true; //ocupado
    }

    public double liberar(int d) {
        double valor = valorDiaria*d;
        totalFaturado += valor;
        numRG = 0;
        situacao = false;
        return valor;
    }
    
    public double getNumQuarto() {
        return numQuarto;
    }
    
    public boolean getSituacao() {
        return situacao;
    }
    
    public double getTotalFaturado() {
        return totalFaturado;
    }
    
}
