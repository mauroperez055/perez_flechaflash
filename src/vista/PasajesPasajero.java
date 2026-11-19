
package vista;

import control.PasajeData;
import control.PasajeroData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pasajero;

public class PasajesPasajero extends javax.swing.JInternalFrame {

    private PasajeroData pasajeroData;
    private PasajeData pasajeData;
    private DefaultTableModel modelo;
    private ArrayList<Pasajero> pasajeros;
    private int anioActual;
    private int mesActual;
    
    
    public PasajesPasajero(PasajeroData pasajeroData, PasajeData pasajeData) throws SQLException {
        initComponents();
        this.pasajeroData = pasajeroData;
        this.pasajeData = pasajeData;
        this.modelo = (DefaultTableModel) tblPasajes.getModel();
        
        LocalDate fechaActual = LocalDate.now();

        anioActual = fechaActual.getYear();
        mesActual = fechaActual.getMonthValue() - 1;
        
        yearChooser.setYear(anioActual);
        yearChooser.setEnabled(false);
        
        mchMeses.setMonth(mesActual);
        
        cargarPasajeros();
        
        VistaPrincipal.borraFilasTabla(modelo);
        
        cargarPasajes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboPasajeros = new javax.swing.JComboBox<>();
        mchMeses = new com.toedter.calendar.JMonthChooser();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPasajes = new javax.swing.JTable();
        yearChooser = new com.toedter.calendar.JYearChooser();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Listado de Pasajes por Pasajero");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Pasajero:");

        cboPasajeros.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cboPasajeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cboPasajeros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPasajerosItemStateChanged(evt);
            }
        });

        mchMeses.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                mchMesesPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Mes:");

        tblPasajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Pasaje", "Fecha y Hora venta", "N° Asiento", "Origen", "Destino", "Fecha Salida", "Valor Final", "Colectivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPasajes);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Año:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cboPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(yearChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(mchMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cboPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(mchMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboPasajerosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboPasajerosItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() != java.awt.event.ItemEvent.SELECTED) {
                return;
        }
        
        cargarPasajes();
    }//GEN-LAST:event_cboPasajerosItemStateChanged

    private void mchMesesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_mchMesesPropertyChange
        // TODO add your handling code here:
        if (!"month".equals(evt.getPropertyName())) {
            return;
        }
        
        int mesSeleccionado = mchMeses.getMonth();

            if (mesSeleccionado > mesActual) {
                mchMeses.setMonth(mesActual);
                return;
            }

            cargarPasajes();
    }//GEN-LAST:event_mchMesesPropertyChange

    private void cargarPasajeros() {
        try {
            pasajeros = pasajeroData.listarTodosLosPasajeros();
            
            cboPasajeros.removeAllItems();

            cboPasajeros.addItem("--");
            
            for (Pasajero pas : pasajeros) {
                cboPasajeros.addItem(
                        pas.getNombre() + " "
                        + pas.getApellido() + " - "
                        + pas.getDni()
                );
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,"No se pudieron cargar los pasajeros: " + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cargarPasajes() {
        int indice = cboPasajeros.getSelectedIndex();

        if (indice <= 0) {
            VistaPrincipal.borraFilasTabla(modelo);
            return;
        }

        Pasajero pasajero = pasajeros.get(indice - 1);

        int mes = mchMeses.getMonth() + 1;

        int anio = anioActual;

        VistaPrincipal.borraFilasTabla(modelo);

        try {

            ArrayList<Object[]> pasajes =
                    pasajeData.listarPasajesPorPasajero(
                            pasajero.getIdPasajero(),
                            mes,
                            anio
                    );

            for (Object[] fila : pasajes) {
                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,"No se pudieron cargar los pasajes: " + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboPasajeros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JMonthChooser mchMeses;
    private javax.swing.JTable tblPasajes;
    private com.toedter.calendar.JYearChooser yearChooser;
    // End of variables declaration//GEN-END:variables
}
