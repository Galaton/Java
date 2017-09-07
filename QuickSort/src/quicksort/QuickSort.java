
package quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/*
Projeto Voadora -- cancelado
*/


public class QuickSort {
    public static void main(String[] args) {
        try{
        List<Integer> vet =new ArrayList<>();
        
        Random a = new Random();
        for(int i =0;i<2000;i++){
            vet.add(a.nextInt(100));
     
        }
        new ImplementsVoadora(vet);
        for(int i =0;i<2000;i++){
            System.out.print("\n- "+vet.get(i));
        }
    }catch(Exception e){
        System.out.print("+");
}
    

}
}
