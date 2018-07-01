package Frames;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblActividades = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        lblAjustes = new javax.swing.JLabel();
        lblSoccios = new javax.swing.JLabel();
        lblIdeas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Nueva Tesis");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        lblActividades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Today_96px.png"))); // NOI18N
        lblActividades.setBorder(new javax.swing.border.MatteBorder(null));
        lblActividades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 155, 151));

        lblTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Clock_96px.png"))); // NOI18N
        lblTiempo.setBorder(new javax.swing.border.MatteBorder(null));
        lblTiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 155, 151));

        lblUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_User_96px_2.png"))); // NOI18N
        lblUsuarios.setBorder(new javax.swing.border.MatteBorder(null));
        lblUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseClicked(evt);
            }
        });
        jPanel1.add(lblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 155, 151));

        lblAjustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Maintenance_96px.png"))); // NOI18N
        lblAjustes.setBorder(new javax.swing.border.MatteBorder(null));
        lblAjustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 155, 151));

        lblSoccios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoccios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Handshake_96px.png"))); // NOI18N
        lblSoccios.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lblSoccios, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 156, 151));

        lblIdeas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdeas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Idea_96px.png"))); // NOI18N
        lblIdeas.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lblIdeas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 156, 151));

        jLabel7.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(196, 80, 1));
        jLabel7.setText("Ajustes");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, -1, -1));

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1110, 510));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Minerva_1.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 240));

        jLabel2.setFont(new java.awt.Font("Decker", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("CONTROL DE TRABAJOS DE GRADO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 710, 40));

        jLabel3.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("UNIVERSIDAD DE EL SALVADOR");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Minimizar.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, -1, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cerrar.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, -1));

        Background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseClicked
        IngresarPagina2 tesis = new IngresarPagina2();
        tesis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblActividades;
    private javax.swing.JLabel lblAjustes;
    private javax.swing.JLabel lblIdeas;
    private javax.swing.JLabel lblSoccios;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblUsuarios;
    // End of variables declaration//GEN-END:variables
}
