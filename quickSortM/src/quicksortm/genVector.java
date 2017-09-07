
package quicksortm;

import java.util.Random;

/**
 *
 * @author gabriel
 */
public class genVector {

    public static int[] nwVector(int size){
         Random a = new Random();
        
        int[] vector = new int[size];//inicializa o vetor do tamanho que o usu[ario mandar
        
        for(int i =0;i<size;i++){
            vector[i] = a.nextInt(size/10);
        }
        
        return vector;
    }
}
