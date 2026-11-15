
package vista;

import control.ViajeData;
import javax.swing.JOptionPane;
import modelo.Viaje;
import java.sql.SQLException;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class BuscarViaje extends javax.swing.JInternalFrame {

    private Viaje viajeEncontrado;
    private ViajeData viajeData;
    
    public BuscarViaje(ViajeData viajeData) {
        initComponents();
        this.viajeData = viajeData;
        
        VistaPrincipal.desActivarCampos(pnlDatos, false);
        VistaPrincipal.desactivarBotones(pnlButtons);
        btnCambiarCole.setEnabled(false);
        btnCambiarHoraSalida.setEnabled(false);
        chbxEstado.setEnabled(false);
        txtLugares.setEditable(false);
        txtColectivos.setEditable(false);
        txtHoraLlegada.setEditable(false);
        txtHoraSalida.setEditable(false);
        txtDuracion.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarViaje = new javax.swing.JTextField();
        pnlDatos = new javax.swing.JPanel();
        txtPrecio = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtOrigen = new javax.swing.JTextField();
        txtColectivos = new javax.swing.JTextField();
        txtHoraSalida = new javax.swing.JTextField();
        txtHoraLlegada = new javax.swing.JTextField();
        txtLugares = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chbxEstado = new javax.swing.JCheckBox();
        btnCambiarCole = new javax.swing.JButton();
        btnCambiarHoraSalida = new javax.swing.JButton();
        txtDuracion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnBuscarViaje = new javax.swing.JButton();
        pnlButtons = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Buscar un viaje");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Ingresa el Id del viaje:");

        txtBuscarViaje.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtBuscarViaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarViajeKeyTyped(evt);
            }
        });

        pnlDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPrecio.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        txtDestino.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        txtOrigen.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        txtColectivos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        txtHoraSalida.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        txtHoraLlegada.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        txtLugares.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Origen:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Destino:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("Hora de salida:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Hora de llegada:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("Colectivo asignado:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Cantidad de lugares:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("Precio base:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setText("Estado:");

        btnCambiarCole.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCambiarCole.setText("Cambiar");

        btnCambiarHoraSalida.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCambiarHoraSalida.setText("Cambiar");

        txtDuracion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setText("Duración:");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbxEstado)
                            .addComponent(txtColectivos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCambiarCole))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(txtDestino)
                            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtHoraLlegada, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHoraSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCambiarHoraSalida)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnCambiarHoraSalida))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColectivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnCambiarCole))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(chbxEstado))
                .addContainerGap())
        );

        btnBuscarViaje.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBuscarViaje.setText("Buscar");
        btnBuscarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarViajeActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnAlta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAlta.setText("Alta");

        btnEliminar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");

        btnBaja.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBaja.setText("Baja");

        btnGuardar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar Cambios");

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnAlta)
                .addGap(18, 18, 18)
                .addComponent(btnBaja)
                .addContainerGap())
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnAlta)
                    .addComponent(btnBaja))
                .addContainerGap())
        );

        btnLimpiar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLimpiar)
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
                        .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarViaje)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarViaje))
                .addGap(18, 18, 18)
                .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarViajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarViajeKeyTyped
        // TODO add your handling code here:
        VistaPrincipal.validarEnteros(evt, txtBuscarViaje);
    }//GEN-LAST:event_txtBuscarViajeKeyTyped

    private void btnBuscarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarViajeActionPerformed
        // TODO add your handling code here:
        if (txtBuscarViaje.getText().equals("")) {
            return;
        }
        
        int id = Integer.parseInt(txtBuscarViaje.getText());
        
        try {
            viajeEncontrado = viajeData.buscarViaje(id);
            
            if (viajeEncontrado == null) {
                JOptionPane.showMessageDialog(this, "No se encontró el viaje.", "Atención", JOptionPane.WARNING_MESSAGE);
                VistaPrincipal.limpiarCampos(pnlDatos);
                VistaPrincipal.desactivarBotones(pnlButtons);
                return;
            }

            if (viajeEncontrado != null) {
                if (viajeData.tienePasajes(viajeEncontrado.getIdViaje())) {
                    VistaPrincipal.desactivarBotones(pnlButtons);
                    JOptionPane.showMessageDialog(
                        this, 
                        "El viaje tiene pasajes vendidos, por lo que no puede actualizar ningun dato.",
                        "Atención", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                
                } else {
                    btnActualizar.setEnabled(true);
                    btnGuardar.setEnabled(false);
                    btnEliminar.setEnabled(true);
                    btnAlta.setEnabled(false);
                    btnBaja.setEnabled(false);
                    VistaPrincipal.desActivarCampos(pnlDatos, false);
                    
                    if (viajeEncontrado.isActivo()) {
                        btnBaja.setEnabled(true);
                    } else {
                        btnAlta.setEnabled(true);
                    }
                }

            }
            
            txtOrigen.setText(viajeEncontrado.getOrigen());
            txtDestino.setText(viajeEncontrado.getDestino());
            
            LocalTime horaSalida = viajeEncontrado.getHoraSalida().toLocalTime();
            LocalTime horaLlegada = viajeEncontrado.getHoraLlegada().toLocalTime();
            txtHoraSalida.setText(horaSalida.withSecond(0).withNano(0).toString());
            txtHoraLlegada.setText(horaLlegada.withSecond(0).withNano(0).toString());
            
            long duracion = ChronoUnit.MINUTES.between(horaSalida, horaLlegada);
            
            if (duracion < 0) {
                duracion += 1440;
            }
            
            txtDuracion.setText(String.valueOf(duracion));

            String colectivo = viajeEncontrado.getColectivo().getIdColectivo() + 
                    " - " + viajeEncontrado.getColectivo().getMatricula() + 
                    " - " + viajeEncontrado.getColectivo().getCapacidad() + " lugares";
            
            txtColectivos.setText(colectivo);
            txtLugares.setText(String.valueOf(viajeEncontrado.getColectivo().getCapacidad()));
            txtPrecio.setText(String.valueOf(viajeEncontrado.getPrecio()));
            chbxEstado.setSelected(viajeEncontrado.isActivo());
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar el viaje.", "Atención", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnBuscarViajeActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        VistaPrincipal.limpiarCampos(pnlDatos);
        VistaPrincipal.desActivarCampos(pnlDatos, false);
        chbxEstado.setSelected(false);
        txtBuscarViaje.setText("");
        VistaPrincipal.desactivarBotones(pnlButtons);
        btnCambiarCole.setEnabled(false);
        btnCambiarHoraSalida.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        VistaPrincipal.desActivarCampos(pnlDatos, true);
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnCambiarCole.setEnabled(true);
        btnCambiarHoraSalida.setEnabled(true);
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnBuscarViaje;
    private javax.swing.JButton btnCambiarCole;
    private javax.swing.JButton btnCambiarHoraSalida;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chbxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField txtBuscarViaje;
    private javax.swing.JTextField txtColectivos;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtHoraLlegada;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtLugares;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
