import java.util.Scanner;

public class E9{
    static int rec(int x){
        if(x <= 1){
            return 1;
        }
        
        return (x * (rec((x-1))));
}
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um numero:");
        int a = input.nextInt();
        
        System.out.println(rec(a));
        
    }
    
}