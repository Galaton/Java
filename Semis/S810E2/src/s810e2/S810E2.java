
package s810e2;


public class S810E2 {


    public static void main(String[] args) {
        
        int A[] = new int[4000000];
        
        for(int i = 0;i < 4000000;i++){
            A[i]=i+(i*4);
        }
        
        System.out.println(Busca.busca(44580, A, 4));
        
    }
    
}
