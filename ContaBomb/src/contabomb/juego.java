package contabomb;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class juego extends javax.swing.JFrame implements ActionListener {

        public void actionPerformed(ActionEvent e) {
         if (win == 44){
        win obj = new win();
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
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/background.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 800, 600);

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
        win obj = new win();
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
            case 1:  jLabel1.setText("¿Qué es una CUENTA?"); 
                     break;
            case 2:  jLabel1.setText("Tratamiento contable: “reserva legal”"); 
                     break;
            case 3:  jLabel1.setText("Tratamiento contable: “materias primas”"); 
                     break;
            case 4:  jLabel1.setText("¿Qué es el DEBE?"); 
                     break;
            case 5:  jLabel1.setText("Tratamiento contable: “letras en garantía”"); 
                     break;
            case 6:  jLabel1.setText("Tratamiento contable: “retención impuesto 2ª categoría”"); 
                     break;
            case 7:  jLabel1.setText("¿Qué es el HABER?"); 
                     break;
            case 8:  jLabel1.setText("Tratamiento contable: “amortización gastos de organización”"); 
                     break;
            case 9:  jLabel1.setText("¿Qué son los DEBITOS?");
                     break;
            case 10: jLabel1.setText("Tratamiento contable: “derecho de marca”"); 
                     break;
            case 11: jLabel1.setText("Tratamiento contable: “moneda extranjera”"); 
                     break;
            case 12: jLabel1.setText("Concepto: “abonar”"); 
                     break;
            case 13: jLabel1.setText("¿Qué es DEBITAR?"); 
                     break;
            case 14: jLabel1.setText("Tratamiento contable: “isapres”"); 
                     break;
            case 15: jLabel1.setText("¿Qué es ACREDITAR?"); 
                     break;
            case 16:  jLabel1.setText("Tratamiento contable: “seguros”"); 
                     break;
            case 17:  jLabel1.setText("¿Qué es el SALDO?"); 
                     break;
            case 18:  jLabel1.setText("Tratamiento contable: “interés percibido”"); 
                     break;
            case 19:  jLabel1.setText("¿Qué son los CREDITOS?"); 
                     break;
            case 20:  jLabel1.setText("Tratamiento contable: “fluctuación de cambio”"); 
                     break;
            case 21:  jLabel1.setText("Tratamiento contable: “deudores incobrables”"); 
                     break;
            case 22:  jLabel1.setText("Definición: “libro diario”"); 
                     break;
            case 23:  jLabel1.setText("Tratamiento contable: “caja”"); 
                     break;
            case 24:  jLabel1.setText("¿Qué es la glosa?");
                     break;
            case 25: jLabel1.setText("Tratamiento contable: “arriendos”"); 
                     break;
            case 26: jLabel1.setText("¿Qué es un asiento contable?"); 
                     break;
            case 27: jLabel1.setText("Definición: “libro mayor”"); 
                     break;
            case 28: jLabel1.setText("Tratamiento contable: “banco”"); 
                     break;
            case 29: jLabel1.setText("Tratamiento contable: “letras por cobrar”"); 
                     break;
            case 30: jLabel1.setText("Concepto: “cargar”"); 
                     break;
            case 31:  jLabel1.setText("Tratamiento contable: “debito fiscal”"); 
                     break;
            case 32:  jLabel1.setText("Definición: “balance general”"); 
                     break;
            case 33:  jLabel1.setText("Tratamiento contable: “ventas”"); 
                     break;
            case 34:  jLabel1.setText("Tratamiento contable: “acciones”"); 
                     break;
            case 35:  jLabel1.setText("¿Qué es un SALDO DEUDOR?"); 
                     break;
            case 36:  jLabel1.setText("Tratamiento contable: “clientes”"); 
                     break;
            case 37:  jLabel1.setText("Tratamiento contable: “crédito fiscal”"); 
                     break;
            case 38:  jLabel1.setText("Definición: “cuenta saldada”"); 
                     break;
            case 39:  jLabel1.setText("Tratamiento contable: “arriendo anticipado”");
                     break;
            case 40: jLabel1.setText("¿Qué es un SALDO ACREEDOR?"); 
                     break;
            case 41: jLabel1.setText("Tratamiento contable: “gastos de organización”"); 
                     break;
            case 42: jLabel1.setText("¿Qué es una CUENTA DE ORDEN?");
                     break;
            case 43: jLabel1.setText("Tratamiento contable:“fluctuación de valores”");
                     break;
            case 44: jLabel1.setText("Tratamiento contable: seguro anticipado");
                     break;
            case 45: jLabel1.setText("¿Qué son los CARGOS DIFERIDOS?");
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
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
