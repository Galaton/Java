

package semi4e5;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Teste {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
        //A
        float a= 44;
        Assistente juca = new Assistente("juca","manducas",12345,a);
        juca.ExibirDados();
        
        Tecnico iguinho = new Tecnico("Igor","papelao",a,666);
        iguinho.ExibirDados();
        
        //////////////////////////////////////
        
        //B
        
        Cachorro dog = new Cachorro("bob");
        System.out.print(dog.late());
        
        Gato mints = new Gato("Mints");
        System.out.print(mints.late());
        
        dog.caminha();
        mints.caminha();
        /////////////////////////////////////
        //C
        int j;
        Pessoa voce;
        System.out.print("Seu nome possui w,y ou k,1-sim 2-nao:");
        j = input.nextInt();
        if(j==1){
        System.out.print("Voce nasceu no Brasil,1-sim 2-nao:");
        j = input.nextInt();
        if(j == 1){
        System.out.print("Voce sabe ama caninha da roca?,1-sim 2-nao:");
        j = input.nextInt();
        if(j==1){
            voce = new Miseravel("Pelota",38,2);
        }
        if(j==2){
            voce = new Pobre("Joyklew",20,-10);
        }
        }else
        if(j==2){
            voce = new Rica("Wally",15,10000);
        }
        }else
            if(j==2){
        System.out.print("Voce faz faculdade,1-sim 2-nao:");
        j = input.nextInt();
        if(j == 1){
            voce = new Miseravel("Joao",20,10);
        }else
            if(j == 2){
        System.out.print("Voce e feliz?,1-sim 2-nao:");
        j = input.nextInt();
        if(j == 1){
             voce = new Miseravel("Feijao",25,200);
        }
        else 
            if(j == 2 ){
        System.out.print("Quando voce come fora voce come marmita?,1-sim 2-nao:");
        j = input.nextInt(); 
        if(j == 1 ){
            voce = new Pobre("Madruga",55,-10);
        }
        else
            if(j == 2){
                voce = new Rica("Billy",85,100000);
            }
            }
            }
            }
        
        
        ////////////////////////////////////
        //D
        Ingresso aa;
         float preco = 100;
        
        
        System.out.printf("/n digite 1 para normal 2 para vip:");
       int  i = input.nextInt();
       
       while(i!=0){ 
       if(i==1){
           System.out.print("Ingresso norma? 1-sim 2-nao");
           i = input.nextInt();
           if(i==1){
               aa = new Normal(preco);
               aa.imprimeValor();
               i = 0;
           }else{
               i = 0;
           }
        }else{
            if(i==2){
            System.out.print("Ingresso vip? 1-sim 2-nao");
            
            i = input.nextInt(); 
            
         
            
            if(i==1){
              
            System.out.print("1-Camarote Superior 2-Camarote inferior");
            i = input.nextInt();
            
            if(i == 1){
                aa = new CamaroteSuperior(preco,preco,preco);
                aa.imprimeValor();
                i = 0;
            }else
            if(i==2){
               aa= new CamarotrInferior(preco,preco,"aa22");
               aa.imprimeValor();
               i = 0;
            }
                
                
            }else{
                
                i = 0;
            }
            }
        }
        }
          /////////////////////////////////////////////////////////////
    //E
        System.out.printf("/n digite 1 para novo 2 para velho:");
        i = input.nextInt();  
        Imovel amakd ;
        
        if( i == 1 ){
            amakd = new Novo();
                amakd.getPreco();
        }
        if ( i == 2 ){
            amakd = new Velho();
                    amakd.getPreco();
        }
        

        
    }
    

    
}
