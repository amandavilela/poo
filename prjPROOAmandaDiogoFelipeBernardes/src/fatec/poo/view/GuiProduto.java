package fatec.poo.view;

import fatec.poo.dao.Conexao;
import fatec.poo.dao.DaoProduto;
import fatec.poo.model.Produto;

import javax.swing.JOptionPane;

public class GuiProduto extends javax.swing.JFrame {


    public GuiProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEstoqueMin = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        txtQtdDisponivel = new javax.swing.JTextField();
        lblQtdeDisponivel = new javax.swing.JLabel();
        lblPrecUnit = new javax.swing.JLabel();
        txtPrecUnit = new javax.swing.JTextField();
        lblEstoqueMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadatro de Produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtEstoqueMin.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtCodigo.setFocusCycleRoot(true);

        txtDescricao.setEnabled(false);

        lblCodigo.setText("Código");

        lblDescricao.setText("Descrição");

        txtQtdDisponivel.setEnabled(false);

        lblQtdeDisponivel.setText("Qtd. Disponível");

        lblPrecUnit.setText("Preço unitário");

        txtPrecUnit.setEnabled(false);

        lblEstoqueMin.setText("Estoque mínimo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQtdeDisponivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQtdDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrecUnit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblEstoqueMin)
                        .addGap(11, 11, 11)
                        .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(lblCodigo))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblQtdeDisponivel)
                                .addComponent(txtQtdDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPrecUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrecUnit)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnExcluir)
                                .addComponent(btnSair)
                                .addComponent(btnAlterar)
                                .addComponent(btnIncluir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstoqueMin))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        produto = new Produto(Integer.parseInt(txtCodigo.getText()), txtDescricao.getText());
        
        produto.setEstoqueMin(Integer.parseInt(txtEstoqueMin.getText()));
        produto.setQtdeDisponivel(Integer.parseInt(txtQtdDisponivel.getText()));
        produto.setPrecoUnit(Double.parseDouble(txtPrecUnit.getText()));
        daoProduto.inserir(produto);
         
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtEstoqueMin.setText("");
        txtPrecUnit.setText("");
        txtQtdDisponivel.setText("");
        
        txtCodigo.setEnabled(true);
        txtCodigo.requestFocus();
        txtDescricao.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        txtPrecUnit.setEnabled(false);
        txtQtdDisponivel.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        
        JOptionPane.showMessageDialog(null, "Produto incluído com sucesso!");
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        produto = null;
        produto = daoProduto.consultar(Integer.parseInt(txtCodigo.getText()));

        if (produto == null) {
            txtCodigo.setEnabled(false);
            txtDescricao.setEnabled(true);
            txtEstoqueMin.setEnabled(true);
            txtPrecUnit.setEnabled(true);
            txtQtdDisponivel.setEnabled(true);

            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        } else {
            txtCodigo.setText(Integer.toString(produto.getCodigo()));
            txtDescricao.setText(produto.getDescricao());
            txtEstoqueMin.setText(Integer.toString(produto.getEstoqueMin()));
            txtPrecUnit.setText(Double.toString(produto.getPrecoUnit()));
            txtQtdDisponivel.setText(Integer.toString(produto.getQtdeDisponivel()));
            
            txtCodigo.setEnabled(false); 
            txtDescricao.setEnabled(true);
            txtEstoqueMin.requestFocus();
            txtPrecUnit.setEnabled(true);
            txtQtdDisponivel.setEnabled(true);
     
            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){
            produto.setEstoqueMin(Integer.parseInt(txtEstoqueMin.getText()));
            produto.setQtdeDisponivel(Integer.parseInt(txtQtdDisponivel.getText()));
            produto.setPrecoUnit(Double.parseDouble(txtPrecUnit.getText()));
            daoProduto.alterar(produto);
        } 
        
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtEstoqueMin.setText("");
        txtPrecUnit.setText("");
        txtQtdDisponivel.setText("");
        
        txtCodigo.setEnabled(true);
        txtCodigo.requestFocus();
        
        txtDescricao.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        txtPrecUnit.setEnabled(false);
        txtQtdDisponivel.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma a exclusão?") == 0){
            daoProduto.excluir(produto); 
            
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtEstoqueMin.setText("");
        txtPrecUnit.setText("");
        txtQtdDisponivel.setText("");

        txtCodigo.setEnabled(true);
        txtCodigo.requestFocus();
            
        txtDescricao.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        txtPrecUnit.setEnabled(false);
        txtQtdDisponivel.setEnabled(false);
            
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        }
        
        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("system","123");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        /*conexao = new Conexao("IBD0020030481323008","IBD0020030481323008");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");*/
        daoProduto = new DaoProduto(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       conexao.fecharConexao();
       dispose();
    }//GEN-LAST:event_formWindowClosing

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstoqueMin;
    private javax.swing.JLabel lblPrecUnit;
    private javax.swing.JLabel lblQtdeDisponivel;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoqueMin;
    private javax.swing.JTextField txtPrecUnit;
    private javax.swing.JTextField txtQtdDisponivel;
    // End of variables declaration//GEN-END:variables
    private DaoProduto daoProduto=null;
    private Produto produto=null;
    private Conexao conexao=null;
}
