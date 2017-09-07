
package deque;


public class Deque {

    public static void main(String[] args) {
        Prog j1 = new Prog();
        
        j1.criar_vetor(5);
        for(int i = 0; i<6;i++){
            
            j1.inserir_cabeca(i++);
        }
        
    }
    
}
