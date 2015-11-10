package fatec.poo.model;

import java.util.ArrayList;

public class ItemPedido {
    private int numeroItem;
    private int quantidade;
    private Produto produto;
    private Pedido pedido;
    
    public ItemPedido(int numeroItem, int qtdeVendida) {
        this.numeroItem = numeroItem;
        this.quantidade = quantidade;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int qtdeVendida) {
        this.quantidade = qtdeVendida;
    }
 
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }
    
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
