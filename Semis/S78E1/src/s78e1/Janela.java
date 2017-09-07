
package s78e1;
import java.awt.FlowLayout;
import javax.swing.*;

public class Janela extends JFrame {
    private JCheckBox stc,sg;
    private JTextField x,y;
    private JButton ok,cancel,help;
    
     
    
    public Janela(){
        super("Align");
        setLayout(new FlowLayout());
        
        
        ok = new JButton("ok");
        add(ok);

        cancel = new JButton("cancel");
        add(cancel);        
        
        help = new JButton("help");
        add(help);        
        
        x = new JTextField("X:");
        y = new JTextField("Y:");
        
        add(x);add(y);
        
        stc = new JCheckBox("Snap to grid");
        sg = new JCheckBox("Show grid");
        add(stc);add(sg);
    }
    
}
