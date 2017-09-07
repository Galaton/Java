/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecla.pressionada;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.KeyListener;

public class Tecla extends JFrame {
    
    private JTextField a;
    
    public Tecla(){
        super("Gambareo");
         setLayout(new FlowLayout());
         
         a = new JTextField(20);
         
          add(a);
          a.setEditable(false);
         Ouvinte l = new Ouvinte();
        
         a.addKeyListener(l);
    }
    class Ouvinte implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
            a.setText("1:"+e.getKeyCode()+"|2:"+e.getKeyLocation()+"|3:"+e.getExtendedKeyCode()+"|4:"+e.getID());
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }
        
    }
    
}
