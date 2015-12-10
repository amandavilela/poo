package fatec.poo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Vendedor;

public class DaoVendedor {

    private Connection conn;
    
    public DaoVendedor(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir (Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO vendedor_poo(cpf, nome, endereco, cidade, cep, uf, ddd, telefone, salBase, comissao) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getCidade());
            ps.setString(5, vendedor.getCep());
            ps.setString(6, vendedor.getUf());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
            ps.setDouble(9, vendedor.getSalarioBase());
            ps.setDouble(10, vendedor.getComissao());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar (Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE vendedor_poo set nome = ?, endereco = ?, cidade = ?, cep = ?, uf = ?, ddd = ?, telefone = ?, salBase = ?, comissao = ? where cpf = ?");
            
            ps.setString(1, vendedor.getNome());
            ps.setString(2, vendedor.getEndereco());
            ps.setString(3, vendedor.getCidade());
            ps.setString(4, vendedor.getCep());
            ps.setString(5, vendedor.getUf());
            ps.setString(6, vendedor.getDdd());
            ps.setString(7, vendedor.getTelefone());
            ps.setDouble(8, vendedor.getSalarioBase());
            ps.setDouble(9, vendedor.getComissao());
            ps.setString(10, vendedor.getCpf());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public Vendedor consultar (String cpf) {
        Vendedor v = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from vendedor_poo where cpf = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true) {
                v = new Vendedor (cpf, rs.getString("nome"), Double.parseDouble(rs.getString("salBase")) );
                v.setCpf(rs.getString("cpf"));
                v.setNome(rs.getString("nome"));
                v.setEndereco(rs.getString("endereco"));
                v.setCidade(rs.getString("cidade"));
                v.setUf(rs.getString("uf"));
                v.setCep(rs.getString("cep"));
                v.setDdd(rs.getString("ddd"));
                v.setTelefone(rs.getString("telefone"));
                v.setSalarioBase(Double.parseDouble(rs.getString("salbase")) );
                v.setComissao(Double.parseDouble(rs.getString("comissao")));
                
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());             
        }
        return (v);
    }    
     
     public void excluir(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM vendedor_poo where cpf = ?");
            
            ps.setString(1, vendedor.getCpf());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}