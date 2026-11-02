
package vista;

public class VistaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPrincipal.class.getName());

    public VistaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        pnlForms = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNuevoCole = new javax.swing.JLabel();
        lblBuscarPasajero = new javax.swing.JLabel();
        lblListarPasajeros = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNuevoPasajero = new javax.swing.JLabel();
        lblBuscarCole = new javax.swing.JLabel();
        lblListadoColes = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNuevoViaje = new javax.swing.JLabel();
        lblBuscarViaje = new javax.swing.JLabel();
        lblListadoViajes = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblNuevoLugar = new javax.swing.JLabel();
        lblBuscarLugar = new javax.swing.JLabel();
        lblListadoLugares = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblEmitirPasaje = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        lblBuscarLugar1 = new javax.swing.JLabel();
        lblListadoLugares1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FlechaFlash");
        setLocation(new java.awt.Point(200, 70));
        setPreferredSize(new java.awt.Dimension(1100, 725));
        setResizable(false);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlForms.setBackground(new java.awt.Color(49, 144, 127));
        pnlForms.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Panel De Navegación");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PASAJEROS");

        lblNuevoCole.setBackground(new java.awt.Color(0, 0, 0));
        lblNuevoCole.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblNuevoCole.setForeground(new java.awt.Color(0, 0, 0));
        lblNuevoCole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-bus.png"))); // NOI18N
        lblNuevoCole.setText("Registrar colectivo");
        lblNuevoCole.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblBuscarPasajero.setBackground(new java.awt.Color(0, 0, 0));
        lblBuscarPasajero.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblBuscarPasajero.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarPasajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-user1.png"))); // NOI18N
        lblBuscarPasajero.setText("Buscar pasajero");
        lblBuscarPasajero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblListarPasajeros.setBackground(new java.awt.Color(0, 0, 0));
        lblListarPasajeros.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblListarPasajeros.setForeground(new java.awt.Color(0, 0, 0));
        lblListarPasajeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list-users.png"))); // NOI18N
        lblListarPasajeros.setText("Listado de pasajeros");
        lblListarPasajeros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("LUGARES");

        lblNuevoPasajero.setBackground(new java.awt.Color(0, 0, 0));
        lblNuevoPasajero.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblNuevoPasajero.setForeground(new java.awt.Color(0, 0, 0));
        lblNuevoPasajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-user.png"))); // NOI18N
        lblNuevoPasajero.setText("Registrar pasajero");
        lblNuevoPasajero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNuevoPasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevoPasajeroMouseClicked(evt);
            }
        });

        lblBuscarCole.setBackground(new java.awt.Color(0, 0, 0));
        lblBuscarCole.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblBuscarCole.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarCole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-bus.png"))); // NOI18N
        lblBuscarCole.setText("Buscar colectivo");
        lblBuscarCole.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblListadoColes.setBackground(new java.awt.Color(0, 0, 0));
        lblListadoColes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblListadoColes.setForeground(new java.awt.Color(0, 0, 0));
        lblListadoColes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list.png"))); // NOI18N
        lblListadoColes.setText("Listado de colectivos");
        lblListadoColes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("COLECTIVOS");

        lblNuevoViaje.setBackground(new java.awt.Color(0, 0, 0));
        lblNuevoViaje.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblNuevoViaje.setForeground(new java.awt.Color(0, 0, 0));
        lblNuevoViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-travel.png"))); // NOI18N
        lblNuevoViaje.setText("Registrar viaje");
        lblNuevoViaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblBuscarViaje.setBackground(new java.awt.Color(0, 0, 0));
        lblBuscarViaje.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblBuscarViaje.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-travel.png"))); // NOI18N
        lblBuscarViaje.setText("Buscar viaje");
        lblBuscarViaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblListadoViajes.setBackground(new java.awt.Color(0, 0, 0));
        lblListadoViajes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblListadoViajes.setForeground(new java.awt.Color(0, 0, 0));
        lblListadoViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list.png"))); // NOI18N
        lblListadoViajes.setText("Listado de viajes");
        lblListadoViajes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("VIAJES");

        lblNuevoLugar.setBackground(new java.awt.Color(0, 0, 0));
        lblNuevoLugar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblNuevoLugar.setForeground(new java.awt.Color(0, 0, 0));
        lblNuevoLugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-seat.png"))); // NOI18N
        lblNuevoLugar.setText("Registrar lugar");
        lblNuevoLugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblBuscarLugar.setBackground(new java.awt.Color(0, 0, 0));
        lblBuscarLugar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblBuscarLugar.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarLugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        lblBuscarLugar.setText("Buscar lugar");
        lblBuscarLugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblListadoLugares.setBackground(new java.awt.Color(0, 0, 0));
        lblListadoLugares.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblListadoLugares.setForeground(new java.awt.Color(0, 0, 0));
        lblListadoLugares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list.png"))); // NOI18N
        lblListadoLugares.setText("Listado de lugares");
        lblListadoLugares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("PASAJES");

        lblEmitirPasaje.setBackground(new java.awt.Color(0, 0, 0));
        lblEmitirPasaje.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblEmitirPasaje.setForeground(new java.awt.Color(0, 0, 0));
        lblEmitirPasaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-ticket.png"))); // NOI18N
        lblEmitirPasaje.setText("Emitir pasaje");
        lblEmitirPasaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblBuscarLugar1.setBackground(new java.awt.Color(0, 0, 0));
        lblBuscarLugar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblBuscarLugar1.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscarLugar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search1.png"))); // NOI18N
        lblBuscarLugar1.setText("Buscar pasaje");
        lblBuscarLugar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblListadoLugares1.setBackground(new java.awt.Color(0, 0, 0));
        lblListadoLugares1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblListadoLugares1.setForeground(new java.awt.Color(0, 0, 0));
        lblListadoLugares1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list-ticket.png"))); // NOI18N
        lblListadoLugares1.setText("Listado de pasajes");
        lblListadoLugares1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlFormsLayout = new javax.swing.GroupLayout(pnlForms);
        pnlForms.setLayout(pnlFormsLayout);
        pnlFormsLayout.setHorizontalGroup(
            pnlFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormsLayout.createSequentialGroup()
                .addGroup(pnlFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormsLayout.createSequentialGroup()
                        .addGroup(pnlFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormsLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFormsLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(pnlFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFormsLayout.createSequentialGroup()
                                        .addGroup(pnlFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(pnlFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(lblNuevoPasajero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblBuscarPasajero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblListarPasajeros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblNuevoViaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblNuevoCole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblBuscarCole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblListadoColes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblBuscarViaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblListadoViajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblNuevoLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblBuscarLugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblListadoLugares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 79, Short.MAX_VALUE))
                                    .addComponent(lblEmitirPasaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBuscarLugar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblListadoLugares1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 155, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFormsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator5))))
                .addContainerGap())
        );
        pnlFormsLayout.setVerticalGroup(
            pnlFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNuevoPasajero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBuscarPasajero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblListarPasajeros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNuevoCole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBuscarCole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblListadoColes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNuevoViaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBuscarViaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblListadoViajes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNuevoLugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBuscarLugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblListadoLugares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmitirPasaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBuscarLugar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblListadoLugares1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlForms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlForms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNuevoPasajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoPasajeroMouseClicked
        // TODO add your handling code here:
        escritorio.removeAll();
        FormPasajero fPasajero = new FormPasajero();
        fPasajero.setVisible(true);
        escritorio.add(fPasajero);
        fPasajero.moveToFront();
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_lblNuevoPasajeroMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VistaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblBuscarCole;
    private javax.swing.JLabel lblBuscarLugar;
    private javax.swing.JLabel lblBuscarLugar1;
    private javax.swing.JLabel lblBuscarPasajero;
    private javax.swing.JLabel lblBuscarViaje;
    private javax.swing.JLabel lblEmitirPasaje;
    private javax.swing.JLabel lblListadoColes;
    private javax.swing.JLabel lblListadoLugares;
    private javax.swing.JLabel lblListadoLugares1;
    private javax.swing.JLabel lblListadoViajes;
    private javax.swing.JLabel lblListarPasajeros;
    private javax.swing.JLabel lblNuevoCole;
    private javax.swing.JLabel lblNuevoLugar;
    private javax.swing.JLabel lblNuevoPasajero;
    private javax.swing.JLabel lblNuevoViaje;
    private javax.swing.JPanel pnlForms;
    // End of variables declaration//GEN-END:variables
}
