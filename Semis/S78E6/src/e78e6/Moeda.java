
package e78e6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Moeda extends JFrame{
    private static final String[] nomes = {" Dolar","Euro","Peso argentino"};
    private static final double dolar = 3.188,euro = 3.499,pesoarg = 0.21;
    private JTextField input;
    private JComboBox moedas;
    private JLabel resultado;
    
    public Moeda(){
        super("Conversor");
        setLayout(new FlowLayout());
        input = new JTextField(20);
        moedas = new JComboBox(nomes);
        resultado = new JLabel("Resultado:");
        
        Ouvinte e = new Ouvinte();
        
        add(moedas);add(input);add(resultado);
        
        moedas.addActionListener(e);
        input.addActionListener(e);
        
        
    }
    class Ouvinte implements ActionListener{

        
        @Override
        public void actionPerformed(ActionEvent e) {
                  
            if((e.getSource()==input)||(e.getSource()==moedas)){
              if(moedas.getSelectedIndex()==0){
               double aux;
               aux = Double.parseDouble(input.getText());
               aux = aux * dolar;
               
               resultado.setText("Resultado:"+aux);

            }else
                if(moedas.getSelectedIndex()==1) {
               double aux;
               aux = Double.parseDouble(input.getText());
               aux = aux * euro;
               
               resultado.setText("Resultado:"+aux);
                } else
                    if(moedas.getSelectedIndex()==2){
                        double aux;
                        aux = Double.parseDouble(input.getText());
                        aux = aux * pesoarg;   
                        resultado.setText("Resultado:"+aux);
                    }
              
        }
        
    }
    
}
}
