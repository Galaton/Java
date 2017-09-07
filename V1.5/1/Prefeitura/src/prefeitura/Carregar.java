
package prefeitura;
/*
@author 
Gabriel Lopes Silva 
gabriel18.lopes@gmail.com

*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;




public class Carregar {
    
    
 /* static int ContadorDeNomes(String arquivo) throws FileNotFoundException, IOException{
      
      int i = 0;// contador para ver quantos nomes tem
      // abre o arquivo
      FileReader arq = new FileReader(arquivo);
      BufferedReader lerArq = new BufferedReader(arq);
      
       String linha = lerArq.readLine();// le linha por linha
      
       while(linha != null) {
           
           if(linha.equals("001\n"))//depois de cada um destes vem um nome, cerve para contar o numero de nomes
               i++;
 
        linha = lerArq.readLine(); 
      }
       arq.close();
      
      
      return i;
  } */
  static ArrayList<String> CarregadorDeNomes(String arquivo) throws IOException{
      int i = 0;// servira como chave para saber se o proximo 
      
    ArrayList<String> nomes = new ArrayList<String>();
    
    FileReader arq = new FileReader(arquivo);
    BufferedReader lerArq = new BufferedReader(arq);
    
    String linha = "a\n";// só para iniciar
    
    while(linha != null) {

        if(i == 1){
            i=0;//como ja entrou aqui agora a proxima nao e mais nome
            nomes.add(linha); // se o 1 estiver ativo é porque antes teve um 001 então esta linha é um nome
            
        }else
        if(linha.equals("001")){
            i =1 ;// quando o i estiver igual a 1 quer dizer que a proxima palavra [e um nome
            
        }

        
    linha = lerArq.readLine(); 
    }
    

    arq.close();
     
    
    return nomes;
  }
    static ArrayList<String> CarregadorDeTabelas(String arquivo) throws IOException{
      int i = 0;// servira como chave para saber se o proximo 
      
    ArrayList<String> componentes = new ArrayList<String>();
    
    FileReader arq = new FileReader(arquivo);
    BufferedReader lerArq = new BufferedReader(arq);
    
    String linha = "a\n";// só para iniciar
    
    while(linha != null) {
     
        if(linha.equals("888")){// final do arquivo fecha a "porta" porta = i
            i=0;
        }
        else
            if(linha.equals("001")){//inicio do arquivo, abre a "porta" para gravar
                i =1 ;
                }else
                    if(i == 1){
                        componentes.add(linha); 
                        
                     }
    linha = lerArq.readLine();
      
  }
    arq.close();
    return componentes;
}
}

