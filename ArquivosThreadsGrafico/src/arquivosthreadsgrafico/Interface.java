
package arquivosthreadsgrafico;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame {
    private JTextField arquivo,escrrita;
    private JButton ok;
    private JTextArea conteudo;
    private JLabel info;
    private JRadioButton escrever,ler;
    private ButtonGroup radioGroup;
    
    public Interface(){
        super("Teste");
        
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        arquivo = new JTextField(50);
        ok = new JButton("OK");
        escrrita = new JTextField(50);
        escrrita.setVisible(false);
        
        info = new JLabel("Digite o nome do arquivo:");
        
        escrever = new JRadioButton("Escrever");
        ler = new JRadioButton("Ler");

        radioGroup = new ButtonGroup();
        radioGroup.add(ler);
        radioGroup.add(escrever);
        
        
        conteudo = new JTextArea();
        conteudo.setEditable(false);
        
        add(info);add(arquivo);add(ok);
        add(escrever);add(ler);add(escrrita);
        
        ler.setSelected(true);
        
        Ouvidoria e = new Ouvidoria();
        
        escrever.addActionListener(e);
        ok.addActionListener(e);
        
    }
    class Ouvidoria implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(ler.isSelected()){
           conteudo.setText(Leitura.Leitor(arquivo.getText()));
           add(conteudo);
            }
            if(escrever.isSelected()){
                
                

            }else{
                
            }

        }
        
    }
}
