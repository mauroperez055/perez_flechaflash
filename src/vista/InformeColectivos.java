
package vista;

import control.ColectivoData;
import control.LugarData;
import control.ViajeData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import modelo.Colectivo;
import modelo.Lugar;
import modelo.Viaje;

public class InformeColectivos extends javax.swing.JInternalFrame {

    private ViajeData viajeData;
    private ColectivoData colectivoData;
    private ArrayList<Viaje> viajes;
    private ArrayList<Colectivo> colectivos = new ArrayList<>();
    private String destinoElegido;
    private DefaultTableModel modelo;
    private LugarData lugarData;
    
    public InformeColectivos(ColectivoData colectivoData, ViajeData viajeData, LugarData lugarData) throws SQLException {
        initComponents();
        this.colectivoData = colectivoData;
        this.viajeData = viajeData;
        this.modelo = (DefaultTableModel) tblInforme.getModel();
        this.lugarData = lugarData;
        
        viajes = viajeData.listarViajes();
        cargarCboDestino(cboDestinos);
        VistaPrincipal.borraFilasTabla(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboDestinos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInforme = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Informe de Colectivos por Destino y Fecha");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("DESTINO:");

        cboDestinos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cboDestinos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cboDestinos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDestinosItemStateChanged(evt);
            }
        });

        tblInforme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Colectivo", "Matrícula", "Marca", "Modelo", "Capacidad", "Asientos Disponibles", "Chofer", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInforme);

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
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cboDestinos, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 333, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboDestinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDestinosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDestinosItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() != java.awt.event.ItemEvent.SELECTED) {
                return;
        }
        
        VistaPrincipal.borraFilasTabla(modelo);
        
        try {
            String seleccion = cboDestinos.getSelectedItem().toString();
            
            if (seleccion == null || seleccion.equals("--")) {
                VistaPrincipal.borraFilasTabla(modelo);
                return;
            }
            
            ArrayList<Viaje> viajesFiltrados = new ArrayList<>();
            
            for (Viaje viaje : viajes) {
                String opcion = viaje.getDestino() + " || " + formatearFecha(viaje.getFechaSalida()) + " || " + viaje.getHoraSalida();
                
                if (opcion.equals(seleccion)) {
                    viajesFiltrados.add(viaje);
                }
            }
            cargarTablaColectivos(viajesFiltrados);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cboDestinosItemStateChanged


    private void cargarCboDestino(JComboBox cboDestinos) {
        
        ArrayList<Viaje> viajesOrdenados = new ArrayList<>(viajes);

        viajesOrdenados.sort(
            Comparator.comparing(Viaje::getFechaSalida) // hace referencia al metodo 
        );

        cboDestinos.removeAllItems();
        cboDestinos.addItem("--");

        for (Viaje viaje : viajesOrdenados) {

            String fecha = formatearFecha(viaje.getFechaSalida());

            cboDestinos.addItem(
                viaje.getDestino() + " || " + 
                fecha + " || " +
                viaje.getHoraSalida()
            );
            
        }
    }
    
    private void cargarTablaColectivos(ArrayList<Viaje> viajesFiltrados) throws SQLException {

        VistaPrincipal.borraFilasTabla(modelo);
        
        for (Viaje viaje : viajesFiltrados) {
            Colectivo cole = viaje.getColectivo();
            ArrayList<Lugar> lugares = lugarData.listarLugaresPorViaje(viaje);
            int disponibles = 0;
            
            for (Lugar lugar : lugares) {
                if (lugar.isActivo()) {
                    disponibles++;
                }
            }
            
            modelo.addRow(new Object[] {
                cole.getIdColectivo(),
                cole.getMatricula(),
                cole.getMarca(), 
                cole.getModelo(),
                cole.getCapacidad(),
                disponibles,
                cole.getChofer(),
                cole.isActivo() ? "Activo" : "Inactivo"
            });
        }
        
    }
    
    private String formatearFecha(LocalDate fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return fecha.format(formato);
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboDestinos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInforme;
    // End of variables declaration//GEN-END:variables
}
