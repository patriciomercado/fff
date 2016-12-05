/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzz;

import javax.swing.JOptionPane;

/**
 *
 * @author patricio mercado y Javier Vargas
 */
public class FramPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Fram1
     */
    public FramPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugar = new javax.swing.JButton();
        reglas = new javax.swing.JButton();
        ranking = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jugar.setText("Jugar");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        reglas.setText("Reglas");
        reglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reglasActionPerformed(evt);
            }
        });

        ranking.setText("Ranking");
        ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ranking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reglas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reglas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ranking)
                .addGap(18, 18, 18)
                .addComponent(salir)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Manejo del evento del boton Jugar, llama a la clase FramIngr el cual 
     * recibe los nombre de los jugadores.
     * @param evt 
     */
    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        // TODO add your handling code here:
        FramIngr fi = new FramIngr();
         setVisible(false);
        fi.setVisible(true);
    }//GEN-LAST:event_jugarActionPerformed

    /**
     * Boton que acciona el evento paramostrar un Message Dialog con las reglas del juego.
     * @param evt 
     */
    private void reglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reglasActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Este es un mensaje \n de Advertenfds",
        "REGLAS", JOptionPane.PLAIN_MESSAGE);
       
    }//GEN-LAST:event_reglasActionPerformed

    /**
     * Boton que acciona el evento de mostrar los mejores jugadores del juego.
     * @param evt 
     */
    private void rankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingActionPerformed
        DataManager dm = new DataManager();
        JOptionPane.showMessageDialog(rootPane, dm.ranking());
        // TODO add your handling code here:
    }//GEN-LAST:event_rankingActionPerformed

    /**
     * boton que acciona la salida del programa.
     * @param evt 
     */
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jugar;
    private javax.swing.JButton ranking;
    private javax.swing.JButton reglas;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}