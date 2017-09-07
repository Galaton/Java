import java.util.Scanner;

public class E8{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        int a[][] = new int[8][8];
        
        for(int i = 0; i<8 ; i++){
            for(int j = 0; j < 8;j++){
               System.out.print("Digite um elemento da matriz");
               a[i][j] = input.nextInt();
            }
            
            
        }
        System.out.print("Dige um numero para buscar:");
        int x = input.nextInt();
        
        int aux = 9,aux1 = 9;
        
        for(int i = 0 ; i < 8 ; i++ ){
            for(int j =0 ; j < 8 ; i++ ){
                if(x == a[i][j]){
                   aux=i;
                   aux1=j;
                }
                
            }
            
        }
        
        if(aux != 9){
            System.out.printf("O valor foi encontrado na posicao: %d %d",aux,aux1);
            
        }
        else{
            System.out.print("O valor nao esta na matriz");
        }
    }
    
    
}