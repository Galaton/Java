package quicksort;

import java.util.List;


public class Insertion {

         static void insertion(List vetor){// usado quando o vetor esta muito pequeno,n<27
        for (int i = 1; i < vetor.size(); i++){

        int key = (int)vetor.get(i);
        int j = i;

        while ((j > 0) && ((int)vetor.get(j-1)> key)){
                vetor.set(j, vetor.get(j-1));
                j -= 1;
        }
        vetor.set(j, key);
}
    }
         static void insertionSort(int[] vetor){
		
		for (int i = 1; i < vetor.length; i++){
			
			int key = vetor[i];
			int j = i;
			
			while ((j > 0) && (vetor[j-1] > key)){
				vetor[j] = vetor[j-1];
				j -= 1;
			}
			vetor[j] = key;
		}
	
	}
}