import java.util.Scanner;

public class E10{
    static int func(int i){
       int aux = 0;
       for(int j = i;j>0;j--){
           if((i%j) ==  0){
               aux++;
           }
       }
       if(aux>2){
           return 0;
       }else
       if(aux<=2){
           return 1;
       }else
           return 3;
       
    }
    
    public static void main(String [] args){
        System.out.println((func(8)));
        
        
    }
}