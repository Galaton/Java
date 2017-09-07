
package quicksortm;

/**
 *
 * @author gabriel
 */
public class Sort implements Runnable{
    private void divisor(){//pega pedaços do veotr e cria um subvetor ordenado
        
    }
    private void insertion(int vetor[]){// usado quando o vetor esta muito pequeno,n<27
        for (int i = 1; i < vetor.length; i++){

        int key = vetor[i];
        int j = i;

        while ((j > 0) && (vetor[j-1] > key)){
                vetor[j] = vetor[j-1];
                j -= 1;
        }
        vetor[j] = key;
}
    }
    private void quickM(){//
        
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
