/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Objetos.Dado;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author esveb
 */
public class Ordenamiento extends javax.swing.JFrame {

    /**
     * Creates new form Ordenamiento
     */
    private int jugadores=0;
    private int turno=0;
    private Dado dado = new Dado();
    private Object[] ordenJugadores;
    
    public Ordenamiento(int jugadores) {
        initComponents();
        this.jugadores = jugadores;
        this.turno = 1;
        ordenJugadores = new Object[jugadores];
        this.setTitle("Orden de Lanzamiento");
        this.setLocationRelativeTo(null);
        actualizarCampos(false, "--", "--");
        jLJugNum.setText(turno+"");
        llenarTabla();
        JOptionPane.showMessageDialog(this, "Bienvenidos!!\nPor favor lanze el dado cada jugador para decidir el orden ");
    }
    
    private void actualizarCampos(boolean continuar, String jugNum, String Dado){
        jBContinuar.setVisible(continuar);
        jLJugNum.setText(jugNum);
        dadoGrafico.setText(Dado);
    }
    
    private void llenarTabla(){
        DefaultTableModel modeloJugadores = (DefaultTableModel) jTablaOrden.getModel();
        for (int i = 0; i < jugadores; i++) {           
            modeloJugadores.addRow(new Object[] {(i+1),(0)});
        }
    }
    
    private void ordenarJugadores(){
        DefaultTableModel tablaPedidos = (DefaultTableModel) jTablaOrden.getModel();
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tablaPedidos);
        sorter.toggleSortOrder(1);
        jTablaOrden.setRowSorter(sorter);
        jTablaOrden.getRowSorter().toggleSortOrder(1);
        for(int i=0; i<jTablaOrden.getRowCount();i++){
            ordenJugadores[i]=jTablaOrden.getValueAt(i, 0);
            System.out.println(ordenJugadores[i]);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBLanzar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaOrden = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLJugNum = new javax.swing.JLabel();
        jBContinuar = new javax.swing.JButton();
        dadoGrafico = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Jugador");

        jBLanzar.setText("Lanzar");
        jBLanzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBLanzarMouseClicked(evt);
            }
        });

        jTablaOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugador", "Puntaje"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaOrden);
        if (jTablaOrden.getColumnModel().getColumnCount() > 0) {
            jTablaOrden.getColumnModel().getColumn(0).setResizable(false);
            jTablaOrden.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Orden de Tiro Actual");

        jLJugNum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLJugNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLJugNum.setText("--");

        jBContinuar.setText("Continuar");
        jBContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBContinuarMouseClicked(evt);
            }
        });

        dadoGrafico.setBackground(new java.awt.Color(255, 255, 255));
        dadoGrafico.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        dadoGrafico.setForeground(new java.awt.Color(255, 0, 0));
        dadoGrafico.setText("--");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jBContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dadoGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLJugNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(93, 93, 93))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBLanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLJugNum))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadoGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jBLanzar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBContinuar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLanzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLanzarMouseClicked
        // TODO add your handling code here:
        jLJugNum.setText(turno+"");
        dado.Lanzar();
        dadoGrafico.setText(dado.getCara());
        jTablaOrden.setValueAt(dado.getValor(), turno-1, 1);
        if(turno==jugadores){
            jBContinuar.setVisible(true);
            jBLanzar.setVisible(false);
            ordenarJugadores();
            JOptionPane.showMessageDialog(this, "Muy Bien!\nSe han decidido el Orden de los Jugadores.\nQue la Partida Empiece.");  
        }
        else{
            turno++;
        }
    }//GEN-LAST:event_jBLanzarMouseClicked

    private void jBContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBContinuarMouseClicked
        // TODO add your handling code here:
        Tablero juego = new Tablero(ordenJugadores);
        juego.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jBContinuarMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton dadoGrafico;
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBLanzar;
    private javax.swing.JLabel jLJugNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaOrden;
    // End of variables declaration//GEN-END:variables
}