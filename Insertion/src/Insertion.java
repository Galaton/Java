

public class Insertion {

        private static void insertion(int vetor[]){// usado quando o vetor esta muito pequeno,n<27
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
