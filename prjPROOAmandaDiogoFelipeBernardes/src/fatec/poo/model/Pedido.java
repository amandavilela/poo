package fatec.poo.model;

import java.util.ArrayList;

public class Pedido {
    private int numero;
    private String dataEmissaoPedido;
    private String dataPagto;
    private boolean status;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itens;
    
    public Pedido(int numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissaoPedido = dataEmissao;
        this.status = true;
        itens = new ArrayList<ItemPedido>();
    }

    public int getNumero() {
        return numero;
    }

    public String getDataEmissaoPedido() {
        return dataEmissaoPedido;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean isStatus() {
        return status;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
        this.status = false;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void addItem(ItemPedido itemPedido){
        itens.add(itemPedido);
        itemPedido.setPedido(this);
    }
     
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
    
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    
    
}
