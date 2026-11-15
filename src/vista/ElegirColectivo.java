
package vista;

import control.ColectivoData;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Colectivo;

public class ElegirColectivo extends javax.swing.JInternalFrame {

    private ColectivoData colectivoData;
    private ArrayList<Colectivo> colectivosActivos;
    
    public ElegirColectivo(ColectivoData colectivoData) throws SQLException {
        initComponents();
        this.colectivoData = colectivoData;
        this.colectivosActivos = colectivoData.listarColectivosActivos();
        
        for (Colectivo cole : colectivosActivos) {
            cboColectivos.addItem(cole.getIdColectivo() + " - " + cole.getMatricula() + " - " + cole.getCapacidad() + " lugares");
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboColectivos = new javax.swing.JComboBox<>();
        btnConfirmar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Seleccione un colectivo:");

        cboColectivos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        btnConfirmar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnConfirmar.setText("Confirmar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cboColectivos, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnConfirmar)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboColectivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnConfirmar)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cboColectivos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
