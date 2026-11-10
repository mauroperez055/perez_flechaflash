
package vista;

import control.PasajeroData;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import modelo.Pasajero;

public class RegistrarPasajero extends javax.swing.JInternalFrame {

    private PasajeroData pasajeroData;
    
    public RegistrarPasajero(PasajeroData pasajeroData) {
        initComponents();
        this.pasajeroData = pasajeroData;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlDatosPasajero = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCodigoArea = new javax.swing.JTextField();
        btnGuardarPasajero = new javax.swing.JButton();

        setClosable(true);
        setTitle("Pasajero");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Registrar Pasajero");

        pnlDatosPasajero.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Apellido/s:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Nombre/s:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Dni:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("Correo:");

        txtCorreo.setToolTipText("ingrese el correo del pasajero");

        txtApellido.setToolTipText("ingrese apellido del pasajero");
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtDNI.setToolTipText("ingrese el dni del pasajero");
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        txtNombre.setToolTipText("ingrese nombre del pasajero");
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Teléfono:");

        txtTelefono.setToolTipText("ingrese el telefono del pasajero");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtCodigoArea.setToolTipText("codigo de area");

        javax.swing.GroupLayout pnlDatosPasajeroLayout = new javax.swing.GroupLayout(pnlDatosPasajero);
        pnlDatosPasajero.setLayout(pnlDatosPasajeroLayout);
        pnlDatosPasajeroLayout.setHorizontalGroup(
            pnlDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPasajeroLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(pnlDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosPasajeroLayout.createSequentialGroup()
                        .addComponent(txtCodigoArea)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtDNI)
                    .addComponent(txtCorreo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDatosPasajeroLayout.setVerticalGroup(
            pnlDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPasajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGuardarPasajero.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnGuardarPasajero.setText("Guardar pasajero");
        btnGuardarPasajero.setToolTipText("presione para guardar el pasajero");
        btnGuardarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPasajeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDatosPasajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addComponent(btnGuardarPasajero)
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pnlDatosPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarPasajero)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        // TODO add your handling code here:
        VistaPrincipal.validarEnteros(evt, txtDNI);
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        VistaPrincipal.validarString(evt, txtApellido);
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        VistaPrincipal.validarString(evt, txtNombre);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnGuardarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPasajeroActionPerformed
        // TODO add your handling code here:
        
        /*Valido los campos vacios*/
        if(!VistaPrincipal.validarCamposVacios(pnlDatosPasajero)){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos.", "Atención!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        /* Valido el correo antes de guardar*/
        if(!VistaPrincipal.validarCorreo(txtCorreo)) {
            JOptionPane.showMessageDialog(this, "El correo no tiene el formato correcto.", "Atención", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            String apellido = txtApellido.getText();
            String nombre = txtNombre.getText();
            int dni = Integer.parseInt(txtDNI.getText());
            String correo = txtCorreo.getText();
            String codigoArea = txtCodigoArea.getText();
            String telefono = txtTelefono.getText();
            
            String telefonoCompleto = codigoArea + "-" + telefono;
            
            /*formateo el apellido y nombre antes de guardarlo*/
            String apellidoFormateado = VistaPrincipal.formatearNombresApellidos(apellido);
            String nombreFormateado = VistaPrincipal.formatearNombresApellidos(nombre);
            
            Pasajero pasajeroNuevo = new Pasajero(dni, nombreFormateado, apellidoFormateado, correo, telefonoCompleto, true);
            
            pasajeroData.cargarPasajero(pasajeroNuevo);
            
            JOptionPane.showMessageDialog(this, "Pasajero guardado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            
            VistaPrincipal.limpiarCampos(pnlDatosPasajero);
            return;
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(this, "Ya existe un pasajero registrado con ese DNI.", "DNI duplicado", JOptionPane.WARNING_MESSAGE);
                VistaPrincipal.limpiarCampos(pnlDatosPasajero);
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el pasajero.", "Atención", JOptionPane.ERROR_MESSAGE);
                VistaPrincipal.limpiarCampos(pnlDatosPasajero);
            }
        }
    }//GEN-LAST:event_btnGuardarPasajeroActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        VistaPrincipal.validarEnteros(evt, txtTelefono);
    }//GEN-LAST:event_txtTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarPasajero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pnlDatosPasajero;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigoArea;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
