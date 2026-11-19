
package vista;

import control.ViajeData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Viaje;

public class ListarViajes extends javax.swing.JInternalFrame {

    private ViajeData viajeData;
    private ArrayList<Viaje> viajes;
    private ArrayList<Viaje> viajesDesdeOrigen;
    private ArrayList<Viaje> viajesHaciaDestino;
    private ArrayList<String> origenes;
    private ArrayList<String> destinos;
    private DefaultTableModel modelo;
    private String origenElegido;
    private String destinoElegido;
    
    public ListarViajes(ViajeData viajeData) throws SQLException {
        initComponents();
        this.viajeData = viajeData;
        this.viajes = viajeData.listarViajes();
        this.origenes = viajeData.listarOrigenes();
        this.destinos = viajeData.listarDestinos();
        this.modelo = (DefaultTableModel) tblViajes.getModel();
        
        VistaPrincipal.borraFilasTabla(modelo);
        
        cboDestino.setEnabled(false);
        cboOrigen.setEnabled(false);
        
        cargarCbos(cboOrigen, cboDestino);
    }

    private void cargarCbos(JComboBox cboOrigen, JComboBox cboDestino) {
        for (String origen : origenes) {
            cboOrigen.addItem(origen);
        }
        
        for (String destino : destinos) {
            cboDestino.addItem(destino);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrCriterios = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboOrigen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViajes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        rbtnTodos = new javax.swing.JRadioButton();
        rbtnOrigen = new javax.swing.JRadioButton();
        rbtnDestino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        cboDestino = new javax.swing.JComboBox<>();

        setClosable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Listados de Viajes");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Selecciona un Origen:");

        cboOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cboOrigen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboOrigenItemStateChanged(evt);
            }
        });

        tblViajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID viaje", "Origen", "Destino", "Fecha Salida", "Hora Salida", "Hora Llegada", "Colectivo", "Chofer", "Precio base"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViajes);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel3.setText("Elegir el criterio para listar los viajes");

        btngrCriterios.add(rbtnTodos);
        rbtnTodos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rbtnTodos.setText("Todos");
        rbtnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTodosActionPerformed(evt);
            }
        });

        btngrCriterios.add(rbtnOrigen);
        rbtnOrigen.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rbtnOrigen.setText("Desde Origen");
        rbtnOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOrigenActionPerformed(evt);
            }
        });

        btngrCriterios.add(rbtnDestino);
        rbtnDestino.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rbtnDestino.setText("Hacia Destino");
        rbtnDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDestinoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Selecciona un Destino:");

        cboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cboDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDestinoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnTodos)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnOrigen)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnDestino))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 417, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbtnTodos)
                    .addComponent(rbtnOrigen)
                    .addComponent(rbtnDestino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTodosActionPerformed
        // TODO add your handling code here:
        cboOrigen.setEnabled(false);
        cboDestino.setEnabled(false);
        cboDestino.setSelectedIndex(0);
        cboOrigen.setSelectedIndex(0);
        VistaPrincipal.cargarTablaViajes(viajes, tblViajes);
    }//GEN-LAST:event_rbtnTodosActionPerformed

    private void rbtnOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOrigenActionPerformed
        // TODO add your handling code here:
        cboOrigen.setEnabled(true);
        cboDestino.setEnabled(false);
        cboDestino.setSelectedIndex(0);
        VistaPrincipal.borraFilasTabla(modelo);
    }//GEN-LAST:event_rbtnOrigenActionPerformed

    private void rbtnDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDestinoActionPerformed
        // TODO add your handling code here:
        cboOrigen.setEnabled(false);
        cboDestino.setEnabled(true);
        cboOrigen.setSelectedIndex(0);
        VistaPrincipal.borraFilasTabla(modelo);
    }//GEN-LAST:event_rbtnDestinoActionPerformed

    private void cboOrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboOrigenItemStateChanged
        // TODO add your handling code here:
        VistaPrincipal.borraFilasTabla(modelo);
        
        if (evt.getStateChange() != java.awt.event.ItemEvent.SELECTED) {
                return;
        }

        try {
            origenElegido = cboOrigen.getSelectedItem().toString();
        
            if (origenElegido.equals("--") || origenElegido == null) {
                return;
            }
            
            viajesDesdeOrigen = viajeData.listarViajeOrigen(origenElegido);
            
            VistaPrincipal.cargarTablaViajes(viajesDesdeOrigen, tblViajes);
        } catch (SQLException ex) {
            System.getLogger(ListarViajes.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }//GEN-LAST:event_cboOrigenItemStateChanged

    private void cboDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDestinoItemStateChanged
        // TODO add your handling code here:
        VistaPrincipal.borraFilasTabla(modelo);
        
        if (evt.getStateChange() != java.awt.event.ItemEvent.SELECTED) {
                return;
        }

        try {
            destinoElegido = cboDestino.getSelectedItem().toString();
        
            if (destinoElegido.equals("--") || destinoElegido == null) {
                return;
            }
            
            viajesHaciaDestino = viajeData.listarViajeDestino(destinoElegido);
            
            VistaPrincipal.cargarTablaViajes(viajesHaciaDestino, tblViajes);
        } catch (SQLException ex) {
            System.getLogger(ListarViajes.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_cboDestinoItemStateChanged



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngrCriterios;
    private javax.swing.JComboBox<String> cboDestino;
    private javax.swing.JComboBox<String> cboOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnDestino;
    private javax.swing.JRadioButton rbtnOrigen;
    private javax.swing.JRadioButton rbtnTodos;
    private javax.swing.JTable tblViajes;
    // End of variables declaration//GEN-END:variables
}
