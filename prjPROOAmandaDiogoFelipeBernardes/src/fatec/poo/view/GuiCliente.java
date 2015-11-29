/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fatec.poo.view;

import fatec.poo.dao.Conexao;
import fatec.poo.dao.DaoCliente;
import fatec.poo.model.Cliente;

import javax.swing.JOptionPane;

public class GuiCliente extends javax.swing.JFrame {

    public GuiCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        Conexao conexao = new Conexao("IBD0020030481413011","IBD0020030481413011");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        DaoCliente daoCliente = new DaoCliente(conexao.conectar());
    }
     
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        conexao.fecharConexao();
        dispose();
    }  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCPF = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtDdd = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        lblLimiteCredito = new javax.swing.JLabel();
        txtLimiteCredito = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblVlrLimiteDisponivel = new javax.swing.JLabel();
        lblUf = new javax.swing.JLabel();
        cbxUf = new javax.swing.JComboBox();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");

        lblCPF.setText("CPF");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblNome.setText("Nome");

        txtNome.setEnabled(false);

        lblEndereco.setText("Endereço");

        txtEndereco.setEnabled(false);

        lblCidade.setText("Cidade");

        txtCidade.setEnabled(false);

        lblTelefone.setText("Telefone");

        txtDdd.setEnabled(false);

        txtTelefone.setEnabled(false);

        lblCep.setText("CEP");

        txtCep.setEnabled(false);

        lblLimiteCredito.setText("Limite de Crédito");
        lblLimiteCredito.setToolTipText("");

        txtLimiteCredito.setEnabled(false);

        jLabel1.setText("Limite Disponível");

        lblVlrLimiteDisponivel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblVlrLimiteDisponivel.setEnabled(false);

        lblUf.setText("UF");

        cbxUf.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCPF)
                    .addComponent(lblNome)
                    .addComponent(lblEndereco)
                    .addComponent(lblCidade)
                    .addComponent(lblTelefone)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblLimiteCredito)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblVlrLimiteDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtEndereco)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52)
                                    .addComponent(lblUf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbxUf, 0, 101, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCep)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultar)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(lblUf)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCep))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblVlrLimiteDisponivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLimiteCredito)
                        .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnAlterar)
                    .addComponent(btnSair)
                    .addComponent(btnExcluir)
                    .addComponent(btnIncluir))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {                                        
        dispose();
    }                                       

    private void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        cliente = null;
        cliente = daoCliente.consultar(txtCpf.getText());

        if (cliente == null) {
            txtCpf.setEnabled(false);
            txtNome.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtCidade.setEnabled(true);
            cbxUf.setEnabled(true);
            txtDdd.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtCep.setEnabled(true);
            txtLimiteCredito.setEnabled(true);

            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        } else {
            txtNome.setText(cliente.getNome());
            txtCpf.setText(cliente.getCpf());
            txtEndereco.setText(cliente.getEndereco());
            txtCidade.setText(cliente.getCidade());
            cbxUf.setText(cliente.getUf());
            txtDdd.setText(cliente.getDdd());
            txtTelefone.setText(cliente.getTelefone());
            txtCep.setText(cliente.getCep());
            txtLimiteCredito.setText(cliente.getLimiteCredito());

            txtCpf.setEnabled(false); 
            txtNome.setEnabled(true);
            txtNome.requestFocus();
            txtEndereco.setEnabled(true);
            txtCidade.setEnabled(true);
            cbxUf.setEnabled(true);
            txtDdd.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtCep.setEnabled(true);
            txtLimiteCredito.setEnabled(true);

            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        cliente = new Cliente(txtCpf.getText(), txtNome.getText());
        daoCliente.inserir(cliente);
         
        txtCpf.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtDdd.setText("");
        txtTelefone.setText("");
        txtCep.setText("");
        txtLimiteCredito.setText("");

        txtCpf.setEnabled(true);
        txtCpf.requestFocus();
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        cbxUf.setEnabled(false);
        txtDdd.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCep.setEnabled(false);
        txtLimiteCredito.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
    }//GEN-LAST:event_btnIncluirActionPerformed
/*
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed
*/
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){
            cliente.setNome(txtNome.getText());
            cliente.setEndereco(txtEndereco.setText());
            cliente.setCidade(txtCidade.setText());
            cliente.setDdd(txtDdd.setText());
            cliente.setTelefone(txtTelefone.setText());
            cliente.setCep(txtCep.gsetText());
            cliente.setLimiteCredito(txtLimiteCredito.setText());
            daoCliente.alterar(cliente);
        } 
        
        txtCpf.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtDdd.setText("");
        txtTelefone.setText("");
        txtCep.setText("");
        txtLimiteCredito.setText("");
        
        txtCpf.setEnabled(true);
        txtCpf.requestFocus();
        
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        cbxUf.setEnabled(false);
        txtDdd.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCep.setEnabled(false);
        txtLimiteCredito.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
       
    }                                          

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0){
            daoCliente.excluir(cliente); 
            
            txtCpf.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            txtDdd.setText("");
            txtTelefone.setText("");
            txtCep.setText("");
            txtLimiteCredito.setText("");

            txtCpf.setEnabled(true);
            txtCpf.requestFocus();
            
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            cbxUf.setEnabled(false);
            txtDdd.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtCep.setEnabled(false);
            txtLimiteCredito.setEnabled(false);
            
            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }    
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox cbxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblLimiteCredito;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUf;
    private javax.swing.JLabel lblVlrLimiteDisponivel;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDdd;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtLimiteCredito;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
