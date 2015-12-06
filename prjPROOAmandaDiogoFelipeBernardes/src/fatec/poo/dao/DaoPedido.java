package fatec.poo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Pedido;

public class DaoPedido {
    private Connection conn;

    public DaoPedido(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir (Pedido pedido) {
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("INSERT INTO pedidos_poo(numero, dataEmissaoPedido, dataPagto, status)VALUES(?,?,?,?)");
            ps.setString(1, Integer.toString(pedido.getNumero()));
            ps.setString(2, pedido.getDataEmissaoPedido());
            ps.setString(3, pedido.getDataPagto());
            ps.setString(4, Boolean.toString(pedido.isStatus()));
           
            ps.execute();
            
        }catch (SQLException ex) {
             System.out.println(ex.toString());
        }
    }
        
        public void alterar(Pedido pedido){
         PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("UPDATE pedidos_poo set numero=?, dataEmissaoPedido=?, dataPagto=?, status=? WHERE numero = ?" );
            ps.setString(1, Integer.toString(pedido.getNumero()));
            ps.setString(2, pedido.getDataEmissaoPedido());
            ps.setString(3, pedido.getDataPagto());
            ps.setString(4, Boolean.toString(pedido.isStatus()));
            ps.setString(5, Integer.toString(pedido.getNumero()));
            
            ps.execute();
            
            }catch (SQLException ex) {
               System.out.println(ex.toString());
            }
        
        }
        
        public void excluir(Pedido pedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM pedidos_poo where numero = ?");
            
           ps.setString(1, Integer.toString(pedido.getNumero()));
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
}
        
}

    
    
    
    
    
    
    


