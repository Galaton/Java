
package l6e5;



public class Verificador {
    
    public static void Verificador(String a){
        for(int i=0; i<a.length();i++){
            Character b = a.charAt(i);
            if(Character.isLetter(b)){
                if(Character.isUpperCase(b)){
                    
                }
                else{
                    throw new IllegalArgumentException("Contem uma letra maiuscula");
                }
            }else{
                throw new IllegalArgumentException("Contem um numero!");
            }
            
        }
    }
}
