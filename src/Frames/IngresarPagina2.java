package Frames;

public class IngresarPagina2 extends javax.swing.JFrame {

    public IngresarPagina2() {
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
        jLabel3 = new javax.swing.JLabel();
        lblSiguiente = new javax.swing.JLabel();
        lblTelefonoTrabajo = new javax.swing.JLabel();
        txtDirector = new javax.swing.JTextField();
        lblTiempo = new javax.swing.JLabel();
        lblLugarTrabajo = new javax.swing.JLabel();
        lblAsesor = new javax.swing.JLabel();
        lblDirector = new javax.swing.JLabel();
        lblTema = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        txtLugarTrabajo = new javax.swing.JTextField();
        txtAsesor = new javax.swing.JTextField();
        txtTelefonoTrabajo = new javax.swing.JTextField();
        lblFechaAsesoria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTema = new javax.swing.JTextArea();
        rbtnOpcion1 = new javax.swing.JRadioButton();
        rbtnOpcion2 = new javax.swing.JRadioButton();
        rbtnOpcion3 = new javax.swing.JRadioButton();
        jLabelCuantoTiempo = new javax.swing.JLabel();
        txtCuantoTiempo = new javax.swing.JTextField();
        lblNumIntegrantes = new javax.swing.JLabel();
        txtNumIntegrantes = new javax.swing.JTextField();
        jFecha = new com.toedter.calendar.JDateChooser();
        cbHora = new javax.swing.JComboBox<>();
        cbTurno = new javax.swing.JComboBox<>();

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
        lblIngresarAlumnoTitulo.setText("Datos de la Tesis");
        jPanel1.add(lblIngresarAlumnoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        jLabel3.setText("Página 1 de 2");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, -1, -1));

