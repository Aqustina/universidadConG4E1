
package uni.Vistas;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import uni.AccesoADatos.AlumnoData;
import uni.AccesoADatos.InscripcionData;
import uni.AccesoADatos.MateriaData;
import uni.Entidades.Alumno;
import uni.Entidades.Inscripcion;
import uni.Entidades.Materia;


public class VistaInscripcion extends javax.swing.JInternalFrame {

    private List<Materia> listaM;
    private List<Alumno> listaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    
    private DefaultTableModel modelo;
    
    
    
    public VistaInscripcion() {
        initComponents();
        
        aData = new AlumnoData();
        listaA = aData.listarAlumnos();
        modelo = new DefaultTableModel();
        cargarAlumno();
        armarCabeceraTabla();
        
        inscData = new InscripcionData();
        mData = new MateriaData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jrbMInscriptas = new javax.swing.JRadioButton();
        jrbMNoInscriptas = new javax.swing.JRadioButton();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtMaterias);

        jrbMInscriptas.setText("MATERIAS INSCRIPTAS");
        jrbMInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMInscriptasActionPerformed(evt);
            }
        });

        jrbMNoInscriptas.setText("MATERIAS NO INSCRIPTAS");
        jrbMNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMNoInscriptasActionPerformed(evt);
            }
        });

        jbInscribir.setText("INSCRIBIR");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnular.setText("ANULAR");
        jbAnular.setEnabled(false);
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("FORMULARIO DE INSCRIPCION");

        jLabel3.setText("ALUMNO");

        jLabel4.setText("LISTADO DE MATERIAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbInscribir)
                        .addGap(41, 41, 41)
                        .addComponent(jbAnular)
                        .addGap(48, 48, 48)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jrbMInscriptas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbMNoInscriptas))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMInscriptas)
                    .addComponent(jrbMNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnular)
                    .addComponent(jbSalir))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbMInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMInscriptasActionPerformed
        borrarFilaTabla();
        jrbMNoInscriptas.setSelected(false);
        cargarDatosInscriptos();        
        jbAnular.setEnabled(true);
        jbInscribir.setEnabled(false);
    }//GEN-LAST:event_jrbMInscriptasActionPerformed

    private void jrbMNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMNoInscriptasActionPerformed
        borrarFilaTabla();
        jrbMInscriptas.setSelected(false);
        cargarDatosNoInscriptos();        
        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(true);
    }//GEN-LAST:event_jrbMNoInscriptasActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        int filaSeleccionada = jtMaterias.getSelectedRow();
        if(filaSeleccionada != -1){
            Alumno a = (Alumno) jcbAlumnos.getSelectedItem();
            
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String) modelo.getValueAt(filaSeleccionada, 1);
            int anioMateria = (Integer) modelo.getValueAt(filaSeleccionada, 2);
            Materia m = new Materia (idMateria, nombreMateria, anioMateria, true);
            
            Inscripcion i = new Inscripcion(a, m, 0);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        int filaSeleccionada = jtMaterias.getSelectedRow();
        if(filaSeleccionada != -1){
            Alumno a = (Alumno) jcbAlumnos.getSelectedItem();
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            inscData.borrarInscripcion(a.getIdAlumno(), idMateria);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jbAnularActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JRadioButton jrbMInscriptas;
    private javax.swing.JRadioButton jrbMNoInscriptas;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables

    private void cargarAlumno(){    //CARGA COMBOBOX
        for(Alumno item : listaA){
            jcbAlumnos.addItem(item);
        }
    }
    
    private void armarCabeceraTabla(){
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("NOMBRE");
        filaCabecera.add("AÑO");
        for(Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jtMaterias.setModel(modelo);
    }
    
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount()-1;        
        for(int i = indice; i >= 0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void cargarDatosNoInscriptos(){
        Alumno select = (Alumno) jcbAlumnos.getSelectedItem();
        listaM = inscData.obtenerMateriasNOCursadas(select.getIdAlumno());
        for(Materia m: listaM){
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    }
    
    private void cargarDatosInscriptos(){
        Alumno select = (Alumno) jcbAlumnos.getSelectedItem();
        List<Materia> lista = inscData.obtenerMateriasCursadas(select.getIdAlumno());
        for(Materia m : lista){
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    }
}

