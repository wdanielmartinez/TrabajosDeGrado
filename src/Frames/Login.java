package Frames;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPane = new javax.swing.JPanel();
        Minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        lblUsuarioIcon = new javax.swing.JLabel();
        lblContraseñaLetra = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();
        lblUsuarioLetra = new javax.swing.JLabel();
        lblKey = new javax.swing.JLabel();
        jSeparatorDos = new javax.swing.JSeparator();
        jSeparatorUno = new javax.swing.JSeparator();
        jPassword = new javax.swing.JPasswordField();
        IngresarUsuario = new javax.swing.JTextField();
        jbntIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginPane.setBackground(new java.awt.Color(255, 255, 255));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Minimizar.png"))); // NOI18N
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cerrar.png"))); // NOI18N
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        lblUsuarioIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/SuperUsuario.png"))); // NOI18N

        lblContraseñaLetra.setBackground(new java.awt.Color(255, 0, 51));
        lblContraseñaLetra.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblContraseñaLetra.setForeground(new java.awt.Color(129, 19, 14));
        lblContraseñaLetra.setText("Contraseña:");

        lblCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Customer.png"))); // NOI18N

        lblUsuarioLetra.setBackground(new java.awt.Color(255, 0, 51));
        lblUsuarioLetra.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblUsuarioLetra.setForeground(new java.awt.Color(129, 19, 14));
        lblUsuarioLetra.setText("Usuario:");

        lblKey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Key.png"))); // NOI18N

        jPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPassword.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jPassword.setForeground(new java.awt.Color(210, 85, 79));
        jPassword.setText("jPasswordField1");
        jPassword.setBorder(null);
        jPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordMouseClicked(evt);
            }
        });

        IngresarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        IngresarUsuario.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        IngresarUsuario.setForeground(new java.awt.Color(210, 85, 79));
        IngresarUsuario.setText("Ingrese el usuario...");
        IngresarUsuario.setBorder(null);
        IngresarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngresarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarUsuarioMouseClicked(evt);
            }
        });
        IngresarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarUsuarioActionPerformed(evt);
            }
        });

        jbntIniciarSesion.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jbntIniciarSesion.setForeground(new java.awt.Color(129, 19, 14));
        jbntIniciarSesion.setText("Iniciar sesión");
        jbntIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout LoginPaneLayout = new javax.swing.GroupLayout(LoginPane);
        LoginPane.setLayout(LoginPaneLayout);
        LoginPaneLayout.setHorizontalGroup(
            LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPaneLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparatorDos, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LoginPaneLayout.createSequentialGroup()
                            .addComponent(lblKey)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginPaneLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbntIniciarSesion)
                            .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparatorUno, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUsuarioLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(LoginPaneLayout.createSequentialGroup()
                                    .addComponent(lblCustomer)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(IngresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblContraseñaLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPaneLayout.createSequentialGroup()
                        .addComponent(lblUsuarioIcon)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPaneLayout.createSequentialGroup()
                        .addComponent(Minimizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cerrar)
                        .addContainerGap())))
        );
        LoginPaneLayout.setVerticalGroup(
            LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Minimizar)
                    .addComponent(Cerrar))
                .addGap(57, 57, 57)
                .addComponent(lblUsuarioIcon)
                .addGap(60, 60, 60)
                .addComponent(lblUsuarioLetra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomer)
                    .addComponent(IngresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorUno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblContraseñaLetra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKey))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorDos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jbntIniciarSesion)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(LoginPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea Salir?", "Salir", dialogButton);

        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_CerrarMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void IngresarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarUsuarioMouseClicked
        IngresarUsuario.setText("");
    }//GEN-LAST:event_IngresarUsuarioMouseClicked

    private void jPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordMouseClicked
        jPassword.setText("");
    }//GEN-LAST:event_jPasswordMouseClicked

    private void IngresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarUsuarioActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JTextField IngresarUsuario;
    private javax.swing.JPanel LoginPane;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparatorDos;
    private javax.swing.JSeparator jSeparatorUno;
    private javax.swing.JButton jbntIniciarSesion;
    private javax.swing.JLabel lblContraseñaLetra;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblKey;
    private javax.swing.JLabel lblUsuarioIcon;
    private javax.swing.JLabel lblUsuarioLetra;
    // End of variables declaration//GEN-END:variables
}
