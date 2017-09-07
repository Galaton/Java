import java.util.Scanner;

public class Baskara{
   public static void main(String [] args){
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("Digite a:");
       long a = input.nextLong();
       System.out.print("Digite b:");
       long b = input.nextLong();
       System.out.print("Digite c:");
       long c = input.nextLong();
       long x;
       
       x =(long) ((-b)+Math.sqrt((b*b)*(-4)*a*c))/2*a;
       
       System.out.println(x);

   } 
  
}