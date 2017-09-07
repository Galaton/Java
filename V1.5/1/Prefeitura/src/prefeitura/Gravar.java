
package prefeitura;
/*
@author 
Gabriel Lopes Silva 
gabriel18.lopes@gmail.com

*/
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;


public class Gravar {
    /*
    Tal classe tem a funcionalidade de criar e gravar arquivos em um txt
    
    
    
    private static String getDateTime() {// pega a data atual
	DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	Date date = new Date();
	return dateFormat.format(date);
}*/
    
    static void GravarArquivo(String local,String nome,String idade,String nascimento,String adicional,String cargo) {
      try {
            FileWriter arq = new FileWriter(local, true);
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.print("001\n");//saber que come;ou uma nova pessoa
            gravarArq.print(nome+"\n");
            gravarArq.print(idade+"\n");// idade foi substituida por setor
            gravarArq.print(nascimento+"\n");
            gravarArq.print(cargo+"\n");// cargo se chama posição pq é mais bonitinho
            gravarArq.print(adicional+"\n");
            gravarArq.print("888\n");//fechamento de arquivo

            arq.close(); // Fecha o arquivo 
    }
      catch(Exception e) {
        System.err.println("Exceção: " + e); 
      }
    }/*
    static void GravarDia(){
        try{
            
            FileWriter arq = new FileWriter(getDateTime()+".txt", true);
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.print("\n Dia:"+getDateTime()+"\n");
            
            arq.close();
        }
      catch(Exception e) {
        System.err.println("Exceção: " + e); 
      }
    }*/
    static void GravarTabela(String local,String p1,String p2,String p3,String p4,String p5,byte controle){
       /* controle serve para dizer se quero sobescrever ou continuar escrevendo
        0 = continuar escrevendo
        1 = sobescrever
        
        */
        try {
            if(controle == 0){
            FileWriter arq = new FileWriter(local, true);
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.print("001\n");
            gravarArq.print(p1+"\n");
            gravarArq.print(p2+"\n");
            gravarArq.print(p3+"\n");
            gravarArq.print(p4+"\n");
            gravarArq.print(p5+"\n"); 
            gravarArq.print("\n888\n");//fechamento de arquivo

            arq.close(); // Fecha o arquivo 
            }
            else{
                if(controle == 1){
                    FileWriter arq = new FileWriter(local);
                    PrintWriter gravarArq = new PrintWriter(arq); 
                
            
            gravarArq.print("001\n");
            gravarArq.print(p1+"\n");
            gravarArq.print(p2+"\n");
            gravarArq.print(p3+"\n");
            gravarArq.print(p4+"\n");
            gravarArq.print(p5+"\n"); 
            gravarArq.print("\n888\n");//fechamento de arquivo

            arq.close(); // Fecha o arquivo 
        }
            }
            
        }
        catch(Exception e) {
            System.err.println("Exceção: " + e); 
        } 
    }
}

