package Frames;

public class frameVerProgreso extends javax.swing.JFrame {

    public frameVerProgreso() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtCuantoTiempo.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTiempo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        lblIngresarAlumnoTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblSiguiente = new javax.swing.JLabel();
        lblEleccion = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBack.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 102, 102));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_back_2.png"))); // NOI18N
        lblBack.setText("Regresar");
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 60));

        lblIngresarAlumnoTitulo.setFont(new java.awt.Font("Decker", 1, 36)); // NOI18N
        lblIngresarAlumnoTitulo.setForeground(new java.awt.Color(127, 21, 17));
        lblIngresarAlumnoTitulo.setText("Progreso de tesis");
        jPanel1.add(lblIngresarAlumnoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSiguiente.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        lblSiguiente.setForeground(new java.awt.Color(255, 102, 102));
        lblSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_next_2.png"))); // NOI18N
        lblSiguiente.setText("Siguiente");
        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, 160, 60));

        lblEleccion.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblEleccion.setText("Elija tesis a revisar:");
        jPanel2.add(lblEleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 290, 40));

        jComboBox1.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 960, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1150, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
            java.util.logging.Logger.getLogger(frameVerProgreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameVerProgreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameVerProgreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameVerProgreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameVerProgreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupTiempo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblEleccion;
    private javax.swing.JLabel lblIngresarAlumnoTitulo;
    private javax.swing.JLabel lblSiguiente;
    // End of variables declaration//GEN-END:variables
}
