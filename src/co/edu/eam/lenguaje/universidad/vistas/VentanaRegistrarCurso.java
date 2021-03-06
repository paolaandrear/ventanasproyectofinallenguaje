/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.lenguaje.universidad.vistas;

import co.edu.eam.excepcion.LogicaExcepciones;
import co.edu.eam.lenguaje.universidad.modelo.Asignatura;
import co.edu.eam.lenguaje.universidad.modelo.Curso;
import co.edu.eam.lenguaje.universidad.modelo.Estudiante;
import co.edu.eam.lenguaje.universidad.modelo.Horario;
import co.edu.eam.lenguaje.universidad.modelo.TipoAsignatura;
import co.edu.eam.lenguaje.universidad.modelo.Universidad;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class VentanaRegistrarCurso extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaRegistrarCurso
     */
    private Universidad log;
    Estudiante buscarEstu;
    Asignatura buscarAsig;
    
    public VentanaRegistrarCurso() {
        initComponents();
        setVisible(true);
        setMaximizable(false);
        setIconifiable(true);
        setClosable(true);
        setResizable(false);
        log = Universidad.getInstance();
        
    }
    
    private void limpiarCampos() {
        tfCedulaEstudiante.setText("");
        tfCodigoAsignatura.setText("");
        tfNombreAsignatura.setText("");
        tfCreditosAsignatura.setText("");
        tfTipoAsignatura.setText("");
        tfNombreEstudiante.setText("");
        tfCreditosEstudiante.setText("");
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
        tfCreditosEstudiante = new javax.swing.JTextField();
        tfNombreEstudiante = new javax.swing.JTextField();
        tfCedulaEstudiante = new javax.swing.JTextField();
        btnBuscarEstudiante = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCursos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfCodigoAsignatura = new javax.swing.JTextField();
        tfNombreAsignatura = new javax.swing.JTextField();
        tfCreditosAsignatura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfTipoAsignatura = new javax.swing.JTextField();
        btnBuscarAsignatura = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setTitle("Registrar Curso");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/eam/lenguaje/universidad/imagenes/registro.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estudiante"));

        jLabel1.setText("Cédula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Créditos Registrados");

        tfCreditosEstudiante.setEditable(false);

        tfNombreEstudiante.setEditable(false);

        tfCedulaEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCedulaEstudianteKeyPressed(evt);
            }
        });

        btnBuscarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/eam/lenguaje/universidad/imagenes/buscar.png"))); // NOI18N
        btnBuscarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCreditosEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(tfNombreEstudiante)
                    .addComponent(tfCedulaEstudiante))
                .addGap(44, 44, 44)
                .addComponent(btnBuscarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfCedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBuscarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCreditosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asignatura"));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cursos Asignatura"));

        tablaCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Horario"
            }
        ));
        jScrollPane1.setViewportView(tablaCursos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jLabel4.setText("Código");

        jLabel5.setText("Nombre");

        jLabel6.setText("Créditos");

        tfCodigoAsignatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCodigoAsignaturaKeyPressed(evt);
            }
        });

        tfNombreAsignatura.setEditable(false);

        tfCreditosAsignatura.setEditable(false);

        jLabel7.setText("Tipo");

        tfTipoAsignatura.setEditable(false);

        btnBuscarAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/eam/lenguaje/universidad/imagenes/buscar.png"))); // NOI18N
        btnBuscarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAsignaturaActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/eam/lenguaje/universidad/imagenes/check.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(tfCreditosAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTipoAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                            .addComponent(tfNombreAsignatura)
                            .addComponent(tfCodigoAsignatura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tfCodigoAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tfNombreAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfCreditosAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(tfTipoAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstudianteActionPerformed
        // TODO add your handling code here:
        if (tfCedulaEstudiante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el documento del estudiante");
            return;
        }
        buscarEstu = log.buscarEstu(tfCedulaEstudiante.getText());
        if (buscarEstu != null) {
            tfNombreEstudiante.setText(buscarEstu.getNombre());
            double cred = buscarEstu.calcularCreditos();
            tfCreditosEstudiante.setText(cred + "");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro ningun estudiante registrado con documento "
                    + tfCedulaEstudiante.getText());
            limpiarCampos();
        }

    }//GEN-LAST:event_btnBuscarEstudianteActionPerformed

    private void btnBuscarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAsignaturaActionPerformed
        // TODO add your handling code here:
        if (tfCodigoAsignatura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de la asignatura");
            return;
        }
        buscarAsig = log.buscarAsig(tfCodigoAsignatura.getText());
        if (buscarAsig != null) {
            tfNombreAsignatura.setText(buscarAsig.getNombre());
            tfCreditosAsignatura.setText(buscarAsig.getCreditos() + "");
            tfTipoAsignatura.setText(buscarAsig.getTipoAsignatura() + "");
            llenarTabla(buscarAsig);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro ninguna asignatura creada con codigo "
                    + tfCodigoAsignatura.getText());
            limpiarCampos();
        }
    }//GEN-LAST:event_btnBuscarAsignaturaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (tablaCursos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el curso que desea registrar");
            return;
        }
        if (buscarEstu != null) {
            DefaultTableModel model = (DefaultTableModel) tablaCursos.getModel();
            String codigo = (String) model.getValueAt(tablaCursos.getSelectedRow(), 0);
            Curso curso = log.buscarCursoPorCodigo(codigo);
            try {
                curso.crearRegistro(curso, buscarEstu);
                JOptionPane.showMessageDialog(null, "Se ha realizado el registro satisfactoriamente");
                tfCreditosEstudiante.setText(buscarEstu.calcularCreditos() + "");
            } catch (LogicaExcepciones ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    private void llenarTabla(Asignatura asignatura) {
        DefaultTableModel model = (DefaultTableModel) tablaCursos.getModel();
        model.setRowCount(0);
        List<Curso> lista = log.listarCursoAsig(asignatura);
        for (Curso curso : lista) {
            ArrayList<String> info = new ArrayList<>();
            info.add(curso.getCodigo());
            String horarios = "";
            for (Horario hor : curso.getHorarios()) {
                horarios += " ° " + hor.getDia().toString().substring(0, 2) + ":"
                        + hor.getHoraInicio() + "-" + hor.getHoraFinal();
            }
            info.add(horarios);
            model.addRow(info.toArray());
        }
    }
    
    private void validarNumeros(KeyEvent evento) {
        if (Character.isLetter((char) evento.getKeyChar())) {
            JOptionPane.showMessageDialog(null, "este campo no admite letras ");
            evento.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }

    private void tfCedulaEstudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCedulaEstudianteKeyPressed
        validarNumeros(evt);
    }//GEN-LAST:event_tfCedulaEstudianteKeyPressed

    private void tfCodigoAsignaturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoAsignaturaKeyPressed
        validarNumeros(evt);
    }//GEN-LAST:event_tfCodigoAsignaturaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarAsignatura;
    private javax.swing.JButton btnBuscarEstudiante;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCursos;
    private javax.swing.JTextField tfCedulaEstudiante;
    private javax.swing.JTextField tfCodigoAsignatura;
    private javax.swing.JTextField tfCreditosAsignatura;
    private javax.swing.JTextField tfCreditosEstudiante;
    private javax.swing.JTextField tfNombreAsignatura;
    private javax.swing.JTextField tfNombreEstudiante;
    private javax.swing.JTextField tfTipoAsignatura;
    // End of variables declaration//GEN-END:variables
}
