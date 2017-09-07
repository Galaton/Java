
package e1l5;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Collections;

public class Loja {


    
    public static void main(String[] args) {
       /* Produto [] vetor;
        vetor = new Produto[5];
        */
       ArrayList<Produto> vetor = new ArrayList<>();
       
       vetor.add(new Livro("Bob o construtor","Juca",(float)50.5,11));
        vetor.add( new CD("Anos 80",(float)20,10,13));
        vetor.add( new DVDs("Xuxa",(float)10,(float)100.50,12));
        vetor.add(new Livro("D&d","Barry Allan",(float )54,55));
       vetor.add( new CD("Axe 2012",(float)55,5,88));
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite:");
        int j = input.nextInt();
        if((j>4)||(j<0)){
            System.out.print("Erro Produto n'ao encontrado!");
        }else
         System.out.print("Seu produto :"+vetor.get(j).toString()+"\n");
        
        for(int i = 0;i<5;i++){
            System.out.print(vetor.get(i).toString()+"\n");
        }
       Collections.sort(vetor);
       
       System.out.print("--------------------------------------------------------------------------------------------------\n\n");
               for(int i = 0;i<5;i++){
            System.out.print(vetor.get(i).toString()+"\n");
        }
      // System.out.println("\n\n" + Produto.equals(vetor[0], vetor[0]));
    }
    
}
