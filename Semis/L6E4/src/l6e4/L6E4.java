
package l6e4;


public class L6E4 {


    public static void main(String[] args) {
        
        try{
            if(args.length < 4){
                throw new IllegalArgumentException("Argumentos insuficientes!voce precisa de mais "+ (args.length-4)+"argumentos");
            }
            
        } 
        catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
}
