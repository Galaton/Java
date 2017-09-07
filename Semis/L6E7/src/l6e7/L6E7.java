
package l6e7;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;


public class L6E7 {

    public static void main(String[] args) {
        Queue<Number> fila = new LinkedList<>();
         Scanner input = new Scanner (System.in);
        byte a;
        
        do{
        System.out.print("Digite 1 - inserir, 2 retirar, 3 Exibir, 4 Sair:");
        a = input.nextByte();
            
            
        switch(a){
            case 1:
                 System.out.print("Digite :");
                 try{
                fila.add(input.nextInt());
                break;
                 }
                 catch(Exception e){
                     e.printStackTrace();
                 }
            case 2:
                try{
                  
                     System.out.print("Digite :");
                    fila.remove(input.nextInt());
                   System.out.println(fila);
                }
                catch(Exception e){
                    e.printStackTrace();
                    
                }
                break;
            case 3:
                try{
               
                }
                catch(Exception e){
                    e.printStackTrace();
                    
                }
                
                break;
            case 4:
                a = 42;
                
                break;
            default:
                System.out.print("Comando invalido!\n");
                break;

        }
    }while(a!=42);
    
        
}
}