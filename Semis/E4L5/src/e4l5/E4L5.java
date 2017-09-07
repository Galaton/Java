

package e4l5;

import java.util.Scanner;

public class E4L5 {

 
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos campos deseja?");
        int j = input.nextInt();
        
        FormaGeometrica vet[] = new FormaGeometrica[j];
        
        for(int i = 0;i < j;i ++){
            System.out.printf("\n 1-Quadrado , 2 - Retangulo, 3 - Circulo :");
            byte a = input.nextByte();
            switch(a){
                
                case 1 :
                    float aa = (float)(i+1) * 7;
                   vet[i] = new Quadrado(aa); 
                   
                    break;
                case 2:
                    float bb[] = new float[2];
                    bb[0] = (float)(i+1)*5;
                    bb[1] = (float)(i+1)*9;
                    
                    vet[i] = new Retangulo(bb[0],bb[1]);
                    
                    
                    break;
                case 3:
                    float cc = (float)(i+1) * 8;
                   vet[i] = new Circulo(cc);                     
                    
                    break;
                default :
                    i--;
                    System.out.printf("\n Opção invalida!");
            }
            

             
             
            
        }          
        for(int i = 0;i < j;i ++){
             System.out.print("--------------------------------------------------------");
             System.out.println(vet[i].toString());
             System.out.println("Perimetro:"+vet[i].calcPerimetro());
             System.out.println("Area:"+vet[i].calcArea());
              System.out.print("--------------------------------------------------------\n");
             }
    }
    
}
