
package s78e5;

import java.awt.Color;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Random;
import java.math.*;

public class Jogo extends JFrame{
    private int numero,tentativa,anterior = 0;
    private JLabel t1,t2,t3,t4;
    private JButton restart;
    private JTextField entrada;
    
    public Jogo(){
        super("Adivinhe o numero");
        setLayout(new FlowLayout());

        t1 = new JLabel("Eu tenho um numero entre 1 e 1000, voce poderia adivinha-lo? Entre com seu chute");
        t2 = new JLabel("Mais perto");
        t3 = new JLabel("Mais longe");
        t4 = new JLabel("Correto");
        
        restart = new JButton("Novo Jogo");
        
        entrada = new JTextField(4);
        
        newGame();
        add(t1);
        add(entrada);
        numero = 55;
                
        Game act = new Game();
        entrada.addActionListener(act);
        restart.addActionListener(act);
        
    }
    private void newGame(){
        Random rand = new Random();
        numero = rand.nextInt(1000);
        
        if(numero == 1){
        numero = rand.nextInt(1000);
        }
        
    }
    class Game implements ActionListener {
        
        
        @Override
        public void actionPerformed(ActionEvent e) {
           
            if(e.getSource() == entrada){
                
              tentativa = Integer.parseInt( e.getActionCommand());
              
              
             
                if(tentativa == numero){ 
                  
                    add(t4);
                    add(restart);                  
                    entrada.setEditable(false);
                    getContentPane().setBackground(Color.GREEN);
                    
                }else
                    if(anterior == 0){
                        anterior = tentativa;
                    }else
                        if(Distancia()){//ve se a tentativa anterior [e mais proxima 
                            getContentPane().setBackground(Color.RED);//muda cor do fundo
                            anterior = tentativa;
                            add(t3);
                            
                        }else{
                            getContentPane().setBackground(Color.BLUE);
                            anterior = tentativa;
                            add(t2);
                        }
            }else
                if(e.getSource()==restart){
                    remove(t4);
                    remove(t2);remove(t3);
                    remove(restart);
                    entrada.setEditable(true);
                    newGame();
                    getContentPane().setBackground(Color.WHITE);
                }
             
           
}
   
    private boolean Distancia(){
       int a;
       a = anterior - numero;
       a = (int )Math.sqrt(a*a);
       int b;
       b = tentativa - numero;
       b = (int )Math.sqrt(b*b);
       
       if(a<b){
           return true;
       }else
           return false;
    }
}
}
