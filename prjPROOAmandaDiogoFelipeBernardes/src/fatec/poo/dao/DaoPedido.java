package fatec.poo.dao;

import fatec.poo.model.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Pedido;
import fatec.poo.model.Vendedor;

public class DaoPedido {
    private Connection conn;
    private Cliente cpfcliente;
    private Vendedor cpfvendedor;

    public DaoPedido(Connection conn) {
        this.conn = conn;
    }
    
    public Pedido consultar (String numero) {
        Pedido p = null;
        
        DaoCliente daoCliente = null;
        DaoVendedor daoVendedor = null;
        
        daoCliente = new DaoCliente(conn);
        daoVendedor = new DaoVendedor(conn);
       
        PreparedStatement ps = null;     
        
        try {
            ps = conn.prepareStatement("SELECT * from pedidos_poo where numero = ?");
            ps.setString(1, numero);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true) {
                
                //System.out.println("cliente"+daoCliente.consultar(rs.getObject("cpfcliente").toString()));
                //System.out.println("vendedor"+daoVendedor.consultar(rs.getObject("cpfvendedor").toString()));
                
                String cpfcliente = rs.getString("cpfcliente").toString();
                String cpfvendedor = rs.getString("cpfvendedor").toString();
                
                Cliente c = daoCliente.consultar(cpfcliente);
                Vendedor v = daoVendedor.consultar(cpfvendedor);
                
                //Cliente cliente = daoCliente.consultar(rs.getString("cpf"));
                //Vendedor vendedor = daoVendedor.consultar(rs.getString("cpf"));
                
                p = new Pedido (Integer.parseInt(numero), rs.getString("dataemissaopedido"));
                p.setDataPagto(rs.getString("datapagto"));
                p.setStatus(Boolean.parseBoolean(rs.getString("status")));
                p.setVendedor(v);
                p.setCliente(c);
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());             
        }
        return p;
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

    
    
    
    
    
    
    


