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
        lblUnidadesValorativas = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        txtUnidadesValorativas = new javax.swing.JTextField();
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
        txtFechaAsesoria = new javax.swing.JTextField();
        rbtnOpcion1 = new javax.swing.JRadioButton();
        rbtnOpcion2 = new javax.swing.JRadioButton();
        rbtnOpcion3 = new javax.swing.JRadioButton();
        jLabelCuantoTiempo = new javax.swing.JLabel();
        txtCuantoTiempo = new javax.swing.JTextField();
        lblNumIntegrantes = new javax.swing.JLabel();
        txtNumIntegrantes = new javax.swing.JTextField();
        cboxHora = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

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
        jPanel2.add(txtDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 520, 30));

        lblUnidadesValorativas.setBackground(new java.awt.Color(0, 0, 0));
        lblUnidadesValorativas.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblUnidadesValorativas.setText("Total Unidades U.V.");
        jPanel2.add(lblUnidadesValorativas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        lblTiempo.setBackground(new java.awt.Color(0, 0, 0));
        lblTiempo.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblTiempo.setText("Tiempo Probable:");
        jPanel2.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        txtUnidadesValorativas.setBackground(new java.awt.Color(204, 204, 204));
        txtUnidadesValorativas.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtUnidadesValorativas.setForeground(new java.awt.Color(0, 51, 51));
        txtUnidadesValorativas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidadesValorativasKeyTyped(evt);
            }
        });
        jPanel2.add(txtUnidadesValorativas, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 230, 30));

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
        lblHora.setText("Hora:");
        jPanel2.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        txtLugarTrabajo.setBackground(new java.awt.Color(204, 204, 204));
        txtLugarTrabajo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtLugarTrabajo.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtLugarTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 790, 30));

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
        lblFechaAsesoria.setText("Fecha de Asesoria:");
        jPanel2.add(lblFechaAsesoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jTextAreaTema.setBackground(new java.awt.Color(204, 204, 204));
        jTextAreaTema.setColumns(20);
        jTextAreaTema.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jTextAreaTema.setForeground(new java.awt.Color(0, 51, 51));
        jTextAreaTema.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTema);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 920, 110));

        txtFechaAsesoria.setBackground(new java.awt.Color(204, 204, 204));
        txtFechaAsesoria.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtFechaAsesoria.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtFechaAsesoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 200, 30));

        btnGroupTiempo.add(rbtnOpcion1);
        rbtnOpcion1.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        rbtnOpcion1.setText("6 meses");
        rbtnOpcion1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnOpcion1ItemStateChanged(evt);
            }
        });
        rbtnOpcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnOpcion1MouseClicked(evt);
            }
        });
        rbtnOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOpcion1ActionPerformed(evt);
            }
        });
        jPanel2.add(rbtnOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        btnGroupTiempo.add(rbtnOpcion2);
        rbtnOpcion2.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        rbtnOpcion2.setText("1 año");
        rbtnOpcion2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnOpcion2ItemStateChanged(evt);
            }
        });
        rbtnOpcion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnOpcion2MouseClicked(evt);
            }
        });
        jPanel2.add(rbtnOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        btnGroupTiempo.add(rbtnOpcion3);
        rbtnOpcion3.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        rbtnOpcion3.setText("Más tiempo");
        rbtnOpcion3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnOpcion3ItemStateChanged(evt);
            }
        });
        rbtnOpcion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnOpcion3MouseClicked(evt);
            }
        });
        jPanel2.add(rbtnOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

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
        jPanel2.add(txtNumIntegrantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 120, -1));

        cboxHora.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        cboxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel2.add(cboxHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 70, -1));

        jLabel1.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel1.setText(":");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 10, -1));

        jComboBox1.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A.M.", "P.M." }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 90, -1));

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

    private void txtUnidadesValorativasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadesValorativasKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(txtUnidadesValorativas.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_txtUnidadesValorativasKeyTyped

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

    private void rbtnOpcion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnOpcion1MouseClicked
        txtCuantoTiempo.setEditable(false);
        txtCuantoTiempo.setText("");
    }//GEN-LAST:event_rbtnOpcion1MouseClicked

    private void rbtnOpcion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnOpcion2MouseClicked
         txtCuantoTiempo.setEditable(false);
         txtCuantoTiempo.setText("");
    }//GEN-LAST:event_rbtnOpcion2MouseClicked

    private void rbtnOpcion3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnOpcion3MouseClicked
         txtCuantoTiempo.setEditable(true);
    }//GEN-LAST:event_rbtnOpcion3MouseClicked
    
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
    private javax.swing.JComboBox<String> cboxHora;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel lblUnidadesValorativas;
    private javax.swing.JRadioButton rbtnOpcion1;
    private javax.swing.JRadioButton rbtnOpcion2;
    private javax.swing.JRadioButton rbtnOpcion3;
    private javax.swing.JTextField txtAsesor;
    private javax.swing.JTextField txtCuantoTiempo;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtFechaAsesoria;
    private javax.swing.JTextField txtLugarTrabajo;
    private javax.swing.JTextField txtNumIntegrantes;
    private javax.swing.JTextField txtTelefonoTrabajo;
    private javax.swing.JTextField txtUnidadesValorativas;
    // End of variables declaration//GEN-END:variables
}
