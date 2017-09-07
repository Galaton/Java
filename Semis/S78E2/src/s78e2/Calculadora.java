
package s78e2;

import javax.swing.*;
import java.awt.FlowLayout;

public class Calculadora extends JFrame{
    
   private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,div,mult,sub,adic,igual,pont;
    private JTextField a;
    
    public Calculadora(){
        super("Calculadora");
        setLayout(new FlowLayout());
        
        a = new JTextField("",15);
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        div = new JButton("/");
        mult = new JButton("*");
        sub = new JButton("-");
        adic = new JButton("+");
        igual = new JButton("=");
        pont = new JButton(".");
        
        add(a);
        add(b7);add(b8);add(b9);add(div);
        add(b4);add(b5);add(b6);add(mult);
        add(b1);add(b2);add(b3);add(sub);
        add(b0);add(pont);add(igual);add(adic);
        
    }
}
