
package vista;

import control.PasajeData;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Pasaje;

public class BuscarPasaje extends javax.swing.JInternalFrame {

    private PasajeData pasajeData;
    private Pasaje pasaje;
    
    public BuscarPasaje(PasajeData pasajeData) {
        initComponents();
        this.pasajeData = pasajeData;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumPasaje = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        pnlPasajeEncontrado = new javax.swing.JPanel();
        ImageIcon icono = new ImageIcon(getClass().getResource("/img/fondo.png"));
        Image miImagen = icono.getImage();
        mostrarComp = new javax.swing.JDesktopPane() {
            public void paintComponent (Graphics g) {
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
            }
        };

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Buscar Pasaje");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Ingresar número de pasaje:");

        txtNumPasaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumPasajeKeyTyped(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mostrarCompLayout = new javax.swing.GroupLayout(mostrarComp);
        mostrarComp.setLayout(mostrarCompLayout);
        mostrarCompLayout.setHorizontalGroup(
            mostrarCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mostrarCompLayout.setVerticalGroup(
            mostrarCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlPasajeEncontradoLayout = new javax.swing.GroupLayout(pnlPasajeEncontrado);
        pnlPasajeEncontrado.setLayout(pnlPasajeEncontradoLayout);
        pnlPasajeEncontradoLayout.setHorizontalGroup(
            pnlPasajeEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarComp, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlPasajeEncontradoLayout.setVerticalGroup(
            pnlPasajeEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarComp)
        );

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
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))
                        .addGap(0, 118, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlPasajeEncontrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(pnlPasajeEncontrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        String texto = txtNumPasaje.getText().trim();

        try {
            // 2. Buscar el pasaje
            pasaje = pasajeData.buscarPasaje(Integer.parseInt(texto));

            // 3. Comprobar si existe
            if (pasaje == null) {
                mostrarComp.removeAll();
                mostrarComp.revalidate();
                mostrarComp.repaint();

                JOptionPane.showMessageDialog(this, "No se encontró el pasaje.", "Atención", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Comprobante comprobante = new Comprobante();
            cargarComprobante(comprobante, pasaje);

            int ancho = mostrarComp.getWidth() - 40;
            int alto = mostrarComp.getHeight() - 40;

            comprobante.setSize(ancho, alto);

            int x = (mostrarComp.getWidth() - comprobante.getWidth()) / 2;
            int y = (mostrarComp.getHeight() - comprobante.getHeight()) / 2;

            comprobante.setLocation(x, y);

            // 6. Mostrar el comprobante
            mostrarComp.removeAll();
            mostrarComp.add(comprobante);

            comprobante.setVisible(true);
            comprobante.moveToFront();

            mostrarComp.revalidate();
            mostrarComp.repaint();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,"El número de pasaje ingresado no es válido.","Atención",JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"No se pudo obtener el pasaje: " + ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNumPasajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumPasajeKeyTyped
        // TODO add your handling code here:
        VistaPrincipal.validarEnteros(evt, txtNumPasaje);
    }//GEN-LAST:event_txtNumPasajeKeyTyped


    private void cargarComprobante(Comprobante comprobante, Pasaje pasaje) {
        comprobante.cargarDatos(pasaje);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JDesktopPane mostrarComp;
    private javax.swing.JPanel pnlPasajeEncontrado;
    private javax.swing.JTextField txtNumPasaje;
    // End of variables declaration//GEN-END:variables
}
