
package s78e3;

import javax.swing.*;
import java.awt.FlowLayout;

public class Color extends JFrame {
    private JComboBox cor;
    private String[] cores = {"RED","BLUE","BLACK"};
    
    private JCheckBox bg,fg;
    private JButton ok,cancel;
    
    public Color(){
        super("ColorSelect");
        setLayout(new FlowLayout());
        
        cor = new JComboBox(cores);
        cor.setMaximumRowCount(3);
        add(cor);
        
        bg = new JCheckBox("Background");
        fg = new JCheckBox("Foreground");
        
        add(bg);
        add(fg);
        
        ok = new JButton("OK");
        cancel = new JButton("Cancel");
        
        add(ok);
        add(cancel);
        
        
    }
}
