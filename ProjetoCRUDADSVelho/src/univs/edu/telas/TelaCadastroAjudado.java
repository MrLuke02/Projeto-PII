package univs.edu.telas;

import univs.edu.usuario.UsuarioAjudado;
import univs.edu.usuario.UsuarioDAO;

/**
 *
 * @author Akari
 */
public class TelaCadastroAjudado extends javax.swing.JFrame {

    public TelaCadastroAjudado() {
        initComponents();
    }
    UsuarioAjudado usuario = new UsuarioAjudado();
    UsuarioDAO dao = new UsuarioDAO();
    
    public void  atualizarText(){
        jTextField2.setText(usuario.getProblema());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JLabel();
        tfCpf = new javax.swing.JLabel();
        tfLogin = new javax.swing.JLabel();
        tfSenha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tfnome = new javax.swing.JTextField();
        tfsenha = new javax.swing.JPasswordField();
        tfcpf = new javax.swing.JTextField();
        tflogin = new javax.swing.JTextField();
        Depressao = new javax.swing.JCheckBox();
        Ansiedade = new javax.swing.JCheckBox();
        Outros = new javax.swing.JCheckBox();
        motivo = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phoenix Corporation");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro Usuário");

        tfNome.setBackground(new java.awt.Color(255, 255, 255));
        tfNome.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        tfNome.setForeground(new java.awt.Color(255, 255, 255));
        tfNome.setText("Nome:");

        tfCpf.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        tfCpf.setForeground(new java.awt.Color(255, 255, 255));
        tfCpf.setText("CPF:");

        tfLogin.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        tfLogin.setForeground(new java.awt.Color(255, 255, 255));
        tfLogin.setText("Login:");

        tfSenha.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        tfSenha.setForeground(new java.awt.Color(255, 255, 255));
        tfSenha.setText("Senha:");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Limpar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tfnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnomeActionPerformed(evt);
            }
        });

        Depressao.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        Depressao.setForeground(new java.awt.Color(255, 255, 255));
        Depressao.setText("Depressão");
        Depressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepressaoActionPerformed(evt);
            }
        });

        Ansiedade.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        Ansiedade.setForeground(new java.awt.Color(255, 255, 255));
        Ansiedade.setText("Ansiedade");
        Ansiedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnsiedadeActionPerformed(evt);
            }
        });

        Outros.setBackground(new java.awt.Color(255, 255, 255));
        Outros.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        Outros.setForeground(new java.awt.Color(255, 255, 255));
        Outros.setText("Outro");
        Outros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutrosActionPerformed(evt);
            }
        });

        motivo.setFont(new java.awt.Font("Cambria Math", 0, 11)); // NOI18N
        motivo.setText("Motivo, caso outros");
        motivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motivoActionPerformed(evt);
            }
        });
        motivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                motivoKeyTyped(evt);
            }
        });

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfLogin)
                                    .addComponent(tfCpf)
                                    .addComponent(tfNome)
                                    .addComponent(tfSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfsenha, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(tfnome)
                                    .addComponent(tfcpf)
                                    .addComponent(tflogin))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Outros)
                                    .addComponent(Ansiedade))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(65, 65, 65)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Depressao)
                            .addComponent(motivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome)
                    .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCpf)
                    .addComponent(tfcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLogin)
                    .addComponent(tflogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSenha)
                    .addComponent(tfsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Depressao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ansiedade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Outros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(motivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaUsuario tela = new TelaUsuario();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 limparCampos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tfnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   if(!tfnome.getText().equals("")){
    usuario.setNomeUsuario(tfnome.getText());
    usuario.setCpf(tfcpf.getText());
    usuario.setLogin(tflogin.getText());
    usuario.setSenha(tfsenha.getText());
    dao.salvar(usuario);
    limparCampos();
   }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void motivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motivoActionPerformed

    private void DepressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepressaoActionPerformed
        usuario.setProblema("Depressão");
        atualizarText();
    }//GEN-LAST:event_DepressaoActionPerformed

    private void AnsiedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnsiedadeActionPerformed
        usuario.setProblema("Ansiedade");
        atualizarText();
    }//GEN-LAST:event_AnsiedadeActionPerformed

    private void OutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutrosActionPerformed
        usuario.setProblema(motivo.getText());
        atualizarText();
    }//GEN-LAST:event_OutrosActionPerformed

    private void motivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_motivoKeyTyped
        if (Outros.isSelected()){
            usuario.setProblema(motivo.getText());
            atualizarText();
        }
    }//GEN-LAST:event_motivoKeyTyped

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
            java.util.logging.Logger.getLogger(TelaCadastroAjudado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAjudado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAjudado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAjudado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAjudado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Ansiedade;
    private javax.swing.JCheckBox Depressao;
    private javax.swing.JCheckBox Outros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField motivo;
    private javax.swing.JLabel tfCpf;
    private javax.swing.JLabel tfLogin;
    private javax.swing.JLabel tfNome;
    private javax.swing.JLabel tfSenha;
    private javax.swing.JTextField tfcpf;
    private javax.swing.JTextField tflogin;
    private javax.swing.JTextField tfnome;
    private javax.swing.JPasswordField tfsenha;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        tfcpf.setText("");
        tflogin.setText("");
        tfnome.setText("");
        tfsenha.setText("");
    }
}
