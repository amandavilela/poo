package fatec.poo.model;

import java.util.ArrayList;

public class ItemPedido {
    private int numeroItem;
    private int qtdeVendida;
    private Produto produto;
    private Pedido pedido;
    
    public ItemPedido(int numeroItem, int qtdeVendida) {
        this.numeroItem = numeroItem;
        this.qtdeVendida = qtdeVendida;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public int getQtdeVendida() {
        return qtdeVendida;
    }

    public void setQtdeVendida(int qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }
 
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
