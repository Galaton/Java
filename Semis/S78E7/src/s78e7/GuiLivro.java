
package s78e7;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuiLivro extends JFrame{
    private JLabel titulo,paginas;
    private JButton adicionar,listar;
    private JTextField tittulo,pagginas;
    
    private ArrayList<Livro> lista = new ArrayList<>();//Salva os livros adicionados    
    private JList<String> exebic ;
    private String[] aux = new String[200];// auxiliar a jlist
    private int aux1 = 0;// sera utilizado para verificar se alguma jlist ja foi criada;
    
    public GuiLivro(){
        super("Livros");
        setLayout(new FlowLayout());
        setSize(300,150);
        
        titulo = new JLabel("Título:");
        paginas = new JLabel("Páginas:");
        adicionar = new JButton("Adicionar");
        listar = new JButton("Listar");
        tittulo = new JTextField(25);
        pagginas = new JTextField(4);
        
        
        add(titulo);add(tittulo);
        add(paginas);add(pagginas);
        add(adicionar);add(listar);
        
        Monitorador e = new Monitorador();
        
        adicionar.addActionListener(e);
        listar.addActionListener(e);
    }
    private class Monitorador implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == adicionar){
                
                
                int aux =Integer.parseInt(pagginas.getText());//Pega o numero de paginas    
               
                lista.add(new Livro(tittulo.getText(),aux));// Adiciona um livro a lista de livros
                
                System.out.print("\nLivro adicionado:"+tittulo.getText());//usado para verificar o funcionamento
            }else
                if(e.getSource()== listar){
                  
                   int i = 0;
                    for(Livro listt : lista){
                        aux[i]="Título:"+listt.getTitulo()+"\nPáginas:"+listt.getPaginas();//vetor auxiliar usado para o jlist
                        i++;
                      
                    } if(aux1==0){ 
                    exebic = new JList(aux);
                    exebic.setVisibleRowCount(i);
                    add(exebic);
                    aux1++;
                    System.out.print("\nLabel adicionado");
                    }else{
                         System.out.print("\nLabel removido");
                        remove(exebic);
                        exebic.setListData(aux);
                        add(exebic);
                        System.out.print("\nLabel adicionado");
                    }
                        
                }
        }
    
}
}

