import java.util.Scanner;

public class E7{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        int [] k;
        k = new int[20];
        
        for(int i=0;i<20;i++){
            System.out.print("Digite um elemento do vetor:");
            k[i]= input.nextInt();
              
        }
        for(int i = 0;i<20;i++){
            if((k[i]%2) != 0){
                int a = k[i++];
                k[i++]=k[i];
                k[i] = a;
                
            }
        }
        for(int i = 0; i<20;i++){
            
            System.out.println(k[i]);
        }
    }
}