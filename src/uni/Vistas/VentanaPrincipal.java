
package uni.Vistas;

public class VentanaPrincipal extends javax.swing.JFrame {

   
    public VentanaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmManejodeInscripciones = new javax.swing.JMenuItem();
        jmManipulaciondeNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmAlumnosporMateria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );

        jmAlumno.setText("Alumno");

        jMenuItem1.setText("Formulario de Alumnos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmAlumno.add(jMenuItem1);

        jMenuBar1.add(jmAlumno);

        jMenu2.setText("Materia");

        jmMateria.setText("Formulario de Materia");
        jmMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(jmMateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");

        jmManejodeInscripciones.setText("Manejo de Inscripciones");
        jmManejodeInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManejodeInscripcionesActionPerformed(evt);
            }
        });
        jMenu3.add(jmManejodeInscripciones);

        jmManipulaciondeNotas.setText("Manipulacion de Notas");
        jMenu3.add(jmManipulaciondeNotas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        jmAlumnosporMateria.setText("Alumnos por Materia");
        jMenu4.add(jmAlumnosporMateria);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VistaAlumnos alumno = new VistaAlumnos();
        alumno.setVisible(true);
        escritorio.add(alumno);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMateriaActionPerformed
        VistaMateria materia = new VistaMateria();
        materia.setVisible(true);
        escritorio.add(materia);
    }//GEN-LAST:event_jmMateriaActionPerformed

    private void jmManejodeInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManejodeInscripcionesActionPerformed
        VistaInscripciones insc = new VistaInscripciones();
        insc.setVisible(true);
        escritorio.add(insc);             //REHACER
    }//GEN-LAST:event_jmManejodeInscripcionesActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenuItem jmAlumnosporMateria;
    private javax.swing.JMenuItem jmManejodeInscripciones;
    private javax.swing.JMenuItem jmManipulaciondeNotas;
    private javax.swing.JMenuItem jmMateria;
    // End of variables declaration//GEN-END:variables
}
