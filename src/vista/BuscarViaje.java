
package vista;

import control.ColectivoData;
import control.LugarData;
import control.ViajeData;
import javax.swing.JOptionPane;
import modelo.Viaje;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.JComboBox;
import modelo.Colectivo;
import modelo.Lugar;

public class BuscarViaje extends javax.swing.JInternalFrame {

    private ColectivoData colectivoData;
    private Viaje viajeEncontrado;
    private ViajeData viajeData;
    private ArrayList<Colectivo> colectivosActivos;
    private Colectivo coleElegido;
    private ArrayList<Lugar> lugaresCreados;
    private LugarData lugarData;
    private Viaje viajeActualizado;
    private LocalTime horaSalidaElegida;
    
    public BuscarViaje(ViajeData viajeData, ColectivoData colectivoData, LugarData lugarData) throws SQLException {
        initComponents();
        this.viajeData = viajeData;
        this.colectivoData = colectivoData;
        this.colectivosActivos = colectivoData.listarColectivosActivos();
        this.lugarData = lugarData;
        
        VistaPrincipal.desActivarCampos(pnlDatos, false);
        VistaPrincipal.desactivarBotones(pnlButtons);
       txtDuracion.setEditable(false);
       btnCambiarHoraSalida.setEnabled(false);
        btnCambiarCole.setEnabled(false);
        chbxEstado.setEnabled(false);
        txtLugares.setEditable(false);
        txtHoraLlegada.setEditable(false);
//        txtHoraSalida.setEditable(false);
        txtDuracion.setEditable(false);
        
        cboColectivos.removeAllItems();
        cboColectivos.setEnabled(false);
        cboHoraSalida.removeAllItems();
        cboHoraSalida.setEnabled(false);
        
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
        cboColectivos = new javax.swing.JComboBox<>();
        btnCambiarHoraSalida = new javax.swing.JButton();
        txtDuracion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboHoraSalida = new javax.swing.JComboBox<>();
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
        btnCambiarCole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarColeActionPerformed(evt);
            }
        });

        cboColectivos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cboColectivos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboColectivosItemStateChanged(evt);
            }
        });

        btnCambiarHoraSalida.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCambiarHoraSalida.setText("Cambiar");
        btnCambiarHoraSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarHoraSalidaActionPerformed(evt);
            }
        });

        txtDuracion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setText("Duración:");

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel12.setText("minutos");

        cboHoraSalida.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cboHoraSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHoraSalidaActionPerformed(evt);
            }
        });

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
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbxEstado)
                                    .addComponent(txtLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboColectivos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnCambiarCole))
                            .addComponent(txtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(txtDestino))
                        .addGap(103, 103, 103))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(cboHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCambiarHoraSalida))
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)))
                        .addGap(96, 96, 96)))
                .addContainerGap(146, Short.MAX_VALUE))
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
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCambiarHoraSalida))))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnCambiarCole)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(cboColectivos)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBaja.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBaja.setText("Baja");

        btnGuardar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar Cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

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
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarViaje)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                btnCambiarHoraSalida.setEnabled(false);
                chbxEstado.setSelected(false);
                return;
            }

            if (viajeEncontrado != null) {
                if (viajeData.tienePasajes(viajeEncontrado.getIdViaje())) {
                    VistaPrincipal.desactivarBotones(pnlButtons);
                    btnCambiarHoraSalida.setEnabled(false);
                    cargarCboColes(cboColectivos);
                    cargarCboHorarioSalida(cboHoraSalida);
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
                    
                    cargarCboColes(cboColectivos);
                    cargarCboHorarioSalida(cboHoraSalida);
                    
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
            txtHoraLlegada.setText(horaLlegada.withSecond(0).withNano(0).toString());
            
            long duracion = ChronoUnit.MINUTES.between(horaSalida, horaLlegada);
            
            if (duracion < 0) {
                duracion += 1440;
            }
            
            txtDuracion.setText(String.valueOf(duracion));
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
        btnCambiarHoraSalida.setEnabled(false);
        btnCambiarCole.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        VistaPrincipal.desActivarCampos(pnlDatos, true);
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnCambiarCole.setEnabled(true);
        cboColectivos.setEnabled(false);
        cboHoraSalida.setEnabled(false);
//        btnCalcularHoraLlegada.setEnabled(true);
        btnCambiarHoraSalida.setEnabled(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (!VistaPrincipal.validarCamposVaciosSinCombo(pnlDatos)) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos.", "Atención", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int idViaje = viajeEncontrado.getIdViaje();
            String origen = VistaPrincipal.formatearNombresApellidos(txtOrigen.getText());
            String destino = VistaPrincipal.formatearNombresApellidos(txtDestino.getText());
            LocalTime horaSalidaElegida = LocalTime.parse(cboHoraSalida.getSelectedItem().toString());
            int duracion = Integer.parseInt(txtDuracion.getText());
            LocalTime horaLlegada = horaSalidaElegida.plusMinutes(duracion);
            
            double precio = Double.parseDouble(txtPrecio.getText());
            boolean estado = viajeEncontrado.isActivo();
            
            // Si no se seleccionó otro colectivo, conservo el original
            if (coleElegido == null) {
                coleElegido = viajeEncontrado.getColectivo();
            }
            
            viajeActualizado = new Viaje(idViaje, origen, destino, Time.valueOf(horaSalidaElegida), Time.valueOf(horaLlegada), coleElegido, precio, estado);
            
            /* verifico que el colectivo que elegi este disponible */
            String error = viajeData.verificarDisponibilidad(viajeActualizado);
            
            if (error != null) {
                JOptionPane.showMessageDialog(this, error, "Error de disponiblidad", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            boolean cambioDeColectivo = viajeEncontrado.getColectivo().getIdColectivo() != coleElegido.getIdColectivo();
            
            // si cambie de colectivo
            if (cambioDeColectivo) {
                /* elimino los lugares creados por el colectivo anterior */
                viajeData.eliminarLugaresAnteriores(idViaje);

                /* creo los lugares correspondientes al colectivo nuevo*/
                int capacidad = Integer.parseInt(txtLugares.getText());
                lugaresCreados = VistaPrincipal.crearLugares(capacidad, viajeEncontrado);
                
                for (Lugar lugar : lugaresCreados) {
                    lugarData.crearLugar(lugar);
                }
                
                viajeData.actualizarViaje(viajeActualizado);
                
                JOptionPane.showMessageDialog(this, "El viaje fue actualizado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                
                /* reinicio la vista*/
                VistaPrincipal.limpiarCampos(pnlDatos);
                VistaPrincipal.desActivarCampos(pnlDatos, false);
                chbxEstado.setSelected(false);
                txtBuscarViaje.setText("");
                VistaPrincipal.desactivarBotones(pnlButtons);
                btnCambiarCole.setEnabled(false);
                btnCambiarHoraSalida.setEnabled(false);
                
                cboColectivos.removeAllItems();
                cboHoraSalida.removeAllItems();
                
                viajeEncontrado = null;
                viajeActualizado = null;
                coleElegido = null;
            } 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar el viaje", "Atención", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCambiarColeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarColeActionPerformed
        // TODO add your handling code here:
        cboColectivos.setEnabled(true);
    }//GEN-LAST:event_btnCambiarColeActionPerformed

    private void cboColectivosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboColectivosItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() != java.awt.event.ItemEvent.SELECTED) {
                return;
        }

        try {
            String matriculaColeElegido = cboColectivos.getSelectedItem().toString().split(" - ")[1].trim();
            coleElegido = colectivoData.buscarColectivoMatricula(matriculaColeElegido);
            
            int capacidadColeElegido = coleElegido.getCapacidad();
            txtLugares.setText(String.valueOf(capacidadColeElegido));
        } catch (SQLException ex) {
            System.getLogger(BuscarViaje.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_cboColectivosItemStateChanged

    private void btnCambiarHoraSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarHoraSalidaActionPerformed
        // TODO add your handling code here:
        cboHoraSalida.setEnabled(true);
    }//GEN-LAST:event_btnCambiarHoraSalidaActionPerformed

    private void cboHoraSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHoraSalidaActionPerformed
        // TODO add your handling code here:
        if (cboHoraSalida.getSelectedItem() == null || txtDuracion.getText().isEmpty()) {
            return;
        }
        
        LocalTime horaSalida = LocalTime.parse(cboHoraSalida.getSelectedItem().toString());
        int duracion = Integer.parseInt(txtDuracion.getText());

        LocalTime horaLlegada = horaSalida.plusMinutes(duracion);

        txtHoraLlegada.setText(horaLlegada.toString());
    }//GEN-LAST:event_cboHoraSalidaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {        
            int eleccion = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar el viaje?", "Eliminar Viaje", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        
            if (eleccion == 0) {
                viajeData.eliminarViaje(viajeEncontrado);
                JOptionPane.showMessageDialog(this, "Viaje eliminado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                VistaPrincipal.limpiarCampos(pnlDatos);
                VistaPrincipal.desactivarBotones(pnlButtons);
                chbxEstado.setSelected(false);
                return;
            } else if (eleccion == 1) {
                return;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar el viaje.", "Atención", JOptionPane.ERROR_MESSAGE);
            VistaPrincipal.limpiarCampos(pnlDatos);
            return;
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void actualizarCole(String colectivo, int capacidad) {
        
        txtLugares.setText(String.valueOf(capacidad));
    }
    
    private void cargarCboColes(JComboBox cboColectivos) {
        cboColectivos.removeAllItems();
        for (Colectivo cole : colectivosActivos) {
            cboColectivos.addItem(
                    cole.getIdColectivo() + " - " +
                    cole.getMatricula() + " - " +
                    cole.getCapacidad() + " lugares"
            );
        }

        for (int i = 0; i < cboColectivos.getItemCount(); i++) {
            String item = (String) cboColectivos.getItemAt(i);

            int idColectivo = Integer.parseInt(item.split(" - ")[0]);

            if (idColectivo == viajeEncontrado.getColectivo().getIdColectivo()) {
                cboColectivos.setSelectedIndex(i);
                break;
            }
        }

        cboColectivos.setEnabled(false);
    }
    
    public void cargarCboHorarioSalida(JComboBox cboHoraSalida) {
        cboHoraSalida.removeAllItems();
        VistaPrincipal.cargarCboxHorariosSalida(cboHoraSalida);
        
        LocalTime horaViaje = viajeEncontrado.getHoraSalida().toLocalTime();

        for (int i = 0;  i < cboHoraSalida.getItemCount();  i++) {
            String horario = cboHoraSalida.getItemAt(i).toString();

            LocalTime horaCombo = LocalTime.parse(horario);

            if (horaCombo.equals(horaViaje)) {
                cboHoraSalida.setSelectedIndex(i);
                break;
            }
        }
        
        this.cboHoraSalida.setEnabled(false);
    }
    
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
    private javax.swing.JComboBox<String> cboColectivos;
    private javax.swing.JComboBox<String> cboHoraSalida;
    private javax.swing.JCheckBox chbxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtHoraLlegada;
    private javax.swing.JTextField txtLugares;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
