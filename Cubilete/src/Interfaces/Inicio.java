/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Objetos.Imagen;
import static cubilete.Cubilete.MAX;
import javax.swing.JOptionPane;

/**
 *
 * @author esveb
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    private int jugadores = 0;
    private int Max = 10;
    public Inicio() {
        initComponents();
        Imagen imagen1 = new Imagen();
        jLImagen1.setIcon(imagen1.imagenAjustada(jLImagen1,"imagen1.gif"));
        this.repaint();
        this.setTitle("Cubilete - Simulación");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBSalir = new javax.swing.JButton();
        jBJugar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLImagen1 = new javax.swing.JLabel();
        jTextJugadores = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBInstrucciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jBSalir.setFont(new java.awt.Font("High Tower Text", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(153, 0, 0));
        jBSalir.setText("Salir...");
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
        });
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBJugar.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jBJugar.setForeground(new java.awt.Color(0, 102, 204));
        jBJugar.setText("JUGAR!!");
        jBJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBJugarMouseClicked(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextJugadores.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jTextJugadores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextJugadores.setText("2");

        jLabel1.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        jLabel1.setText("Numeros de Jugadores:");

        jLabel3.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        jLabel3.setText("¡Bienvenido al Cubilete!");

        jBInstrucciones.setFont(new java.awt.Font("High Tower Text", 1, 14)); // NOI18N
        jBInstrucciones.setForeground(new java.awt.Color(0, 102, 0));
        jBInstrucciones.setText("Instrucciones");
        jBInstrucciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBInstruccionesMouseClicked(evt);
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBSalir)
                                .addGap(81, 81, 81)
                                .addComponent(jBInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)))
                        .addComponent(jBJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextJugadores)
                                .addGap(3, 3, 3))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBInstrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                    .addComponent(jBJugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBJugarMouseClicked
        // TODO add your handling code here:
        boolean ok = true;
        do{
            try{
                jugadores = Integer.parseInt(jTextJugadores.getText());
                ok = true;
                if(!validaMAX(jugadores)){
                    ok = false;
                    JOptionPane.showMessageDialog(null, "Ingrese una cantidad minima de 2 jugadores y maxima de "+MAX+" jugadores");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Hay un error con el numero de jugadores!");
                System.out.println(e.getMessage());
                ok = false;
            }
        }while(!ok);
        if(validaMAX(jugadores)){
            new Ordenamiento(jugadores).setVisible(true);
            this.hide();
        }
    }//GEN-LAST:event_jBJugarMouseClicked

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jBInstruccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBInstruccionesMouseClicked
        // TODO add your handling code here:
        new Instrucciones().setVisible(true);
    }//GEN-LAST:event_jBInstruccionesMouseClicked

    private boolean validaMAX(int j){
        if(j<=Max&&j>=2)
            return true;
        else
            return false;
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBInstrucciones;
    private javax.swing.JButton jBJugar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLImagen1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextJugadores;
    // End of variables declaration//GEN-END:variables
}
