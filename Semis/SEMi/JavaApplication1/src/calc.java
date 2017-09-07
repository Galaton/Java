import java.util.Scanner;

public class calc{
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        
        float n1,n2;
       
        System.out.print("Digite um numero:");
        
        n1 = input.nextFloat();
       
        System.out.print("Digite um numero:");
        n2 = input.nextFloat();
        
        System.out.println((n1+n2));
        System.out.println((n1*n2));
    }
    
    
    
    
}