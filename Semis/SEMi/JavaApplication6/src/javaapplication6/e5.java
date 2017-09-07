import java.util.Scanner;

public class e5{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Quantos individuos deseja:");
      int n = input.nextInt();
      
      int [] idade,peso;
      byte [] sexo;
      
      idade = new int[n];
      peso = new int[n];
      sexo = new byte[n];
      
      for(int i=0;i<n;i++){
        System.out.print("Digite sua idade peso e sexo 1-feminino 2- masculino:");
        idade[i] = input.nextInt();
        peso[i] = input.nextInt();
        sexo[i] = input.nextByte();
      }
      int idademm = 0,idademf = 0,pesomm = 0,pesomf = 0,f = 0,m = 0;
      
      for(int i=0;i<n;i++){
          if(sexo[i]==1){
              idademf=idade[i]+idademf;
              pesomf= peso[i]+pesomf;
              f++;
          }else
              if(sexo[i]==2){
                 idademm=idademm+idade[i];
                 pesomm=pesomm+peso[i];
                 m++;
              }
              else{
                  System.out.printf("Sua digitacao de n %d foi erronia! ",i++);
              }
          
      }
      System.out.printf("Peso e idade media feminino:%d %d,peso e idade media masculino:%d %d",(pesomf/f),(idademf/f),(pesomm/m),(idademm/m));

    }
    
}