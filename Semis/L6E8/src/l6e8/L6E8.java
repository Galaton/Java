
package l6e8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class L6E8 {


    public static void main(String[] args) {
        int vetor[] = new int [1000000000];
        for(int i = 0; i<vetor.length;i++){
            Random a = new Random();
            vetor[i] = a.nextInt(vetor.length);
        }
        Arrays.sort(vetor);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero:");
        System.out.println(Arrays.binarySearch(vetor, input.nextInt()));
        
    }
    
}
