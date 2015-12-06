package fatec.poo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.ItemPedido;

public class DaoItemPedido {
    private Connection conn;
    
    public DaoItemPedido(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir (ItemPedido itemPedido){
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("INSERT INTO itemPedido_poo (numeroItem, qtdeVendida) values(?, ?)");
            ps.setString(1, Integer.toString(itemPedido.getNumeroItem()) );
            ps.setString(2, Integer.toString(itemPedido.getQuantidade()) );
            
            
            ps.execute();
        
        
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
        
    }
    
     public void alterar (ItemPedido itemPedido) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("UPDATE itemPedido_poo set numeroItem = ?, qtdeVendida = ? WHERE numeroItem = ?");
            ps.setString(1, Integer.toString(itemPedido.getNumeroItem()) );
            ps.setString(2, Integer.toString(itemPedido.getQuantidade()) );
            ps.setString(1, Integer.toString(itemPedido.getNumeroItem()) );
                    
            ps.execute();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
     public void excluir(ItemPedido itemPedido) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("DELETE FROM itemPedido_poo where numeroItem = ?");            
            ps.setString(1, Integer.toString(itemPedido.getNumeroItem()) );          
            ps.execute();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
     
}
     
}