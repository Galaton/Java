
package arquivosthreadsgrafico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitura  {


    public static String Leitor(String arquivo){
     String texto = "";
     String linha;
        try{
           
        FileReader arq = new FileReader(arquivo);
        
        BufferedReader lerArq = new BufferedReader(arq);
        
         linha = lerArq.readLine();
        
        while (linha != null) {
        
            texto = texto +"\n" +linha;
            
        linha = lerArq.readLine(); 
      }
        arq.close();
        
        }catch(Exception e){
            
         texto = e.getMessage();
         
        }
        return texto;
    }
    
}
