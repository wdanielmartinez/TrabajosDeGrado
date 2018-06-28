package Frames;

public class IngresarPagina1 extends javax.swing.JFrame {

    public IngresarPagina1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        lblLogoMinerva = new javax.swing.JLabel();
        lblIngresarAlumnoTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNext = new javax.swing.JLabel();
        lblCiclo = new javax.swing.JLabel();
        txtCarrera = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblCarnet = new javax.swing.JLabel();
        lblDireccionResidencia = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblPlanEstudio = new javax.swing.JLabel();
        txtCiclo = new javax.swing.JTextField();
        txtDireccionResidencia = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCarnet = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPlanEstudio = new javax.swing.JTextField();
        lblPaginaUno = new javax.swing.JLabel();
        lblAnioAcademico1 = new javax.swing.JLabel();
        txtAnioAcademico = new javax.swing.JTextField();

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
        lblIngresarAlumnoTitulo.setText("Ingresar Alumno");
        jPanel1.add(lblIngresarAlumnoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 210));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNext.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        lblNext.setForeground(new java.awt.Color(255, 102, 102));
        lblNext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_next_2.png"))); // NOI18N
        lblNext.setText("Siguiente");
        lblNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lblNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 480, 160, 60));

        lblCiclo.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblCiclo.setForeground(new java.awt.Color(0, 0, 0));
        lblCiclo.setText("Ciclo:");
        jPanel2.add(lblCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        txtCarrera.setBackground(new java.awt.Color(204, 204, 204));
        txtCarrera.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtCarrera.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 530, 30));

        lblNombre.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre:");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        lblApellidos.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidos.setText("Apellidos:");
        jPanel2.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        lblCarnet.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblCarnet.setForeground(new java.awt.Color(0, 0, 0));
        lblCarnet.setText("Carnet:");
        jPanel2.add(lblCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        lblDireccionResidencia.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblDireccionResidencia.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccionResidencia.setText("Dirección de Residencia:");
        jPanel2.add(lblDireccionResidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("Teléfono:");
        jPanel2.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        lblCarrera.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblCarrera.setForeground(new java.awt.Color(0, 0, 0));
        lblCarrera.setText("Carrera:");
        jPanel2.add(lblCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo.setText("Código:");
        jPanel2.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, -1, -1));

        lblPlanEstudio.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblPlanEstudio.setForeground(new java.awt.Color(0, 0, 0));
        lblPlanEstudio.setText("Plan de Estudios:");
        jPanel2.add(lblPlanEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        txtCiclo.setBackground(new java.awt.Color(204, 204, 204));
        txtCiclo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtCiclo.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 90, 30));

        txtDireccionResidencia.setBackground(new java.awt.Color(204, 204, 204));
        txtDireccionResidencia.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtDireccionResidencia.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtDireccionResidencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 720, 30));

        txtApellidos.setBackground(new java.awt.Color(204, 204, 204));
        txtApellidos.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 380, 30));

        txtCodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, 190, 30));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 380, 30));

        txtCarnet.setBackground(new java.awt.Color(204, 204, 204));
        txtCarnet.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtCarnet.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 220, 30));

        txtTelefono.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefono.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 210, 30));

        txtPlanEstudio.setBackground(new java.awt.Color(204, 204, 204));
        txtPlanEstudio.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtPlanEstudio.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtPlanEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 170, 30));

        lblPaginaUno.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        lblPaginaUno.setText("Página 1 de 2");
        jPanel2.add(lblPaginaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, -1, -1));

        lblAnioAcademico1.setBackground(new java.awt.Color(0, 0, 0));
        lblAnioAcademico1.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblAnioAcademico1.setForeground(new java.awt.Color(0, 0, 0));
        lblAnioAcademico1.setText("Año académico:");
        jPanel2.add(lblAnioAcademico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));

        txtAnioAcademico.setBackground(new java.awt.Color(204, 204, 204));
        txtAnioAcademico.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtAnioAcademico.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtAnioAcademico, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1110, 560));

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAnioAcademico1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblCarnet;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCiclo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDireccionResidencia;
    private javax.swing.JLabel lblIngresarAlumnoTitulo;
    private javax.swing.JLabel lblLogoMinerva;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaginaUno;
    private javax.swing.JLabel lblPlanEstudio;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtAnioAcademico;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtCiclo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccionResidencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlanEstudio;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
