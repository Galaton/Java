package mutquickt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 *
 * @author gabriel
 */
public class RandVector {
    static void gerarRandVector(int tamanho, List vet){
        
        
        Random a = new Random();
        for(int i =0;i<tamanho;i++){
            vet.add(a.nextInt(100));
     
        }
    
}
}
