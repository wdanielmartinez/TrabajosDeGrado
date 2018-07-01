package Frames;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class IngresarPagina1 extends javax.swing.JFrame {

    public IngresarPagina1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        lblLogoMinerva = new javax.swing.JLabel();
        lblIngresarAlumnoTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        lblCiclo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblCarnet = new javax.swing.JLabel();
        lblDireccionResidencia = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblPlanEstudio = new javax.swing.JLabel();
        txtDireccionResidencia = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCarnet = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPlanEstudio = new javax.swing.JTextField();
        lblUnidadesValorativas = new javax.swing.JLabel();
        txtUnidadesValorativas = new javax.swing.JTextField();
        lblPaginaUno = new javax.swing.JLabel();
        lblAnioAcademico1 = new javax.swing.JLabel();
        txtAnioAcademico = new javax.swing.JTextField();
        cboxCiclo = new javax.swing.JComboBox<>();
        cboxCarrera = new javax.swing.JComboBox<>();
        lblAnioIngreso = new javax.swing.JLabel();
        txtAnioIngreso = new javax.swing.JTextField();
        lblAnioEgreso = new javax.swing.JLabel();
        txtAnioEgreso = new javax.swing.JTextField();

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

        lblLogoMinerva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/MinervaPag.png"))); // NOI18N
        jPanel1.add(lblLogoMinerva, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 180, 190));

        lblIngresarAlumnoTitulo.setFont(new java.awt.Font("Decker", 1, 48)); // NOI18N
        lblIngresarAlumnoTitulo.setForeground(new java.awt.Color(127, 21, 17));
        lblIngresarAlumnoTitulo.setText("Datos del alumno");
        jPanel1.add(lblIngresarAlumnoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 210));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGuardar.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        lblGuardar.setForeground(new java.awt.Color(255, 102, 102));
        lblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_next_2.png"))); // NOI18N
        lblGuardar.setText("Aceptar");
        lblGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 160, 60));

        lblCiclo.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblCiclo.setText("Ciclo:");
        jPanel2.add(lblCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        lblNombre.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblNombre.setText("Nombre:");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        lblApellidos.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblApellidos.setText("Apellidos:");
        jPanel2.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        lblCarnet.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblCarnet.setText("Carnet:");
        jPanel2.add(lblCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        lblDireccionResidencia.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblDireccionResidencia.setText("Dirección de Residencia:");
        jPanel2.add(lblDireccionResidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblTelefono.setText("Teléfono:");
        jPanel2.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        lblCarrera.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblCarrera.setText("Carrera:");
        jPanel2.add(lblCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblCodigo.setText("Código:");
        jPanel2.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, -1, -1));

        lblPlanEstudio.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblPlanEstudio.setText("Plan de Estudios:");
        jPanel2.add(lblPlanEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        txtDireccionResidencia.setBackground(new java.awt.Color(204, 204, 204));
        txtDireccionResidencia.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtDireccionResidencia.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtDireccionResidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 720, 30));

        txtApellidos.setBackground(new java.awt.Color(204, 204, 204));
        txtApellidos.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 51, 51));
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 400, 30));

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 190, -1));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 51, 51));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 380, 30));

        txtCarnet.setBackground(new java.awt.Color(204, 204, 204));
        txtCarnet.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtCarnet.setForeground(new java.awt.Color(0, 51, 51));
        txtCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCarnetKeyTyped(evt);
            }
        });
        jPanel2.add(txtCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 220, 30));

        txtTelefono.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefono.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 51, 51));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 210, 30));

        txtPlanEstudio.setBackground(new java.awt.Color(204, 204, 204));
        txtPlanEstudio.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtPlanEstudio.setForeground(new java.awt.Color(0, 51, 51));
        txtPlanEstudio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlanEstudioKeyTyped(evt);
            }
        });
        jPanel2.add(txtPlanEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 170, 30));

        lblUnidadesValorativas.setBackground(new java.awt.Color(0, 0, 0));
        lblUnidadesValorativas.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblUnidadesValorativas.setText("Total Unidades U.V.");
        jPanel2.add(lblUnidadesValorativas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        txtUnidadesValorativas.setBackground(new java.awt.Color(204, 204, 204));
        txtUnidadesValorativas.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtUnidadesValorativas.setForeground(new java.awt.Color(0, 51, 51));
        txtUnidadesValorativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadesValorativasActionPerformed(evt);
            }
        });
        txtUnidadesValorativas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidadesValorativasKeyTyped(evt);
            }
        });
        jPanel2.add(txtUnidadesValorativas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 230, 30));

        lblPaginaUno.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        lblPaginaUno.setText("Página 2 de 2");
        jPanel2.add(lblPaginaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

        lblAnioAcademico1.setBackground(new java.awt.Color(0, 0, 0));
        lblAnioAcademico1.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblAnioAcademico1.setText("Año académico:");
        jPanel2.add(lblAnioAcademico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        txtAnioAcademico.setBackground(new java.awt.Color(204, 204, 204));
        txtAnioAcademico.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtAnioAcademico.setForeground(new java.awt.Color(0, 51, 51));
        txtAnioAcademico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioAcademicoKeyTyped(evt);
            }
        });
        jPanel2.add(txtAnioAcademico, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 90, 30));

        cboxCiclo.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        cboxCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II" }));
        jPanel2.add(cboxCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 70, 30));

        cboxCarrera.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        cboxCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arquitectura", "Ingeniería Civil", "Ingeniería Industrial", "Ingeniería de Sistemas Informáticos" }));
        cboxCarrera.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxCarreraItemStateChanged(evt);
            }
        });
        cboxCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCarreraActionPerformed(evt);
            }
        });
        jPanel2.add(cboxCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 144, 550, -1));

        lblAnioIngreso.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblAnioIngreso.setText("Año de ingreso:");
        jPanel2.add(lblAnioIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        txtAnioIngreso.setBackground(new java.awt.Color(204, 204, 204));
        txtAnioIngreso.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        txtAnioIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioIngresoKeyTyped(evt);
            }
        });
        jPanel2.add(txtAnioIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 150, -1));

        lblAnioEgreso.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblAnioEgreso.setText("Año de egreso:");
        jPanel2.add(lblAnioEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        txtAnioEgreso.setBackground(new java.awt.Color(204, 204, 204));
        txtAnioEgreso.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        txtAnioEgreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioEgresoKeyTyped(evt);
            }
        });
        jPanel2.add(txtAnioEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 120, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1110, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnioAcademicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioAcademicoKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(txtAnioAcademico.getText().length()>=4){
            evt.consume();
        }
    }//GEN-LAST:event_txtAnioAcademicoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z')&&(c<'A' || c>'Z') &&(c!=KeyEvent.VK_SPACE)) evt.consume();
        if(txtNombre.getText().length()==60){
        
            evt.consume();
        }
        //else if(c=52)evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z')&&(c<'A' || c>'Z') &&(c!=KeyEvent.VK_SPACE)) evt.consume();
        if(txtApellidos.getText().length()==60){
        
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtPlanEstudioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlanEstudioKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(txtPlanEstudio.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_txtPlanEstudioKeyTyped

    private void cboxCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCarreraActionPerformed
        //if(cboxCarrera)
    }//GEN-LAST:event_cboxCarreraActionPerformed

    private void cboxCarreraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxCarreraItemStateChanged
        if (cboxCarrera.getSelectedItem().equals("Arquitectura")){
            txtCodigo.setText("A30507");
        }
        else if (cboxCarrera.getSelectedItem().equals("Ingeniería Civil")){
            txtCodigo.setText("I30501");
        }
        else if (cboxCarrera.getSelectedItem().equals("Ingeniería Industrial")){
            txtCodigo.setText("I30502");
        }
        else if (cboxCarrera.getSelectedItem().equals("Ingeniería de Sistemas Informáticos")){
            txtCodigo.setText("I30515");
        }
        
    }//GEN-LAST:event_cboxCarreraItemStateChanged

    private void txtAnioIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioIngresoKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(txtAnioIngreso.getText().length()>=4){
            evt.consume();
        }
    }//GEN-LAST:event_txtAnioIngresoKeyTyped

    private void txtAnioEgresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioEgresoKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(txtAnioEgreso.getText().length()>=4){
            evt.consume();
        }
    }//GEN-LAST:event_txtAnioEgresoKeyTyped

    private void txtUnidadesValorativasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadesValorativasKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(txtUnidadesValorativas.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_txtUnidadesValorativasKeyTyped

    private void txtUnidadesValorativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadesValorativasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadesValorativasActionPerformed

    private void txtCarnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarnetKeyTyped
        if(txtCarnet.getText().length()==7){
        
            evt.consume();
        }
    }//GEN-LAST:event_txtCarnetKeyTyped

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
            java.util.logging.Logger.getLogger(IngresarPagina1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarPagina1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarPagina1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarPagina1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarPagina1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxCarrera;
    private javax.swing.JComboBox<String> cboxCiclo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAnioAcademico1;
    private javax.swing.JLabel lblAnioEgreso;
    private javax.swing.JLabel lblAnioIngreso;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblCarnet;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCiclo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDireccionResidencia;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblIngresarAlumnoTitulo;
    private javax.swing.JLabel lblLogoMinerva;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaginaUno;
    private javax.swing.JLabel lblPlanEstudio;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUnidadesValorativas;
    private javax.swing.JTextField txtAnioAcademico;
    private javax.swing.JTextField txtAnioEgreso;
    private javax.swing.JTextField txtAnioIngreso;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccionResidencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlanEstudio;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUnidadesValorativas;
    // End of variables declaration//GEN-END:variables
}
