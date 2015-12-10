package fatec.poo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Produto;

public class DaoProduto {
    
    private Connection conn;
    
    public DaoProduto(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir (Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO produto_poo(codigo, descricao, qtdeDisponivel, precoUnit, estoqueMin) VALUES(?,?,?,?,?)");
            ps.setInt(1, produto.getCodigo());
            ps.setString(2, produto.getDescricao());
            ps.setInt(3, produto.getQtdeDisponivel());
            ps.setDouble(4, produto.getPrecoUnit());
            ps.setInt(5, produto.getEstoqueMin());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar (Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE produto_poo set descricao = ?, "
                    + "                                     qtdedisponivel = ?, "
                    + "                                     precounit = ?, "
                    + "                                     estoquemin = ?");
            
            ps.setString(1, produto.getDescricao());
            ps.setInt(2, produto.getQtdeDisponivel());
            ps.setDouble(3, produto.getPrecoUnit());
            ps.setInt(4, produto.getEstoqueMin());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public Produto consultar (int codigo) {
        Produto p = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from produto_poo where codigo = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true) {
                p = new Produto (codigo, rs.getString("descricao"));
                p.setQtdeDisponivel(rs.getInt("qtdedisponivel"));
                p.setPrecoUnit(rs.getDouble("precounit"));
                p.setEstoqueMin(rs.getInt("estoquemin"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());             
        }
        return (p);
    }    
     
     public void excluir(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM produto_poo where codigo = ?");
            
            ps.setInt(1, produto.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
}
