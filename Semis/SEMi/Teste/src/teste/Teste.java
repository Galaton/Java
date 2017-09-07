/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author gabriel
 */
public class Teste {

    static int Dividir(int x,int y){
        try{
            return x / y;
        }
        catch(ArithmeticException e){
            System.err.println("Exce;'ao capiturada:" + e);
            RuntimeException nova = new RuntimeException(e);
            throw nova;
        }
    }
    
    
    public static void main(String[] args) {
      try {
          int z = Dividir (4,0);
      }
      catch(Exception e){
          System.err.println("Exece;'ao recapiturada:"+e);
      }
    }
    
}
