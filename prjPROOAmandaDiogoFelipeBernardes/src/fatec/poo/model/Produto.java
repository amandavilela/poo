package fatec.poo.model;

public class Produto {
    private int codigo;
    private String descricao;
    private int qtdeDisponivel;
    private double precoUnit;
    private int estoqueMin;
    
    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setQtdeDisponivel(int qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }
    
    
}
