/*Esta merda s[o retorna 0 */


package s810e3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Bubble implements Runnable {

    private List<Integer> vetor;
    
    private static List<List> listaDosVetores = new ArrayList<>();
    
    public Bubble(){}
    private Bubble(List vetor){
        this.vetor = vetor;
    }
    
    
    public static int[] Bubble(int[] vet,int nThread){
     
        
        int tamanhoDoSubvetor = vet.length/nThread;
        int aux = 0;
        List<Integer> vetorAux = new ArrayList<>();
        
        ExecutorService exe = Executors.newCachedThreadPool();
        
        for(int i =0;i<nThread;i++){
            
            // Dividindo o vetor
            for(int j = aux;j<tamanhoDoSubvetor;j++){
                vetorAux.add(vet[i]) ;
            }
            
            aux = aux + tamanhoDoSubvetor +1;
            
            exe.execute(new Bubble(vetorAux));
            
            
        }
        exe.shutdown();
        
        return ArrumaVetor(vet.length);
    }
    
    
    
    @Override
    public void run() {
      listaDosVetores.add(Ordenacao(vetor));  //chama o bubble e joga a parte ordenada em um vetor
    }
    //Bubble sort
    private List<Integer> Ordenacao(List<Integer> vet){
        boolean aux = true;
        int aux1;
        do{
            aux = true;
        for(int i = 0; i< vet.size();i++){
            if(vet.get(i) > vet.get(i++)){
                aux = false;
                aux1 = vet.get(i++);
                vet.remove(i++);
                vet.add(i++,vet.get(i));
                vet.remove(i);
                vet.add(i, aux1);
               
                
            }
            
        }
        }while(aux == false);
        
        return vet;
    }
    
    private static int[] ArrumaVetor(int tamanho){
        int vetaux[] = new int[tamanho];
        int salvn,aux,i = 0;
        
        /// compara sempre com o 1 elemento da lista, quando acha o menor elemento de todas as lista coloca ele no vetor e o elimina
        for(;;){
            if(listaDosVetores.size() == 0){
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
            
            vetaux[i]=salvn;
            i++;
            // se a lista que eu peguei o item s[o tem mais 1 item quer dizer que ela deve ser eliminada
            if(listaDosVetores.get(aux).size() == 1){
                listaDosVetores.remove(aux);
            }else{
            listaDosVetores.get(aux).remove(0);
            }
            
            
        }

        return vetaux;
    }
}
