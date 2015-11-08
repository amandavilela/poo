package fatec.poo.model;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    
    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedidos;
    
    public Cliente(String cpf, String nome, double limiteCred, double limiteDisp){
        
        super(cpf,nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteDisp;
        pedidos = new ArrayList<Pedido>();
        
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
    
     public void addPedido(Pedido p){
        pedidos.add(p);
    }
     
}
