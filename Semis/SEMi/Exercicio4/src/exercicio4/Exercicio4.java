import java.util.Scanner;



/**
 *
 * @author gabriel
 */
public class Exercicio4 {

 
    public static void main(String[] args) {
        String pais,iso;
        double pop,km;
        
       Scanner input = new Scanner(System.in);
        
       System.out.print("Pais:");
       pais = input.nextLine();
       System.out.print("Iso:");
       iso = input.nextLine();
       System.out.print("Populacao:");
       pop=input.nextDouble();
       System.out.print("Dimenc:");
       km=input.nextDouble();
       
       Pais br = new Pais(iso,pais,pop,km);
    }
    
}
