
package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class VistaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPrincipal.class.getName());

    public VistaPrincipal() {
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/img/fondo.png"));
        Image miImagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane() {
            public void paintComponent (Graphics g) {
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        pnlForms = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnRegistrarPasajero = new javax.swing.JButton();
        btnBuscarPasajero = new javax.swing.JButton();
        btnListarPasajeros = new javax.swing.JButton();
        btnRegistrarCole = new javax.swing.JButton();
        btnBuscarCole = new javax.swing.JButton();
        btnListarCole = new javax.swing.JButton();
        btnRegistrarViaje = new javax.swing.JButton();
        btnListarViajes = new javax.swing.JButton();
        btnConsultarLugares = new javax.swing.JButton();
        btnEmitirPasaje = new javax.swing.JButton();
        btnBuscarPasaje = new javax.swing.JButton();
        btnListarPasajes = new javax.swing.JButton();
        btnInformesCole = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FlechaFlash");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(200, 70));
        setPreferredSize(new java.awt.Dimension(1100, 725));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlForms.setBackground(new java.awt.Color(0, 153, 204));
        pnlForms.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlForms.setAutoscrolls(true);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Panel De Navegación");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PASAJEROS");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("LUGARES");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("COLECTIVOS");

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("VIAJES");

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("PASAJES");

        btnRegistrarPasajero.setBackground(new java.awt.Color(49, 144, 127));
        btnRegistrarPasajero.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnRegistrarPasajero.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarPasajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-user.png"))); // NOI18N
        btnRegistrarPasajero.setText("Registrar pasajero");
        btnRegistrarPasajero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegistrarPasajero.setContentAreaFilled(false);
        btnRegistrarPasajero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarPasajero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPasajeroActionPerformed(evt);
            }
        });

        btnBuscarPasajero.setBackground(new java.awt.Color(49, 144, 127));
        btnBuscarPasajero.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnBuscarPasajero.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarPasajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-user1.png"))); // NOI18N
        btnBuscarPasajero.setText("Buscar pasajero");
        btnBuscarPasajero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscarPasajero.setContentAreaFilled(false);
        btnBuscarPasajero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarPasajero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPasajeroActionPerformed(evt);
            }
        });

        btnListarPasajeros.setBackground(new java.awt.Color(49, 144, 127));
        btnListarPasajeros.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnListarPasajeros.setForeground(new java.awt.Color(0, 0, 0));
        btnListarPasajeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list-users.png"))); // NOI18N
        btnListarPasajeros.setText("Listado de pasajeros");
        btnListarPasajeros.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnListarPasajeros.setContentAreaFilled(false);
        btnListarPasajeros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarPasajeros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListarPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPasajerosActionPerformed(evt);
            }
        });

        btnRegistrarCole.setBackground(new java.awt.Color(49, 144, 127));
        btnRegistrarCole.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnRegistrarCole.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarCole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-bus.png"))); // NOI18N
        btnRegistrarCole.setText("Registrar colectivo");
        btnRegistrarCole.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegistrarCole.setContentAreaFilled(false);
        btnRegistrarCole.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarCole.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrarCole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarColeActionPerformed(evt);
            }
        });

        btnBuscarCole.setBackground(new java.awt.Color(49, 144, 127));
        btnBuscarCole.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnBuscarCole.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarCole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-bus.png"))); // NOI18N
        btnBuscarCole.setText("Buscar colectivo");
        btnBuscarCole.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscarCole.setContentAreaFilled(false);
        btnBuscarCole.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCole.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarCole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarColeActionPerformed(evt);
            }
        });

        btnListarCole.setBackground(new java.awt.Color(49, 144, 127));
        btnListarCole.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnListarCole.setForeground(new java.awt.Color(0, 0, 0));
        btnListarCole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list.png"))); // NOI18N
        btnListarCole.setText("Listado de colectivos");
        btnListarCole.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnListarCole.setContentAreaFilled(false);
        btnListarCole.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarCole.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListarCole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarColeActionPerformed(evt);
            }
        });

        btnRegistrarViaje.setBackground(new java.awt.Color(49, 144, 127));
        btnRegistrarViaje.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnRegistrarViaje.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-travel.png"))); // NOI18N
        btnRegistrarViaje.setText("Registrar viaje");
        btnRegistrarViaje.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegistrarViaje.setContentAreaFilled(false);
        btnRegistrarViaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarViaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarViajeActionPerformed(evt);
            }
        });

        btnListarViajes.setBackground(new java.awt.Color(49, 144, 127));
        btnListarViajes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnListarViajes.setForeground(new java.awt.Color(0, 0, 0));
        btnListarViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list.png"))); // NOI18N
        btnListarViajes.setText("Listados de viajes");
        btnListarViajes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnListarViajes.setContentAreaFilled(false);
        btnListarViajes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarViajes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListarViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarViajesActionPerformed(evt);
            }
        });

        btnConsultarLugares.setBackground(new java.awt.Color(49, 144, 127));
        btnConsultarLugares.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnConsultarLugares.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultarLugares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list.png"))); // NOI18N
        btnConsultarLugares.setText("Consultar lugares");
        btnConsultarLugares.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnConsultarLugares.setContentAreaFilled(false);
        btnConsultarLugares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarLugares.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnEmitirPasaje.setBackground(new java.awt.Color(49, 144, 127));
        btnEmitirPasaje.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnEmitirPasaje.setForeground(new java.awt.Color(0, 0, 0));
        btnEmitirPasaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-ticket.png"))); // NOI18N
        btnEmitirPasaje.setText("Emitir pasaje");
        btnEmitirPasaje.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEmitirPasaje.setContentAreaFilled(false);
        btnEmitirPasaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmitirPasaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnBuscarPasaje.setBackground(new java.awt.Color(49, 144, 127));
        btnBuscarPasaje.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnBuscarPasaje.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarPasaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search1.png"))); // NOI18N
        btnBuscarPasaje.setText("Buscar pasaje");
        btnBuscarPasaje.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscarPasaje.setContentAreaFilled(false);
        btnBuscarPasaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarPasaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnListarPasajes.setBackground(new java.awt.Color(49, 144, 127));
        btnListarPasajes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnListarPasajes.setForeground(new java.awt.Color(0, 0, 0));
        btnListarPasajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list-ticket.png"))); // NOI18N
        btnListarPasajes.setText("Listado de pasajes");
        btnListarPasajes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnListarPasajes.setContentAreaFilled(false);
        btnListarPasajes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarPasajes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnInformesCole.setBackground(new java.awt.Color(49, 144, 127));
        btnInformesCole.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnInformesCole.setForeground(new java.awt.Color(0, 0, 0));
        btnInformesCole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/table.png"))); // NOI18N
        btnInformesCole.setText("Informe de colectivos ");
        btnInformesCole.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnInformesCole.setContentAreaFilled(false);
        btnInformesCole.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInformesCole.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInformesCole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesColeActionPerformed(evt);
            }
        });

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
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRegistrarPasajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBuscarPasajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnListarPasajeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRegistrarCole, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                        .addComponent(btnBuscarCole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnListarCole, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnListarViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConsultarLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInformesCole, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlFormsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator3)
                            .addGroup(pnlFormsLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(pnlFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEmitirPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnListarPasajes, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                .addComponent(btnRegistrarPasajero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarPasajero)
                .addGap(12, 12, 12)
                .addComponent(btnListarPasajeros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarCole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarCole)
                .addGap(12, 12, 12)
                .addComponent(btnListarCole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInformesCole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarViaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarViajes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarLugares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmitirPasaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarPasaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarPasajes)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlForms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
            .addComponent(pnlForms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPasajeroActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        RegistrarPasajero registrarPasajero = new RegistrarPasajero();
        registrarPasajero.setVisible(true);
        escritorio.add(registrarPasajero);
        registrarPasajero.moveToFront();
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_btnRegistrarPasajeroActionPerformed

    private void btnBuscarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPasajeroActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        BuscarPasajero buscarPasajero = new BuscarPasajero();
        buscarPasajero.setVisible(true);
        escritorio.add(buscarPasajero);
        buscarPasajero.moveToFront();
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_btnBuscarPasajeroActionPerformed

    private void btnListarPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPasajerosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        ListadoPasajeros listarPasajeros = new ListadoPasajeros();
        listarPasajeros.setVisible(true);
        escritorio.add(listarPasajeros);
        listarPasajeros.moveToFront();
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_btnListarPasajerosActionPerformed

    private void btnRegistrarColeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarColeActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        RegistrarCole registrarCole = new RegistrarCole();
        registrarCole.setVisible(true);
        escritorio.add(registrarCole);
        registrarCole.moveToFront();
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_btnRegistrarColeActionPerformed

    private void btnBuscarColeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarColeActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        BuscarCole buscarCole = new BuscarCole();
        buscarCole.setVisible(true);
        escritorio.add(buscarCole);
        buscarCole.moveToFront();
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_btnBuscarColeActionPerformed

    private void btnListarColeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarColeActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        ListadoColes listarColes = new ListadoColes();
        listarColes.setVisible(true);
        escritorio.add(listarColes);
        listarColes.moveToFront();
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_btnListarColeActionPerformed

    private void btnRegistrarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarViajeActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        RegistrarViaje registrarViaje = new RegistrarViaje();
        registrarViaje.setVisible(true);
        escritorio.add(registrarViaje);
        registrarViaje.moveToFront();
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_btnRegistrarViajeActionPerformed

    private void btnListarViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarViajesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        ListarViajes listarViajes = new ListarViajes();
        listarViajes.setVisible(true);
        escritorio.add(listarViajes);
        listarViajes.moveToFront();
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_btnListarViajesActionPerformed

    private void btnInformesColeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesColeActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        InformeColectivos informeColes = new InformeColectivos();
        informeColes.setVisible(true);
        escritorio.add(informeColes);
        informeColes.moveToFront();
        escritorio.revalidate();
        escritorio.repaint();
    }//GEN-LAST:event_btnInformesColeActionPerformed

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
    private javax.swing.JButton btnBuscarCole;
    private javax.swing.JButton btnBuscarPasaje;
    private javax.swing.JButton btnBuscarPasajero;
    private javax.swing.JButton btnConsultarLugares;
    private javax.swing.JButton btnEmitirPasaje;
    private javax.swing.JButton btnInformesCole;
    private javax.swing.JButton btnListarCole;
    private javax.swing.JButton btnListarPasajeros;
    private javax.swing.JButton btnListarPasajes;
    private javax.swing.JButton btnListarViajes;
    private javax.swing.JButton btnRegistrarCole;
    private javax.swing.JButton btnRegistrarPasajero;
    private javax.swing.JButton btnRegistrarViaje;
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
    private javax.swing.JPanel pnlForms;
    // End of variables declaration//GEN-END:variables
}
