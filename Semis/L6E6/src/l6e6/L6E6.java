
package l6e6;

import java.util.Scanner;
import java.util.Stack;

public class L6E6 {


    public static void main(String[] args) {
        
        byte a;
        Stack <Number> pilha = new Stack<>();
        
        Scanner input = new Scanner (System.in);
        
        do{
        System.out.print("Digite 1 - inserir, 2 retirar, 3 sair:");
        a = input.nextByte();
            
            
        switch(a){
            case 1:
                 System.out.print("Digite :");
                 try{
                pilha.push(input.nextFloat());
                break;
                 }
                 catch(Exception e){
                     e.printStackTrace();
                 }
            case 2:
                try{
                pilha.pop();
                }
                catch(Exception e){
                    e.printStackTrace();
                    
                }
                break;
            case 3:
                a = 42;
                
                break;
            default:
                System.out.print("Comando invalido!\n");
                break;

        }
        
        }while(a!=42);
    }
    
}
