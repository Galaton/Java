import java.util.Scanner;

public class Calculadora{
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        for(;;){
            System.out.print(" 1 - Soma 2 - Subtracao 3 - Multipilcacao 4 Divisao :");
            byte i = input.nextByte();
            int a,b;
            switch(i){
                
                case 1:
                    System.out.print(" Digite os numeros:");
                             a = input.nextByte();
                             b = input.nextByte();
                            System.out.println((a+b));
                    break;
                case 2:
                    System.out.print(" Digite os numeros:");
                             a = input.nextByte();
                             b = input.nextByte();
                            System.out.println((a-b));
                    break;
                case 3:
                    System.out.print(" Digite os numeros:");
                            a = input.nextByte();
                            b = input.nextByte();
                            System.out.println((a*b));                    
                    break;
                case 4:
                    System.out.print(" Digite os numeros:");
                             a = input.nextByte();
                             b = input.nextByte();
                            System.out.println((a/b));                    
                    break;
            }
        }
        
        
    }
}