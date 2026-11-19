
package vista;

import control.LugarData;
import control.PasajeData;
import control.PasajeroData;
import control.ViajeData;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Colectivo;
import modelo.Lugar;
import modelo.Pasaje;
import modelo.Pasajero;
import modelo.Viaje;

public class EmitirPasaje extends javax.swing.JInternalFrame {

    private ArrayList<Viaje> viajesActivos;
    private ViajeData viajeData;
    private ArrayList<String> horarios = new ArrayList<>();
    private Viaje viajeSeleccionado;
    private ArrayList<Pasajero> pasajerosActivos;
    private PasajeroData pasajeroData;
    private Pasajero pasajeroSeleccionado;
    private LugarData lugarData;
    private ArrayList<JButton> botoneAsientos;
    private JButton btnSeleccionado = null;
    private Lugar lugarSeleccionado = null;
    private PasajeData pasajeData;
    
    public EmitirPasaje(ViajeData viajeData, PasajeroData pasajeroData, LugarData lugarData, PasajeData pasajeData) throws SQLException {
        initComponents();
        this.viajeData = viajeData;
        this.pasajeroData = pasajeroData;
        this.pasajerosActivos = pasajeroData.listarPasajerosActivos();
        this.viajesActivos = viajeData.listarViajesActivos();
        this.lugarData = lugarData;
        this.pasajeData = pasajeData;

        txtDisponible.setEditable(false);
        txtVendido.setEditable(false);
        cargarCboViajes(cboViajes);
        cargarCboPasajeros(cboPasajeros);
        
        scrolPnl.setPreferredSize(new Dimension(826, 227));
        scrolPnl.setMinimumSize(new Dimension(826, 227));
        scrolPnl.setVerticalScrollBarPolicy(
            javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
        );

        scrolPnl.setHorizontalScrollBarPolicy(
            javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDisponible = new javax.swing.JTextField();
        txtVendido = new javax.swing.JTextField();
        scrolPnl = new javax.swing.JScrollPane();
        pnlAsientos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        txtTotalAsientos = new javax.swing.JTextField();
        pnlPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboPasajeros = new javax.swing.JComboBox<>();
        cboViajes = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Emitir Pasaje");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Elegir Asiento:");

        txtDisponible.setBackground(new java.awt.Color(0, 237, 0));
        txtDisponible.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtDisponible.setText("Disponible");

        txtVendido.setBackground(new java.awt.Color(255, 0, 0));
        txtVendido.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtVendido.setText("Vendido");

        pnlAsientos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlAsientosLayout = new javax.swing.GroupLayout(pnlAsientos);
        pnlAsientos.setLayout(pnlAsientosLayout);
        pnlAsientosLayout.setHorizontalGroup(
            pnlAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        pnlAsientosLayout.setVerticalGroup(
            pnlAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        scrolPnl.setViewportView(pnlAsientos);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Precio Final:");

        txtPrecio.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtPrecio.setText("$");

        btnConfirmar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnConfirmar.setText("Confirmar Viaje");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        txtTotalAsientos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Elegir Pasajero:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Elegir Viaje:");

        cboPasajeros.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cboPasajeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cboPasajeros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPasajerosItemStateChanged(evt);
            }
        });

