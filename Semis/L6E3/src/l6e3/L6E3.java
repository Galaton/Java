
package l6e3;

public class L6E3 {

    public static void main(String[] args) {
        String str1,str2;
        str1 = " Batatta";
        str2 = new String();
        try{
            str1.compareTo(str2);//n'ao consegui compilar nada com uma string nula
            
        }
        catch(NullPointerException e){
            System.err.print("Erro, Variavel nula\n");
            e.printStackTrace();
        }
    }
    
}
