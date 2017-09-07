
package s810e3;

import java.util.Random;


public class S810E3 {

    public static void main(String[] args) {
        Random aa = new Random();
         int[] vet = new int[5489968];
         
         for (int i = 0; i< vet.length;i++){
             vet[i] = aa.nextInt()+1;
         }
       vet = Bubble.Bubble(vet , 4);
            for (int i = 0; i< vet.length;i++){
             System.out.println(vet[i]+"\n");
         }
    }
    
}
