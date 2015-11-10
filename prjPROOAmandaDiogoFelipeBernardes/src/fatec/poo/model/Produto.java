package fatec.poo.model;

public class Produto {
    private int codigo;
    private String descricao;
    private static int qtdeDisponivel;
    private double precoUnit;
    private int estoqueMin;
    private ItemPedido itemPedido;
    
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

    public static void setQtdeDisponivel(int qtdeVendida) {
        Produto.qtdeDisponivel -= qtdeVendida;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }
    
    public void setItemPedido(ItemPedido itemPedido) {
        this.itemPedido = itemPedido;
    }
}
