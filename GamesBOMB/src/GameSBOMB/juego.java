package GameSBOMB;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.text.Collator;

public class juego extends javax.swing.JFrame implements ActionListener {


        
        @Override
        public void actionPerformed(ActionEvent e) {
        sec++;
        jLabel4.setText(""+sec);
        if (win == 59){
        ventanaFinal obj = new ventanaFinal();       
        obj.setVisible(true);
        dispose();
        }
        else{
             jButton2.setText("No lo se :/");
             lock = 1;
            }
        }
        private int sec = 0;
        private int win = 0;
        private Timer t;
       private int lock = 0;
       private int repetido = 0;
       private int n = 60;  //numeros aleatorios
       private int k = n; //auxiliar;
       private int cont = 0;
       private int p = 0;
       private int [] numeros = new int[n];
       private int [] resultado = new int[n];
       private Random rnd = new Random();
       private jugadores archivo = new jugadores ();        
       private int res;
       private int j = 0;
       private int limit;
       private String [] players = new String [4];
       
       public void setJ(int a){
           limit = a;
       }
        
    public juego() {
        initComponents();
        players = archivo.readPlayers();
        for(int i = 0;i < n; i++){
            numeros[i] = i + 1;
        }
        for(int i = 0; i < n; i++){
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
            numeros[res] = numeros[k-1];
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
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
        jLabel4.setText("15s");
        jLabel4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel4ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 20, 380, 40);

        jLabel2.setText("Player ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 20, 260, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bomba obj = new bomba(j+1);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        t.stop();
        Collator comparador = Collator.getInstance();
        comparador.setStrength(Collator.PRIMARY);        
        if(j > limit){
            j = 0;
        }        
        if (win == 59){
        ventanaFinal obj = new ventanaFinal();
        obj.setVisible(true);
        dispose();           
        }
        else{
        if (lock == 1){
        bomba obj = new bomba(j+1);
        obj.setVisible(true);
        dispose();
        }
        else {
            preguntas lista = new preguntas();
            String [] listaPreg = lista.getpreguntas();
            try{
                jLabel1.setText(listaPreg[resultado[p]]);
            }catch (IndexOutOfBoundsException e){
                jLabel1.setText(listaPreg[resultado[p-1]]);
            }           
        if((players[j] == null)){
            j = 0;
        }
        System.out.println(players[j]);
        if(comparador.compare(players[j], "0") == 0){
            j++;
        }
        if(j > limit){
            j = 0;
        }         
        jLabel2.setText("Player " +(j+1));
        p++;
        win++;
        t.start();
        j++;       
        }
        
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
