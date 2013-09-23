/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Hibernate.Imovel2;
import Hibernate.Imovelincra;
import dao.ImovelDAO;
import dao.ProImovelDAO;
import dao.UsuarioDAO;
import static gui.JDialogCadstAltera2.prop;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Imovel;
import modelo.ProImovel;
import modelo.Proprietario;

import modelo.serviços;

/**
 *
 * @author USuario
 */
public class JDialogProImo extends javax.swing.JDialog {

    String Nome;
    String Tipo;
Imovelincra user = null;
Imovel2 us = null;
    /**
     * Creates new form JDialogProImo
     */
    public JDialogProImo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    public void receber(String N) {
        Nome = N;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastrar Proprietário - Imóvel");

        jLabel2.setText("ID Proprietario:");

        jLabel3.setText("ID_Imóvel:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pronto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Preencha cada um e de 'Enter', aparecerá uma mensagem com o resultado");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Incra", "Outros" }));

        jLabel5.setText("Comentarios:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        if ((jTextField1.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        } else {
            UsuarioDAO b = null;
            try {
                Proprietario p = UsuarioDAO.procuraIDUser(jTextField1.getText());
                prop = p;
                if (p == null) {
                    JOptionPane.showMessageDialog(null, "NÃO ENCONTRADO");
                }
                if (p != null) {
                    JOptionPane.showMessageDialog(null, "ENCONTRADO\n" + "NOME: " + p.getNome() + "\nCPF: " + p.getCpfcnpj());
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(JDialogPProprietario.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "\n" + ex.getMessage() + "\n");
            }
            
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        Imovel imovel = new Imovel();
        imovel.setCI(jTextField1.getText());
        if ((jTextField2.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        } else {
            try {
                ImovelDAO imo = null;
                try {
                    imo = new ImovelDAO();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(JDialogPProprietario.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "\n" + ex.getMessage() + "\n");
                }
                String Tipo = String.valueOf((String) jComboBox1.getSelectedItem());
                if (Tipo == "Selecione") {
                    JOptionPane.showMessageDialog(null, "SELECIONE UMA OPCAO");
                }
                if (Tipo == "Incra") {
                    user = imo.procuraIDUser(jTextField2.getText());
                    if(user!=null){
                        JOptionPane.showMessageDialog(null, "ENCONTRADO");
                    }else{
                        JOptionPane.showMessageDialog(null, "NAO ENCONTRADO");
                    }
                }
                if (Tipo == "Outros") {
                   us = imo.procuraIDUserO(jTextField2.getText());
                    if(us!=null){
                        JOptionPane.showMessageDialog(null, "ENCONTRADO");
                    }else{
                        JOptionPane.showMessageDialog(null, "NAO ENCONTRADO");
                    }
                }
                //jTextField3.setText(Nome); problemas
            } catch (HeadlessException | SQLException ex) {
                Logger.getLogger(JDialogPProprietario.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "\n" + ex.getMessage() + "\n");
            }

        } // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ProImovel pi = new ProImovel();
        String Tipo = String.valueOf((String) jComboBox1.getSelectedItem());
        if((jTextField1.getText().isEmpty())&& (jTextField2.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "PREENCHA OS DADOS");
        }
        if (Tipo == "Incra") {
            pi.setID(jTextField1.getText());
            pi.setCI(jTextField2.getText());
            pi.setCom(jTextField3.getText());
            ProImovelDAO dao = null;
            try {
                dao = new ProImovelDAO();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(JDialogCadst.class.getName()).log(Level.SEVERE, null, ex + ex.getMessage());
            }
            dao.adiciona(pi);
            JOptionPane.showMessageDialog(null, jTextField1.getText() + "\n"+ jTextField2.getText() + "\nInserido com sucesso! ");

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
        }
        if (Tipo == "Outros") {
            pi.setID(jTextField1.getText());
            pi.setCI(jTextField2.getText());
            pi.setCom(jTextField3.getText());
            ProImovelDAO dao = null;
            try {
                dao = new ProImovelDAO();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(JDialogCadst.class.getName()).log(Level.SEVERE, null, ex + ex.getMessage());
            }
            dao.adicionaOutros(pi);
            JOptionPane.showMessageDialog(null, jTextField1.getText() + "\n"+ jTextField2.getText() + "\nInserido com sucesso! ");

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
        }
        int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Outro Cadastro?");
        if((showConfirmDialog == 1)){
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JDialogProImo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogProImo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogProImo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogProImo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogProImo dialog = new JDialogProImo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}