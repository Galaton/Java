
package l6e2;


public class L6E2 {
     
    
    public static int[] metodo(int n){
    
        
        try{
            int vet[] = new int[n];
            return vet;
            
        }catch(NegativeArraySizeException e){
         System.err.print("Erro, tamanho negativo\n");   
            throw e;
        }
        
    
    }

    public static void main(String[] args) {
        int i =-3,j=0;
        do{
        try{
            metodo(i);
            System.out.print("\n ebaa");
            j = 12;
        }
        catch(Exception e){
            e.printStackTrace();
            i++;
            if(i == 0){
                i = 4;// so para o tamanho nao ficar zero
            }
            
        }
        }while(j!=12);
    }
    
}
