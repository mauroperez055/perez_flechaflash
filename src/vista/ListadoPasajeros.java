
package vista;

import control.PasajeroData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pasajero;

public class ListadoPasajeros extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private PasajeroData pasajeroData;
    private ArrayList<Pasajero> pasajeros;
    
    public ListadoPasajeros(PasajeroData pasajeroData) {
        initComponents();
        this.modelo = (DefaultTableModel) tblPasajeros.getModel();
        this.pasajeroData = pasajeroData;
        
        VistaPrincipal.borraFilasTabla(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbtnTodos = new javax.swing.JRadioButton();
        rbtnActivos = new javax.swing.JRadioButton();
        rbtnInactivos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPasajeros = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Listado de pasajeros");

        buttonGroup1.add(rbtnTodos);
        rbtnTodos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rbtnTodos.setText("Todos");
        rbtnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnActivos);
        rbtnActivos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rbtnActivos.setText("Activos");
        rbtnActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnActivosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnInactivos);
        rbtnInactivos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rbtnInactivos.setText("Inactivos");
        rbtnInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnInactivosActionPerformed(evt);
            }
        });

        tblPasajeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Pasajero", "Dni", "Nombre", "Apellido", "Correo", "Telefono", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPasajeros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(rbtnTodos)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnActivos)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnInactivos)))
                        .addGap(0, 417, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnTodos)
                    .addComponent(rbtnActivos)
                    .addComponent(rbtnInactivos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTodosActionPerformed
        // TODO add your handling code here:
        VistaPrincipal.borraFilasTabla(modelo);
        try {
            pasajeros = pasajeroData.listarTodosLosPasajeros();
            
           VistaPrincipal.cargarTablaPasajeros(pasajeros, tblPasajeros);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar la tabla.", "Atención", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_rbtnTodosActionPerformed

    private void rbtnActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnActivosActionPerformed
        // TODO add your handling code here:
        VistaPrincipal.borraFilasTabla(modelo);
        try {
            pasajeros = pasajeroData.listarPasajerosActivos();
            
           VistaPrincipal.cargarTablaPasajeros(pasajeros, tblPasajeros);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar la tabla.", "Atención", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_rbtnActivosActionPerformed

    private void rbtnInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnInactivosActionPerformed
        // TODO add your handling code here:
        VistaPrincipal.borraFilasTabla(modelo);
        try {
            pasajeros = pasajeroData.listarPasajerosInactivos();
            
           VistaPrincipal.cargarTablaPasajeros(pasajeros, tblPasajeros);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar la tabla.", "Atención", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_rbtnInactivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnActivos;
    private javax.swing.JRadioButton rbtnInactivos;
    private javax.swing.JRadioButton rbtnTodos;
    private javax.swing.JTable tblPasajeros;
    // End of variables declaration//GEN-END:variables
}
