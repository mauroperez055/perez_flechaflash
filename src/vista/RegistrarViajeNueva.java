
package vista;

import control.ColectivoData;
import control.LugarData;
import control.ViajeData;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Colectivo;
import modelo.Lugar;
import modelo.Viaje;


public class RegistrarViajeNueva extends javax.swing.JInternalFrame {

    private ArrayList<Colectivo> colectivosActivos;
    private ColectivoData colectivoData;
    private Colectivo colectivoSeleccionado;
    private String horaSalidaElegida;
    private LugarData lugarData;
    private ViajeData viajeData;
    private ArrayList<Lugar> lugaresCreados;
    
    public RegistrarViajeNueva(ColectivoData colectivoData, LugarData lugarData, ViajeData viajeData) throws SQLException {
        initComponents();
        this.colectivoData = colectivoData;
        this.lugarData = lugarData;
        this.viajeData = viajeData;
        this.colectivosActivos = colectivoData.listarColectivosActivos();
        
        txtHoraLlegada.setEditable(false);
        txtLugares.setEditable(false);
        
        VistaPrincipal.cargarCboxHorariosSalida(cboHoraSalida);
        
        for (Colectivo cole : colectivosActivos) {
            String colectivo = cole.getIdColectivo() + " - " + cole.getMatricula();
            cboColectivos.addItem(colectivo);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        cboColectivos = new javax.swing.JComboBox<>();
        txtPrecioBase = new javax.swing.JTextField();
        txtOrigen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLugares = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboHoraSalida = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtHoraLlegada = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnCalcHoraLlegada = new javax.swing.JButton();
        btnGuardarViaje = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Registrar Viaje");

        pnlDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Destino:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Asignar colectivo:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("Precio base:");

        txtDestino.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDestinoKeyTyped(evt);
            }
        });

        cboColectivos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cboColectivos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cboColectivos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboColectivosItemStateChanged(evt);
            }
        });

        txtPrecioBase.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        txtOrigen.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrigenKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Origen:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setText("Cantidad lugares:");

        txtLugares.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setText("Duración:");

        txtDuracion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel4.setText("minutos");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("$");

        cboHoraSalida.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cboHoraSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setText("Hora de salida:");

        txtHoraLlegada.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel13.setText("Hora de llegada:");

        btnCalcHoraLlegada.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCalcHoraLlegada.setText("Calcular ");
        btnCalcHoraLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcHoraLlegadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                .addComponent(txtOrigen))
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addComponent(cboHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboColectivos, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(txtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalcHoraLlegada)))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcHoraLlegada))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboColectivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLugares)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        btnGuardarViaje.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnGuardarViaje.setText("Guardar Viaje");
        btnGuardarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarViajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(btnGuardarViaje)
                .addGap(302, 302, 302))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarViaje)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrigenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrigenKeyTyped
        // TODO add your handling code here:
        VistaPrincipal.validarString(evt, txtOrigen);
    }//GEN-LAST:event_txtOrigenKeyTyped

    private void txtDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinoKeyTyped
        // TODO add your handling code here:
        VistaPrincipal.validarString(evt, txtDestino);
    }//GEN-LAST:event_txtDestinoKeyTyped

    private void txtDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionKeyTyped
        // TODO add your handling code here:
        VistaPrincipal.validarEnteros(evt, txtDuracion);
    }//GEN-LAST:event_txtDuracionKeyTyped

    private void btnGuardarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarViajeActionPerformed
        // TODO add your handling code here:
        if (!VistaPrincipal.validarCamposVacios(pnlDatos)) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos.", "Atención", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            String origen = txtOrigen.getText();
            origen = VistaPrincipal.formatearNombresApellidos(origen);
            String destino = txtDestino.getText();
            destino = VistaPrincipal.formatearNombresApellidos(destino);
            LocalTime horaSalida = LocalTime.parse(cboHoraSalida.getSelectedItem().toString());
            LocalTime horaLlegada = LocalTime.parse(txtHoraLlegada.getText());
            double precio = Double.parseDouble(txtPrecioBase.getText());
            
            Viaje viajeNuevo = new Viaje(origen, destino, Time.valueOf(horaSalida), Time.valueOf(horaLlegada), colectivoSeleccionado, precio, true);
            
            viajeData.cargarViaje(viajeNuevo);
            
            /* con este dato creo los lugares que corresponden*/
            int lugares = Integer.parseInt(txtLugares.getText());
            lugaresCreados = VistaPrincipal.crearLugares(lugares, viajeNuevo);
            
            for (Lugar lugar : lugaresCreados) {
                lugarData.crearLugar(lugar);
            }
            
            lugares = 0;
            
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) { // si ya existe la matricula
                JOptionPane.showMessageDialog(this, "Ya existe un viaje registrado con esos datos.", "Viaje duplicado", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el colectivo.", "Atención", JOptionPane.ERROR_MESSAGE);
                VistaPrincipal.limpiarCampos(pnlDatos);
            }
        }
    }//GEN-LAST:event_btnGuardarViajeActionPerformed

    private void cboColectivosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboColectivosItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() != java.awt.event.ItemEvent.SELECTED) {
                return;
        }
        
        String itemSeleccionado = cboColectivos.getSelectedItem().toString();
        
        if (itemSeleccionado.equals("--") || itemSeleccionado == null) {
            colectivoSeleccionado = null;
            return;
        }
        
        for (Colectivo cole : colectivosActivos) {
            String infoCole = cole.getIdColectivo() + " - " + cole.getMatricula();
            
            if (infoCole.equals(itemSeleccionado)) {
                colectivoSeleccionado = cole;
                break;
            }
        }
        
        if (colectivoSeleccionado == null) {
            return;
        }
        
        int lugares = colectivoSeleccionado.getCapacidad();
        txtLugares.setText(String.valueOf(lugares));
        
    }//GEN-LAST:event_cboColectivosItemStateChanged

    private void btnCalcHoraLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcHoraLlegadaActionPerformed
        // TODO add your handling code here:
        int duracion = Integer.parseInt(txtDuracion.getText());
        horaSalidaElegida = cboHoraSalida.getSelectedItem().toString();
        
       String horaLlegada = VistaPrincipal.calcularHoraLlegada(duracion, horaSalidaElegida);
       
       txtHoraLlegada.setText(horaLlegada);
    }//GEN-LAST:event_btnCalcHoraLlegadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcHoraLlegada;
    private javax.swing.JButton btnGuardarViaje;
    private javax.swing.JComboBox<String> cboColectivos;
    private javax.swing.JComboBox<String> cboHoraSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtHoraLlegada;
    private javax.swing.JTextField txtLugares;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPrecioBase;
    // End of variables declaration//GEN-END:variables
}
