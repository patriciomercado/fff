package contabomb;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Javier Vargas
 */
public class main extends JFrame {

        Image dbImage;
        Graphics dbg;
        int cont = 0;
        
    public static void main(String[] args) {
        
        
       ventana window = new ventana();
       window.setTitle("ContaBomb");
       window.setVisible(true);   
       
       
    }
    
}

