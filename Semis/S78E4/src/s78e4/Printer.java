
package s78e4;

import javax.swing.*;
import java.awt.FlowLayout;

public class Printer extends JFrame{
    private JCheckBox image,text,code,print;
    private JRadioButton selection,all,applet;
    private JButton ok,cancel,setup,help;
    private JComboBox quality;
    private JLabel t1,t2;
    
    private ButtonGroup check,radio;
    
    private static final String[] qualidades = {"High","Medium","Low"};
    
    private Icon a = new ImageIcon(getClass().getResource("icon.jpg"));
    
    public Printer(){
        super("Printer");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        check = new ButtonGroup();
        check.add(image);
        check.add(text);
        check.add(code);
        
        radio = new ButtonGroup();
        radio.add(selection);
        radio.add(all);
        radio.add(applet);
        
        image = new JCheckBox("Image");
        text = new JCheckBox("Text");
        code = new JCheckBox("Code");
        
        print = new JCheckBox("Print to File");
        
        selection = new JRadioButton("Selection");
        all = new JRadioButton("All");
        applet = new JRadioButton("Applet");
                
        t1 = new JLabel("Printer:MyPrinter");
        
        t2 = new JLabel("Print Quality:");
        
        quality = new JComboBox(qualidades);
        
        ok = new JButton("OK");
        cancel = new JButton("Cancel");
        setup = new JButton("Setup...");
        help = new JButton("Help");
        
        add(t1);add(image);add(text);add(code);
        add(selection);add(all);add(applet);
        add(t2);add(quality);add(print);
        add(ok);add(cancel);add(setup);add(help);
              
    }
    
}