        lblSiguiente.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        lblSiguiente.setForeground(new java.awt.Color(255, 102, 102));
        lblSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_next_2.png"))); // NOI18N
        lblSiguiente.setText("Siguiente");
        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, 160, 60));

        lblTelefonoTrabajo.setBackground(new java.awt.Color(0, 0, 0));
        lblTelefonoTrabajo.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblTelefonoTrabajo.setText("Teléfono de Trabajo:");
        jPanel2.add(lblTelefonoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        txtDirector.setBackground(new java.awt.Color(204, 204, 204));
        txtDirector.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtDirector.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 510, 30));

        lblTiempo.setBackground(new java.awt.Color(0, 0, 0));
        lblTiempo.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblTiempo.setText("Tiempo Probable:");
        jPanel2.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        lblLugarTrabajo.setBackground(new java.awt.Color(0, 0, 0));
        lblLugarTrabajo.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblLugarTrabajo.setText("Lugar de Trabajo:");
        jPanel2.add(lblLugarTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        lblAsesor.setBackground(new java.awt.Color(0, 0, 0));
        lblAsesor.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblAsesor.setText("Asesor Docente:");
        jPanel2.add(lblAsesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        lblDirector.setBackground(new java.awt.Color(0, 0, 0));
        lblDirector.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblDirector.setText("Director General Proceso de Graduación:");
        jPanel2.add(lblDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        lblTema.setBackground(new java.awt.Color(0, 0, 0));
        lblTema.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblTema.setText("Tema:");
        jPanel2.add(lblTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        lblHora.setBackground(new java.awt.Color(0, 0, 0));
        lblHora.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblHora.setText("Hora Asesorias:");
        jPanel2.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, -1, -1));

        txtLugarTrabajo.setBackground(new java.awt.Color(204, 204, 204));
        txtLugarTrabajo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtLugarTrabajo.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtLugarTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 790, 30));

        txtAsesor.setBackground(new java.awt.Color(204, 204, 204));
        txtAsesor.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtAsesor.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtAsesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 800, 30));

        txtTelefonoTrabajo.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefonoTrabajo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtTelefonoTrabajo.setForeground(new java.awt.Color(0, 51, 51));
        txtTelefonoTrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoTrabajoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefonoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 220, 30));

        lblFechaAsesoria.setBackground(new java.awt.Color(0, 0, 0));
        lblFechaAsesoria.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblFechaAsesoria.setText("Fecha Primera Asesoria:");
        jPanel2.add(lblFechaAsesoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jTextAreaTema.setBackground(new java.awt.Color(204, 204, 204));
        jTextAreaTema.setColumns(20);
        jTextAreaTema.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jTextAreaTema.setForeground(new java.awt.Color(0, 51, 51));
        jTextAreaTema.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTema);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 920, 110));

        btnGroupTiempo.add(rbtnOpcion1);
        rbtnOpcion1.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        rbtnOpcion1.setText("6 meses");
        rbtnOpcion1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnOpcion1ItemStateChanged(evt);
            }
        });
        rbtnOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOpcion1ActionPerformed(evt);
            }
        });
        jPanel2.add(rbtnOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        btnGroupTiempo.add(rbtnOpcion2);
        rbtnOpcion2.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        rbtnOpcion2.setText("1 año");
        rbtnOpcion2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnOpcion2ItemStateChanged(evt);
            }
        });
        jPanel2.add(rbtnOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        btnGroupTiempo.add(rbtnOpcion3);
        rbtnOpcion3.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        rbtnOpcion3.setText("Más tiempo");
        rbtnOpcion3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnOpcion3ItemStateChanged(evt);
            }
        });
        jPanel2.add(rbtnOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        jLabelCuantoTiempo.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLabelCuantoTiempo.setText("¿Cuánto tiempo?:");
        jPanel2.add(jLabelCuantoTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, 40));

        txtCuantoTiempo.setBackground(new java.awt.Color(204, 204, 204));
        txtCuantoTiempo.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jPanel2.add(txtCuantoTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 200, -1));

        lblNumIntegrantes.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblNumIntegrantes.setText("Número de integrantes del grupo:");
        jPanel2.add(lblNumIntegrantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 390, -1));

        txtNumIntegrantes.setBackground(new java.awt.Color(204, 204, 204));
        txtNumIntegrantes.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        txtNumIntegrantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumIntegrantesKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumIntegrantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 120, -1));

        jFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 230, 30));

        cbHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel2.add(cbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, 50, 30));

        cbTurno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "am", "pm" }));
        jPanel2.add(cbTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, 60, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1150, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoTrabajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoTrabajoKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(txtTelefonoTrabajo.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoTrabajoKeyTyped

    private void rbtnOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOpcion1ActionPerformed
        
    }//GEN-LAST:event_rbtnOpcion1ActionPerformed

    private void rbtnOpcion1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnOpcion1ItemStateChanged
        if (rbtnOpcion1.isSelected()){
            txtCuantoTiempo.setEditable(false);
        }
    }//GEN-LAST:event_rbtnOpcion1ItemStateChanged

    private void rbtnOpcion2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnOpcion2ItemStateChanged
        if (rbtnOpcion1.isSelected()){
            txtCuantoTiempo.setEditable(false);
        }
    }//GEN-LAST:event_rbtnOpcion2ItemStateChanged

    private void rbtnOpcion3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnOpcion3ItemStateChanged
        if (rbtnOpcion1.isSelected()){
            txtCuantoTiempo.setEditable(true);
        }
    }//GEN-LAST:event_rbtnOpcion3ItemStateChanged

    private void txtNumIntegrantesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumIntegrantesKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(txtNumIntegrantes.getText().length()>=2){
            evt.consume();
        }
    }//GEN-LAST:event_txtNumIntegrantesKeyTyped
    
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
            java.util.logging.Logger.getLogger(IngresarPagina2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarPagina2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarPagina2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarPagina2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarPagina2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupTiempo;
    private javax.swing.JComboBox<String> cbHora;
    private javax.swing.JComboBox<String> cbTurno;
    private com.toedter.calendar.JDateChooser jFecha;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCuantoTiempo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTema;
    private javax.swing.JLabel lblAsesor;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblFechaAsesoria;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblIngresarAlumnoTitulo;
    private javax.swing.JLabel lblLugarTrabajo;
    private javax.swing.JLabel lblNumIntegrantes;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblTelefonoTrabajo;
    private javax.swing.JLabel lblTema;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JRadioButton rbtnOpcion1;
    private javax.swing.JRadioButton rbtnOpcion2;
    private javax.swing.JRadioButton rbtnOpcion3;
    private javax.swing.JTextField txtAsesor;
    private javax.swing.JTextField txtCuantoTiempo;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtLugarTrabajo;
    private javax.swing.JTextField txtNumIntegrantes;
    private javax.swing.JTextField txtTelefonoTrabajo;
    // End of variables declaration//GEN-END:variables
}
