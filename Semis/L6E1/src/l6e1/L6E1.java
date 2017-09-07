
package l6e1;

import java.util.Scanner;

public class L6E1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int j = 0;
        do{
        System.out.print("\nEu lhe solicito um numero:");
        int a = input.nextInt();

        System.out.print("Eu lhe solicito outro numero:");
        int b = input.nextInt();        
        
        try{
            
            a=a/b;
            
            j = 1;
        }catch(ArithmeticException e){
            System.err.print("\n Erro, n'ao dividiras por zero");
            System.err.println(e.getMessage());//Faz com que a menssagem n'a fique em cima do campo
            e.printStackTrace();// mostra o erro
            
        }
       // catch(Exeption e){  } Diz que j[a esta sendo tratada a excecao
    }while(j==0);
        }
}
