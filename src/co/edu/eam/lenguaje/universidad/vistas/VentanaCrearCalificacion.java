/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.lenguaje.universidad.vistas;

import co.edu.eam.excepcion.LogicaExcepciones;
import co.edu.eam.lenguaje.universidad.modelo.Asignatura;
import co.edu.eam.lenguaje.universidad.modelo.Curso;
import co.edu.eam.lenguaje.universidad.modelo.Evaluacion;
import co.edu.eam.lenguaje.universidad.modelo.Universidad;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class VentanaCrearCalificacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaCrearCalificacion
     */
    private Universidad log;
    Asignatura buscaAsig;

    public VentanaCrearCalificacion() {
        initComponents();
        setVisible(true);
        setMaximizable(false);
        setIconifiable(true);
        setClosable(true);
        setResizable(false);
        log = Universidad.getInstance();
    }

    private void limpiarCampos() {
        tfCodigoAsignatura.setText("");
        tfNombreAsignatura.setText("");
        tfNombreCalificacion.setText("");
        tfPorcCalificacion.setText("");
        tfPorcNoAsignado.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCodigoAsignatura = new javax.swing.JTextField();
        tfNombreAsignatura = new javax.swing.JTextField();
        btnBuscarAsignatura = new javax.swing.JButton();
        cbCurso = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNombreCalificacion = new javax.swing.JTextField();
        tfPorcCalificacion = new javax.swing.JTextField();
        tfPorcNoAsignado = new javax.swing.JTextField();
        btnAgregarCalificacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCalificaciones = new javax.swing.JTable();
        btnEliminarCalificacion = new javax.swing.JButton();

        setTitle("Administrar Calificaciones de Curso");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/eam/lenguaje/universidad/imagenes/cal.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asignatura"));

        jLabel1.setText("Código");

        jLabel2.setText("Nombre");

        jLabel3.setText("Curso");

        tfCodigoAsignatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCodigoAsignaturaKeyPressed(evt);
            }
        });

        tfNombreAsignatura.setEditable(false);

        btnBuscarAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/eam/lenguaje/universidad/imagenes/buscar.png"))); // NOI18N
        btnBuscarAsignatura.setToolTipText("Buscar");
        btnBuscarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAsignaturaActionPerformed(evt);
            }
        });

        cbCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCursoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCodigoAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(tfNombreAsignatura)
                    .addComponent(cbCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfCodigoAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNombreAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBuscarAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/eam/lenguaje/universidad/imagenes/bigcal.png"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Calificaciones Curso"));

        jLabel5.setText("Nombre");

        jLabel6.setText("Porcentaje");

        jLabel7.setText("No Asignado");

        tfPorcCalificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPorcCalificacionKeyPressed(evt);
            }
        });

        tfPorcNoAsignado.setEditable(false);
        tfPorcNoAsignado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPorcNoAsignadoKeyPressed(evt);
            }
        });

        btnAgregarCalificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/eam/lenguaje/universidad/imagenes/check.png"))); // NOI18N
        btnAgregarCalificacion.setToolTipText("Agregar");
        btnAgregarCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCalificacionActionPerformed(evt);
            }
        });

        tablaCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Porcentaje"
            }
        ));
        jScrollPane1.setViewportView(tablaCalificaciones);

        btnEliminarCalificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/eam/lenguaje/universidad/imagenes/cancel.png"))); // NOI18N
        btnEliminarCalificacion.setToolTipText("Eliminar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEliminarCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNombreCalificacion)
                            .addComponent(tfPorcCalificacion)
                            .addComponent(tfPorcNoAsignado, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfNombreCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfPorcCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAgregarCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfPorcNoAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarCalificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAsignaturaActionPerformed
        // TODO add your handling code here:
        if (tfCodigoAsignatura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de la asignatura");
            return;
        }
        buscaAsig = log.buscarAsig(tfCodigoAsignatura.getText());
        if (buscaAsig != null) {
            List<Curso> cursos = log.listarCursoAsig(buscaAsig);
            llenarComboCursos(cursos);
            tfNombreAsignatura.setText(buscaAsig.getNombre());
        } else {
            JOptionPane.showMessageDialog(null, "No se encuentra una asignatura registrado con codigo " + tfCodigoAsignatura.getText());
            limpiarCampos();
        }
    }//GEN-LAST:event_btnBuscarAsignaturaActionPerformed

    private void btnAgregarCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCalificacionActionPerformed
        // TODO add your handling code here:
        try {
            if (tfNombreCalificacion.getText().isEmpty() || tfPorcCalificacion.getText().isEmpty() || cbCurso.getSelectedIndex() < 1) {
                JOptionPane.showMessageDialog(null, "Seleccione un curso e ingrese los datos indicados",
                        "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            Curso curso = (Curso) cbCurso.getSelectedItem();
            String nombre = tfNombreCalificacion.getText();
            double porcentaje = Double.parseDouble(tfPorcCalificacion.getText());
            Evaluacion eval = new Evaluacion(curso, nombre, porcentaje);
            curso.crearEvaluacion(eval);
            JOptionPane.showMessageDialog(null, "Evaluación asignada correctamente");
            tfPorcNoAsignado.setText(String.valueOf(100 - curso.calcularPorcentajeEvaluaciones()));
            limpiarCamposEval();
            llenarTablaEvaluaciones(curso);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numérico entre 0 y 100 en el campo de porcentaje",
                    "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } catch (LogicaExcepciones e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarCalificacionActionPerformed

    private void llenarComboCursos(List<Curso> cursos) {
        cbCurso.removeAllItems();
        cbCurso.addItem("Seleccione un curso");
        for (Curso curso : cursos) {
            cbCurso.addItem(curso);
        }
    }


    private void tfCodigoAsignaturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoAsignaturaKeyPressed
        validarNumeros(evt);
    }//GEN-LAST:event_tfCodigoAsignaturaKeyPressed

    private void tfPorcCalificacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPorcCalificacionKeyPressed
        validarNumeros(evt);
    }//GEN-LAST:event_tfPorcCalificacionKeyPressed

    private void tfPorcNoAsignadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPorcNoAsignadoKeyPressed
        validarNumeros(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_tfPorcNoAsignadoKeyPressed

    private void cbCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCursoItemStateChanged
        // TODO add your handling code here:
        if (cbCurso.getSelectedIndex() == -1 || cbCurso.getSelectedIndex() == 0) {
            return;
        }
        Curso curso = (Curso) cbCurso.getSelectedItem();
        llenarTablaEvaluaciones(curso);
        tfPorcNoAsignado.setText(String.valueOf(100 - curso.calcularPorcentajeEvaluaciones()));
    }//GEN-LAST:event_cbCursoItemStateChanged

    private void llenarTablaEvaluaciones(Curso curso) {
        DefaultTableModel model = (DefaultTableModel) tablaCalificaciones.getModel();
        model.setRowCount(0);
        for (Evaluacion eval : curso.getEvaluaciones()) {
            model.addRow(new Object[]{eval.getNombre(), eval.getPorcentaje()});
        }
    }

    private void validarNumeros(KeyEvent evento) {
        if (Character.isLetter((char) evento.getKeyChar())) {
            JOptionPane.showMessageDialog(null, "este campo no admite letras ");
            evento.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }

    private void limpiarCamposEval() {
        tfNombreCalificacion.setText("");
        tfPorcCalificacion.setText("");
        DefaultTableModel model = (DefaultTableModel) tablaCalificaciones.getModel();
        model.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCalificacion;
    private javax.swing.JButton btnBuscarAsignatura;
    private javax.swing.JButton btnEliminarCalificacion;
    private javax.swing.JComboBox cbCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCalificaciones;
    private javax.swing.JTextField tfCodigoAsignatura;
    private javax.swing.JTextField tfNombreAsignatura;
    private javax.swing.JTextField tfNombreCalificacion;
    private javax.swing.JTextField tfPorcCalificacion;
    private javax.swing.JTextField tfPorcNoAsignado;
    // End of variables declaration//GEN-END:variables
}
