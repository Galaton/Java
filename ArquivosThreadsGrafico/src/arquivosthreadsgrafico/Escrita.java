
package arquivosthreadsgrafico;

import java.io.FileWriter;
import java.io.IOException;

public class Escrita {
    public static void Escrever(String texto,String arquivo) {
        try{
         FileWriter arq = new FileWriter(arquivo);
         arq.write(texto);
         arq.close();
        }
        catch(Exception e){
            
        }
        
    }
}
