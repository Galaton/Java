
package deque;


public class Prog {
    private int cabeca,cauda;
    private int[] vetor;
    private int tamanho;
    
    public void criar_vetor(int x){
        vetor = new int[x];
        cabeca = 0;
        cauda = x;
        tamanho = x;
        for(int i = 0; i< x ; i++){
            
            vetor[i]= 0 ;
        }
    }
    public void inserir_cabeca(int x){
        
        int aux = 0;
        
        for(int i = 0;i<tamanho;i++){
            if(vetor[i]== 0 ){
                
                vetor[i] = x;
                aux++;
                
                break;
            }
            
        }
        if(aux == 0){
            
            System.out.print("Lotado");
            
        }
        
    }
    public void inserir_cauda(int x){
        
        int aux = 0;
        
        
        for(int i = tamanho;i>0;i--){
            if(vetor[i]== 0 ){
                
                vetor[i] = x;
                aux++;
                
                break;
            }
            
        }
        if(aux == 0){
            
            System.out.print("Lotado");
            
        }
                
        
    }
    
}
