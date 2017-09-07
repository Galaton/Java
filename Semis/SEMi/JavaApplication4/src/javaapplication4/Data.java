import java.util.Scanner;

public class Data{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o dia em que nasceu:");
        byte dia = input.nextByte();
        
        System.out.print("Digite o mes em que nasceu:");
        byte mes = input.nextByte();
        
        System.out.print("Digite o ano em que nasceu:");
        int ano = input.nextInt();
        
        System.out.print("Digite o dia de hoje:");
        byte diaa = input.nextByte();
        
        System.out.print("Digite o mes atual:");
        byte mesa = input.nextByte();
        
        System.out.print("Digite o ano em que estamos:");
        int anoa = input.nextInt();
        
        int anos = (anoa--) - ano  ;
        int dias = anos * 365;
        
        for(int i=1900;i<anoa--;i=i+4){
            if(i>=ano){
                dias ++; 
            }
        }
        System.out.println(dias);
        
    }
}