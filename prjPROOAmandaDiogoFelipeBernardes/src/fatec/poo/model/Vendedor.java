package fatec.poo.model;

import java.util.ArrayList;

public class Vendedor extends Pessoa{
    
    private double salarioBase;
    private double comissao;
    private ArrayList<Pedido> pedidos;
    
    public Vendedor(String cpf, String nome){
        super(cpf,nome);
        pedidos = new ArrayList<Pedido>();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
     
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
        pedido.setVendedor(this);
    }
    
}
