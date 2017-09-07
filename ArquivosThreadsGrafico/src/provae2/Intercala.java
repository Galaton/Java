
package provae2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class Intercala {
    private String a1,a2,a3;
    private String linha;
        private List<Integer> vetor = new ArrayList<>();
    
    private  List<List<Integer>> listaDosVetores = new ArrayList<>();
    
    public Intercala(String a1,String a2,String a3){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        for(int i = 1; i< 4;i++){
            Leitor("a" +i,i);
        }
        juntaVetor();
    }
        private void Leitor(String arquivo,int index){// le o arquivo
                try{
                    
           listaDosVetores.add(new ArrayList<>());// salva cada vetor em um veor dentro de outro vetor
           
        FileReader arq = new FileReader(arquivo);
        
        BufferedReader lerArq = new BufferedReader(arq);
        
                     linha = lerArq.readLine();
        
        while (linha != null) {
            
        listaDosVetores.get(index).add(Integer.parseInt(linha));// le os arquivos para o subvetor
        
            
        linha = lerArq.readLine(); 
      }
        arq.close();
        
        }catch(Exception e){
            
         e.printStackTrace();
         
        }
    }
            
 private void juntaVetor(){  // compara os primeiros e coloca em ordem, removendo aqueles que passa para um novo vetor
      int salvn,aux;
                    for(;;){
            if(listaDosVetores.size() == 0){// condição de parada, acabou a lista
                break;
            }
            
            aux = 0;
            salvn = (int) listaDosVetores.get(0).get(0);
            
            for(int j = 0;j< listaDosVetores.size();j++){
                
                if(salvn > (int) listaDosVetores.get(j).get(0)){
                    salvn = (int) listaDosVetores.get(j).get(0);
                    aux = j;
                    
                }
            }
            
           vetor.add(salvn);// salva o menor na lista.
            
            // se a lista que eu peguei o item s[o tem mais 1 item quer dizer que ela deve ser eliminada
            if(listaDosVetores.get(aux).size() == 1){
                listaDosVetores.remove(aux);
            }else{
            listaDosVetores.get(aux).remove(0);
            }
            
            
        }


        
    }

        private void Escrever() {
        linha = "";//apaga o que estava contido em linha
        for(Integer nome : vetor){
            linha =  linha+"\n"+vetor;// transforma linha em uma string
        }
        try{// salva linha no arquivo texto
            
         FileWriter arq = new FileWriter("ordenado.txt");
         arq.write(linha);
         arq.close();
        }
        catch(Exception e){
            
        }
        }
}