        cboViajes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cboViajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cboViajes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboViajesItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboPasajeros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboViajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addGap(199, 199, 199))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrolPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(8, 8, 8)))
                                .addGap(161, 161, 161)
                                .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(txtVendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(txtTotalAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(scrolPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboViajesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboViajesItemStateChanged
        // TODO add your handling code here:        
        if (evt.getStateChange() != java.awt.event.ItemEvent.SELECTED) {
                return;
        }
        
        txtPrecio.setText("");
//        reiniciarVista();
        
        String viaje = (String) cboViajes.getSelectedItem();
        
        if (viaje == null || viaje.equals("--")) {
            reiniciarVista();
            return;
        }
        
        String[] partesViaje = viaje.split(" ");
        
        try {
            int idViaje = Integer.parseInt(partesViaje[partesViaje.length - 1]);
            viajeSeleccionado = viajeData.buscarViaje(idViaje);
            
            if (!viajeData.permiteVenta(viajeSeleccionado)) {
                JOptionPane.showMessageDialog(
                    this,
                    "El viaje ya pasó su fecha u horario de salida. No se pueden emitir pasajes.",
                    "Venta no permitida",
                    JOptionPane.WARNING_MESSAGE
                );

                limpiarSeleccionViaje();
                cboViajes.setSelectedIndex(0);
                return;
            }
            
//            LocalTime horaSalida = viajeSeleccionado.getHoraSalida().toLocalTime();

//            if (!horarioValido()) {
//                JOptionPane.showMessageDialog(this,
//                        "No puede seleccionar un viaje cuyo horario de salida ya pasó.",
//                        "Horario no disponible",
//                        JOptionPane.WARNING_MESSAGE);
//
//                cboViajes.setSelectedIndex(0);
//                return;
//            }
            
            txtPrecio.setText(txtPrecio.getText() + " " + viajeSeleccionado.getPrecio());
            
            Colectivo cole = viajeSeleccionado.getColectivo();
            txtTotalAsientos.setText(String.valueOf(cole.getCapacidad()) + " totales");
            
            ArrayList<Lugar> lugares = lugarData.listarLugaresPorViaje(viajeSeleccionado);
            
            botoneAsientos = VistaPrincipal.mostrarAsientos(lugares, pnlAsientos);
            
            seleccionarAsiento(botoneAsientos, lugares);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al seleccionar el viaje.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }//GEN-LAST:event_cboViajesItemStateChanged

    private void cboPasajerosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboPasajerosItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() != java.awt.event.ItemEvent.SELECTED) {
                return;
        }

        
        try {
            String item = cboPasajeros.getSelectedItem().toString();
            
            if (item == null || item.equals("--")) {
                reiniciarVista();
                return;
            }
            
            String[] partesItem = cboPasajeros.getSelectedItem().toString().split(" ");

            int dni = Integer.parseInt(partesItem[0]);
        
            pasajeroSeleccionado = pasajeroData.buscarPasajeroDni(dni);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo obtener el pasajero.", "Atención", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_cboPasajerosItemStateChanged

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        try {
            if (pasajeroSeleccionado == null) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un pasajero.", "Atención", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            if (viajeSeleccionado == null) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un viaje.", "Atención", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            if (lugarSeleccionado == null) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un asiento.", "Atención", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
//            horarioValido();
            
//            int idPasajero = pasajeroSeleccionado.getIdPasajero();
//            int idLugar = lugarSeleccionado.getIdLugar();
//            int idViaje = viajeSeleccionado.getIdViaje();
            LocalDate fechaVenta = LocalDate.now();
            LocalTime horaventa = LocalTime.now();
            double precio = viajeSeleccionado.getPrecio();
            boolean estado = true;
            
            Pasaje pasajeNuevo = new Pasaje(pasajeroSeleccionado, lugarSeleccionado, viajeSeleccionado, fechaVenta, horaventa, precio, estado);
            
            if (!viajeData.permiteVenta(viajeSeleccionado)) {
                JOptionPane.showMessageDialog(this,"No se pueden vender pasajes para un viaje que ya salió.","Venta no permitida",JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            pasajeData.crearPasaje(pasajeNuevo);
            
            JOptionPane.showMessageDialog(this, "Pasaje emitido", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            
            lugarData.bajaLogicaLugar(lugarSeleccionado.getIdLugar());
            
            reiniciarVista();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "no se pudo emitir el pasaje", "Atención", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void cargarCboViajes(JComboBox cboViajes) {
        cboViajes.removeAllItems();
        cboViajes.addItem("--");
        
        LocalTime hora;
        String fecha;
        
        for (Viaje viaje : viajesActivos) {
            
            fecha = formatearFecha(viaje.getFechaSalida());
            hora = viaje.getHoraSalida().toLocalTime();
            
            cboViajes.addItem(
                    viaje.getOrigen() + " >> " + 
                    viaje.getDestino() + " | horario: " + hora + " | Fecha: " + 
                    fecha + " | N° " + 
                    viaje.getIdViaje()
            );
        }

    }
    
    private String formatearFecha(LocalDate fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return fecha.format(formato);
    }
    
    private void cargarCboPasajeros(JComboBox cboPasajeros) throws SQLException {

        cboPasajeros.removeAllItems();
        cboPasajeros.addItem("--");
        
        
        for (Pasajero pasajero : pasajerosActivos) {
            
            cboPasajeros.addItem(
                    pasajero.getDni()+ " - " +
                    pasajero.getApellido() + " " + pasajero.getNombre()
            );
        }
    }
//    
//    private boolean horarioValido() {
//        if (viajeSeleccionado.getFechaSalida() != null && viajeSeleccionado.getFechaSalida().equals(LocalDate.now())) {
//
//            LocalTime horaSalida = viajeSeleccionado.getHoraSalida().toLocalTime();
//
//            if (horaSalida.isBefore(LocalTime.now())) {
//                    JOptionPane.showMessageDialog(this,
//                            "El horario de salida de este viaje ya pasó.",
//                            "Atención", JOptionPane.WARNING_MESSAGE);
//
//                    cboViajes.setSelectedIndex(0);
//                    return false;
//                }
//            }
//        
//        return true;
//    }
    
    private void limpiarSeleccionViaje() {

        viajeSeleccionado = null;
        lugarSeleccionado = null;
        btnSeleccionado = null;

        txtPrecio.setText("$");
        txtTotalAsientos.setText("");

        pnlAsientos.removeAll();
        pnlAsientos.revalidate();
        pnlAsientos.repaint();
    }
    
    private void seleccionarAsiento(ArrayList<JButton> botonesAsientos, ArrayList<Lugar> lugares) {
        
       for (int i = 0; i < botonesAsientos.size(); i++) {
           JButton btn = botonesAsientos.get(i);
           Lugar lugar = lugares.get(i);
           
           if (lugar.isActivo()) {
               configuracionAsientoDisponible(btn);
               
               btn.addActionListener(e -> {
                   if (btnSeleccionado != null) {
                       configuracionAsientoDisponible(btnSeleccionado);
                   }
                   
                   btnSeleccionado = btn;
                   lugarSeleccionado = lugar;
                   
                   btn.setBackground(new Color(70, 130, 180));
               });
           } else {
               configurarAsientoVendido(btn);
           }
       }
    }
    
    private void configuracionAsientoDisponible(JButton btn) {

        btn.setEnabled(true);
        btn.setBackground(new Color(144, 238, 144));
        btn.setForeground(Color.BLACK);

        // Cambiar el cursor a una mano
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Agregar borde
        btn.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    }
    
    private void configurarAsientoVendido(JButton btn) {

        btn.setEnabled(true);
        btn.setBackground(new Color(220, 80, 80));
        btn.setForeground(Color.WHITE);
        btn.setOpaque(true);
        btn.setContentAreaFilled(true);
        btn.setBorderPainted(true);
        btn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        btn.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        btn.setFocusable(false);

    }

    private void reiniciarVista() {
        txtTotalAsientos.setText("");
        txtPrecio.setText("$");
        pnlAsientos.removeAll();
        pnlAsientos.revalidate();
        pnlAsientos.repaint();
        btnSeleccionado = null;
        lugarSeleccionado = null;
                
        cboPasajeros.setSelectedIndex(0);
        cboViajes.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cboPasajeros;
    private javax.swing.JComboBox<String> cboViajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pnlAsientos;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scrolPnl;
    private javax.swing.JTextField txtDisponible;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotalAsientos;
    private javax.swing.JTextField txtVendido;
    // End of variables declaration//GEN-END:variables
}
