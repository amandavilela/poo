package fatec.poo.view;

public class GuiMenu extends javax.swing.JFrame {

    public GuiMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPrincipal = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuItemCliente = new javax.swing.JMenuItem();
        menuItemVendedor = new javax.swing.JMenuItem();
        menuItemProduto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemSair = new javax.swing.JMenuItem();
        menuPedido = new javax.swing.JMenu();
        menuItemEmitirPedido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Vendas");

        menuCadastros.setText("Cadastros");

        menuItemCliente.setText("Cliente");
        menuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClienteActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemCliente);

        menuItemVendedor.setText("Vendedor");
        menuItemVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVendedorActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemVendedor);

        menuItemProduto.setText("Produto");
        menuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProdutoActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemProduto);
        menuCadastros.add(jSeparator1);

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemSair);

        menuPrincipal.add(menuCadastros);

        menuPedido.setText("Pedido");

        menuItemEmitirPedido.setText("Emitir Pedido");
        menuItemEmitirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEmitirPedidoActionPerformed(evt);
            }
        });
        menuPedido.add(menuItemEmitirPedido);

        menuPrincipal.add(menuPedido);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClienteActionPerformed
        new GuiCliente().setVisible(true);
    }//GEN-LAST:event_menuItemClienteActionPerformed

    private void menuItemVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVendedorActionPerformed
        new GuiVendedor().setVisible(true);
    }//GEN-LAST:event_menuItemVendedorActionPerformed

    private void menuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProdutoActionPerformed
        new GuiProduto().setVisible(true);
    }//GEN-LAST:event_menuItemProdutoActionPerformed

    private void menuItemEmitirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEmitirPedidoActionPerformed
        new GuiEmitirPedido().setVisible(true);
    }//GEN-LAST:event_menuItemEmitirPedidoActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        dispose();
    }//GEN-LAST:event_menuItemSairActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuItemCliente;
    private javax.swing.JMenuItem menuItemEmitirPedido;
    private javax.swing.JMenuItem menuItemProduto;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemVendedor;
    private javax.swing.JMenu menuPedido;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
