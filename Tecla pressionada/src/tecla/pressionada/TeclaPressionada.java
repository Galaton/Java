
package tecla.pressionada;

import javax.swing.JFrame;


public class TeclaPressionada {

    public static void main(String[] args) {
       Tecla a = new Tecla();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setSize(300, 150);
        a.setVisible(true);
    }
    
}
