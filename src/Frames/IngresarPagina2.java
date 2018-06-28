package Frames;

public class IngresarPagina2 extends javax.swing.JFrame {

    public IngresarPagina2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        lblIngresarAlumnoTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblGuardar = new javax.swing.JLabel();
        lblTelefonoTrabajo = new javax.swing.JLabel();
        txtDirector = new javax.swing.JTextField();
        lblUnidadesValorativas = new javax.swing.JLabel();
        txtAnioEgreso = new javax.swing.JTextField();
        lblTiempo = new javax.swing.JLabel();
        txtUnidadesValorativas = new javax.swing.JTextField();
        lblLugarTrabajo = new javax.swing.JLabel();
        lblAsesor = new javax.swing.JLabel();
        lblDirector = new javax.swing.JLabel();
        lblTema = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblAnioIngreso = new javax.swing.JLabel();
        lblAnioEgreso = new javax.swing.JLabel();
        txtLugarTrabajo = new javax.swing.JTextField();
        txtAsesor = new javax.swing.JTextField();
        txtTelefonoTrabajo = new javax.swing.JTextField();
        lblFechaAsesoria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTema = new javax.swing.JTextArea();
        txtTiempo = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtAnioIngreso = new javax.swing.JTextField();
        txtFechaAsesoria = new javax.swing.JTextField();

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
        lblIngresarAlumnoTitulo.setText("Ingresar Alumno");
        jPanel1.add(lblIngresarAlumnoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        jLabel3.setText("Página 2 de 2");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, -1, -1));

        lblGuardar.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        lblGuardar.setForeground(new java.awt.Color(255, 102, 102));
        lblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_next_2.png"))); // NOI18N
        lblGuardar.setText("Guardar");
        lblGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 560, 160, 60));

        lblTelefonoTrabajo.setBackground(new java.awt.Color(0, 0, 0));
        lblTelefonoTrabajo.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblTelefonoTrabajo.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefonoTrabajo.setText("Teléfono de Trabajo:");
        jPanel2.add(lblTelefonoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        txtDirector.setBackground(new java.awt.Color(204, 204, 204));
        txtDirector.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtDirector.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 520, 30));

        lblUnidadesValorativas.setBackground(new java.awt.Color(0, 0, 0));
        lblUnidadesValorativas.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblUnidadesValorativas.setForeground(new java.awt.Color(0, 0, 0));
        lblUnidadesValorativas.setText("Total Unidades U.V.");
        jPanel2.add(lblUnidadesValorativas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        txtAnioEgreso.setBackground(new java.awt.Color(204, 204, 204));
        txtAnioEgreso.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtAnioEgreso.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtAnioEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, 120, 30));

        lblTiempo.setBackground(new java.awt.Color(0, 0, 0));
        lblTiempo.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(0, 0, 0));
        lblTiempo.setText("Tiempo Probable:");
        jPanel2.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        txtUnidadesValorativas.setBackground(new java.awt.Color(204, 204, 204));
        txtUnidadesValorativas.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtUnidadesValorativas.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtUnidadesValorativas, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 230, 30));

        lblLugarTrabajo.setBackground(new java.awt.Color(0, 0, 0));
        lblLugarTrabajo.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblLugarTrabajo.setForeground(new java.awt.Color(0, 0, 0));
        lblLugarTrabajo.setText("Lugar de Trabajo:");
        jPanel2.add(lblLugarTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        lblAsesor.setBackground(new java.awt.Color(0, 0, 0));
        lblAsesor.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblAsesor.setForeground(new java.awt.Color(0, 0, 0));
        lblAsesor.setText("Asesor Docente:");
        jPanel2.add(lblAsesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        lblDirector.setBackground(new java.awt.Color(0, 0, 0));
        lblDirector.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblDirector.setForeground(new java.awt.Color(0, 0, 0));
        lblDirector.setText("Director General Proceso de Graduación:");
        jPanel2.add(lblDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        lblTema.setBackground(new java.awt.Color(0, 0, 0));
        lblTema.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblTema.setForeground(new java.awt.Color(0, 0, 0));
        lblTema.setText("Tema:");
        jPanel2.add(lblTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        lblHora.setBackground(new java.awt.Color(0, 0, 0));
        lblHora.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 0, 0));
        lblHora.setText("Hora:");
        jPanel2.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        lblAnioIngreso.setBackground(new java.awt.Color(0, 0, 0));
        lblAnioIngreso.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblAnioIngreso.setForeground(new java.awt.Color(0, 0, 0));
        lblAnioIngreso.setText("Año de Ingreso:");
        jPanel2.add(lblAnioIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        lblAnioEgreso.setBackground(new java.awt.Color(0, 0, 0));
        lblAnioEgreso.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblAnioEgreso.setForeground(new java.awt.Color(0, 0, 0));
        lblAnioEgreso.setText("Año de Egreso:");
        jPanel2.add(lblAnioEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, -1, -1));

        txtLugarTrabajo.setBackground(new java.awt.Color(204, 204, 204));
        txtLugarTrabajo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtLugarTrabajo.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtLugarTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 790, 30));

        txtAsesor.setBackground(new java.awt.Color(204, 204, 204));
        txtAsesor.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtAsesor.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtAsesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 790, 30));

        txtTelefonoTrabajo.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefonoTrabajo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtTelefonoTrabajo.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtTelefonoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 220, 30));

        lblFechaAsesoria.setBackground(new java.awt.Color(0, 0, 0));
        lblFechaAsesoria.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        lblFechaAsesoria.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaAsesoria.setText("Fecha de Asesoria:");
        jPanel2.add(lblFechaAsesoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jTextAreaTema.setBackground(new java.awt.Color(204, 204, 204));
        jTextAreaTema.setColumns(20);
        jTextAreaTema.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jTextAreaTema.setForeground(new java.awt.Color(0, 51, 51));
        jTextAreaTema.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTema);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 940, 110));

        txtTiempo.setBackground(new java.awt.Color(204, 204, 204));
        txtTiempo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 190, 30));

        txtHora.setBackground(new java.awt.Color(204, 204, 204));
        txtHora.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtHora.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 160, 30));

        txtAnioIngreso.setBackground(new java.awt.Color(204, 204, 204));
        txtAnioIngreso.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtAnioIngreso.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtAnioIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 120, 30));

        txtFechaAsesoria.setBackground(new java.awt.Color(204, 204, 204));
        txtFechaAsesoria.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        txtFechaAsesoria.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(txtFechaAsesoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 200, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1110, 640));

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTema;
    private javax.swing.JLabel lblAnioEgreso;
    private javax.swing.JLabel lblAnioIngreso;
    private javax.swing.JLabel lblAsesor;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblFechaAsesoria;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblIngresarAlumnoTitulo;
    private javax.swing.JLabel lblLugarTrabajo;
    private javax.swing.JLabel lblTelefonoTrabajo;
    private javax.swing.JLabel lblTema;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblUnidadesValorativas;
    private javax.swing.JTextField txtAnioEgreso;
    private javax.swing.JTextField txtAnioIngreso;
    private javax.swing.JTextField txtAsesor;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtFechaAsesoria;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtLugarTrabajo;
    private javax.swing.JTextField txtTelefonoTrabajo;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtUnidadesValorativas;
    // End of variables declaration//GEN-END:variables
}
