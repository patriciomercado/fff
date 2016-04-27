package BeerBomb;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class juego extends javax.swing.JFrame implements ActionListener {

        public void actionPerformed(ActionEvent e) {
         if (win == 44){
        ventanaFinal obj = new ventanaFinal();
        obj.setVisible(true);
        dispose();
         }
         else{
             jButton2.setText("No lo se :/");
             lock =1;
         }
}
       int lock = 0;
       int repetido=0;
       int n=44;  //numeros aleatorios
       int k=n; //auxiliar;
       int cont = 0;
       int p = 0;
       int win = 0;
        int[] numeros=new int[n];
        int[] resultado=new int[n];
        Random rnd=new Random();
        int res;
        public Timer t;
        
    public juego() {
        initComponents();
        for(int i=0;i<n;i++){
            numeros[i]=i+1;
        }
        for(int i=0;i<n;i++){
            res=rnd.nextInt(k);            
            resultado[i]=numeros[res];
            numeros[res]=numeros[k-1];
            k--;
        }
        t = new Timer(15000, (this));
        t.start();
    }
      
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Presiona Siguiente Para Continuar");
        jLabel1.setMaximumSize(new java.awt.Dimension(620, 43));
        jLabel1.setName(""); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 70, 770, 330);

        jButton1.setText("No lo se :/");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 470, 220, 70);

        jButton2.setText("Siguiente! :D");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(490, 470, 220, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Solo tienes 15 segundos para contestar!!!");
        jLabel4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel4ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 20, 380, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bomba obj = new bomba();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        t.stop();
        if (win==44){
        ventanaFinal obj = new ventanaFinal();
        obj.setVisible(true);
        dispose();           
        }
        else{
        if (lock == 1){
        bomba obj = new bomba();
        obj.setVisible(true);
        dispose();
        }
        else {
               switch (resultado[p]) {
                    case 1:  jLabel1.setText("Pregunta 1"); 
                        break;
                    case 2:  jLabel1.setText("Pregunta 2"); 
                        break;
                    case 3:  jLabel1.setText("Pregunta 3"); 
                        break;
                    case 4:  jLabel1.setText("Pregunta 4"); 
                         break;
                    case 5:  jLabel1.setText("Pregunta 5”"); 
                        break;
                    case 6:  jLabel1.setText("Pregunta 6"); 
                        break;
                    case 7:  jLabel1.setText("Pregunta 7"); 
                        break;
                    case 8:  jLabel1.setText("Pregunta 8"); 
                        break;
                    case 9:  jLabel1.setText("Pregunta 9");
                        break;
                    case 10: jLabel1.setText("Pregunta 10"); 
                        break;
                    case 11: jLabel1.setText("Pregunta 11"); 
                        break;
                    case 12: jLabel1.setText("Pregunta 12"); 
                        break;
                    case 13: jLabel1.setText("Pregunta 13"); 
                        break;
                    case 14: jLabel1.setText("Pregunta 14"); 
                        break;
                    case 15: jLabel1.setText("Pregunta 15"); 
                        break;
                    case 16: jLabel1.setText("Pregunta 16"); 
                        break;
                    case 17: jLabel1.setText("Pregunta 17"); 
                        break;
                    case 18: jLabel1.setText("Pregunta 18"); 
                        break;
                    case 19: jLabel1.setText("Pregunta 19"); 
                        break;
                    case 20: jLabel1.setText("Pregunta 20"); 
                        break;
                    case 21: jLabel1.setText("Pregunta 21"); 
                        break;
                    case 22: jLabel1.setText("Pregunta 22"); 
                        break;
                    case 23: jLabel1.setText("Pregunta 23"); 
                        break;
                    case 24: jLabel1.setText("Pregunta 24");
                        break;
                    case 25: jLabel1.setText("Pregunta 25"); 
                        break;
                    case 26: jLabel1.setText("Pregunta 26"); 
                        break;
                    case 27: jLabel1.setText("Pregunta 27"); 
                        break;
                    case 28: jLabel1.setText("Pregunta 28"); 
                        break;
                    case 29: jLabel1.setText("Pregunta 29"); 
                        break;
                    case 30: jLabel1.setText("Pregunta 30"); 
                        break;
                    case 31: jLabel1.setText("Pregunta 31"); 
                        break;
                    case 32: jLabel1.setText("Pregunta 32"); 
                        break;
                    case 33: jLabel1.setText("Pregunta 33"); 
                        break;
                    case 34: jLabel1.setText("Pregunta 34"); 
                        break;
                    case 35: jLabel1.setText("Pregunta 35"); 
                        break;
                    case 36: jLabel1.setText("Pregunta 36"); 
                        break;
                    case 37: jLabel1.setText("Pregunta 37"); 
                        break;
                    case 38: jLabel1.setText("Pregunta 38"); 
                        break;
                    case 39: jLabel1.setText("Pregunta 39");
                        break;
                    case 40: jLabel1.setText("Pregunta 40"); 
                        break;
                    case 41: jLabel1.setText("Pregunta 41"); 
                        break;
                    case 42: jLabel1.setText("Pregunta 42");
                        break;
                    case 43: jLabel1.setText("Pregunta 43");
                        break;
                    case 44: jLabel1.setText("Pregunta 44");
                        break;
                    case 45: jLabel1.setText("Pregunta 45");
                        break;
                    }
        }
        p++;
        win++;
        t.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    }


    private void jLabel4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel4ComponentShown

    }//GEN-LAST:event_jLabel4ComponentShown

    public static void delaysegundo(){
    try{
        Thread.sleep(1000);
    }catch(InterruptedException e){}
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
