
package vista;

import control.ColectivoData;
import control.LugarData;
import control.ViajeData;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Colectivo;
import modelo.Lugar;
import modelo.Viaje;

public class ConsultarAsientos extends javax.swing.JInternalFrame {

    private ArrayList<Viaje> viajesActivos;
//    private ColectivoData colectivoData;
    private ViajeData viajeData;
    private Viaje viajeSeleccionado;
    private LugarData lugarData;
    
    public ConsultarAsientos(ViajeData viajeData, ColectivoData colectivoData, LugarData lugarData) throws SQLException {
        initComponents();
        this.viajeData = viajeData;
        this.viajesActivos = viajeData.listarViajesActivos();
        this.lugarData = lugarData;
//        this.colectivoData = colectivoData;

        txtColectivo.setEditable(false);
        cargarCboViajes(cboViajes);
        
        
        jScrollPane1.setPreferredSize(new Dimension(826, 227));
        jScrollPane1.setMinimumSize(new Dimension(826, 227));
        jScrollPane1.setVerticalScrollBarPolicy(
            javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
        );

        jScrollPane1.setHorizontalScrollBarPolicy(
            javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlAsientos = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        pnlDatos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoraSalida = new javax.swing.JTextField();
        txtHoraLlegada = new javax.swing.JTextField();
        pnlPrincipal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtColectivo = new javax.swing.JTextField();
        cboViajes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Consultar asientos disponibles y vendidos");

        jTextField1.setBackground(new java.awt.Color(0, 162, 0));
        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTextField1.setText("Disponible");

        jTextField2.setBackground(new java.awt.Color(255, 0, 0));
        jTextField2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTextField2.setText("Vendido");

        pnlAsientos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlAsientosLayout = new javax.swing.GroupLayout(pnlAsientos);
        pnlAsientos.setLayout(pnlAsientosLayout);
        pnlAsientosLayout.setHorizontalGroup(
            pnlAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        pnlAsientosLayout.setVerticalGroup(
            pnlAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnlAsientos);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("Hora de llegada:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Destino:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Hora de salida:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Origen:");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtOrigen)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoraLlegada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlDatosLayout.createSequentialGroup()
                            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(28, 28, 28))
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("Colectivo:");

        cboViajes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cboViajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cboViajes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboViajesItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Viaje:");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtColectivo))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboViajes, 0, 381, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboViajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(453, 453, Short.MAX_VALUE))
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboViajesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboViajesItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() != java.awt.event.ItemEvent.SELECTED) {
                return;
        }
        
        
        try {
            String itemSeleccionado = cboViajes.getSelectedItem().toString();

            if (itemSeleccionado == null || itemSeleccionado.equals("--")) {
                //aca podria reiniciar la vista
                VistaPrincipal.limpiarCampos(pnlDatos);
                txtColectivo.setText("");
                return;
            }

            String[] partesItem = itemSeleccionado.split(" | ");

            int idViaje = Integer.parseInt(partesItem[partesItem.length - 1]);

            viajeSeleccionado = viajeData.buscarViaje(idViaje);
            
            Colectivo cole = viajeSeleccionado.getColectivo();
            txtColectivo.setText(cole.getIdColectivo() + " - " + cole.getMatricula() + " - " + cole.getCapacidad() + " lugares");
            
            txtOrigen.setText(viajeSeleccionado.getOrigen());
            txtDestino.setText(viajeSeleccionado.getDestino());
            txtHoraSalida.setText(viajeSeleccionado.getHoraSalida().toString());
            txtHoraLlegada.setText(viajeSeleccionado.getHoraLlegada().toString());
            
            ArrayList<Lugar> lugares = lugarData.listarLugaresPorViaje(viajeSeleccionado);
            
            mostrarAsientos(lugares);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo obtener informacion del viaje.", "Atención", JOptionPane.ERROR_MESSAGE);
            //aca reinicio la vista tambien
            return;
        }

    }//GEN-LAST:event_cboViajesItemStateChanged

    private void mostrarAsientos(ArrayList<Lugar> lugares) {
        pnlAsientos.removeAll();
        
        pnlAsientos.setLayout(new java.awt.GridLayout(0, 5, 10, 10));
        
        for (Lugar lugar : lugares) {
            JButton btnAsiento = new JButton(String.valueOf(lugar.getNumeroAsiento()));
            btnAsiento.setPreferredSize(new Dimension(40, 35));
            
            if (lugar.isActivo()) {
                btnAsiento.setBackground(Color.GREEN);
            } else {
                btnAsiento.setBackground(Color.RED);
            }
            
            btnAsiento.setOpaque(true);
            btnAsiento.setBorderPainted(false);
            
            pnlAsientos.add(btnAsiento);
        }
        
        pnlAsientos.revalidate();
        pnlAsientos.repaint();
    }
    
    private void cargarCboViajes(JComboBox cboViajes) {
        LocalTime hora = LocalTime.of(00, 00);
        for (Viaje viaje : viajesActivos) {
            hora = viaje.getHoraSalida().toLocalTime();
            cboViajes.addItem(
                    viaje.getOrigen() + " >> " + 
                    viaje.getDestino() + " | horario: " + hora + " | N° " + 
                    viaje.getIdViaje()          
            );
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboViajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pnlAsientos;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtColectivo;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtHoraLlegada;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables
}
