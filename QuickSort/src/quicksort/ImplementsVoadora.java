
package quicksort;

import java.util.ArrayList;
import java.util.List;

public class ImplementsVoadora implements Runnable{
    
     byte chave0 = 0,chave1 = 0,chave2 = 0,chave3 = 0;
     List<Integer> vet0,vet1,vet2,vet3;
    
    public ImplementsVoadora(List vetor){
        
        //inicia os vetores
        vet0 = new ArrayList<Integer>();
        vet1 = new ArrayList<Integer>();
        vet2 = new ArrayList<Integer>();
        vet3 = new ArrayList<Integer>();
        quick(vetor);
        
    }
    private void quick(List vetor){
        
        int inicio = 0;         
        int quant = vetor.size()/4;
        int vetPivos[] = new int[4];
        
        if(vetor.size()<27){
            Insertion.insertion(vetor);
        }else{
            parte1(vetor,inicio,quant,vetPivos);//selecion os pivos
            parte2(vetor,vetPivos);//faz uma pre ordenacao
            puloDoGato();//manda eles fazerem tudo denovo
         theLastOne(vetor);
        }
        
        
        
    }
    private void parte1(List vetor,int inicio,int quant,int[] vetPivos){//seleciona os pivos
        
        int[] vetAux =new int[8];
        int aux = 0;//usado para auxiliar quando for pegar os pivos
        //System.out.print("\n Entrando parte 1 \n");
        for(int i =0;i<8;i ++){//pega os candidato a pivos
            vetAux[i] = (int) vetor.get(aux);
            //System.out.print("__1CandidatosPivos:"+(int) vetor.get(aux)+"--"+i+vetAux[i]+"\n");
            i = i+1;// erros aleatórios aparecem se eu faço de outro modo
            vetAux[i] = 0;
            aux = aux +1;
            vetAux[i] = (int) vetor.get(aux);
            //System.out.print("__2CandidatosPivos:"+(int) vetor.get(aux)+"--"+"---"+i+"||"+vetAux[i]+"\n");
            aux = quant +aux;
        }
        
        Insertion.insertionSort(vetAux);
        int j = 0;
        for(int i =0;i<4;i++){//pega os pivos
            vetPivos[i] = vetAux[j]; 
          //  System.out.print("\n__Pivos:"+vetPivos[i]+"\n"+i);
            j = j+2;
        }
    }
    /*
    Separa o vetor em subvetores. Usa sistema chave fechadura
    */
     private void parte2(List vetor,int vetPivos[]){
         for(int i = 0;i<vetor.size();i++){
             if((int)vetor.get(i)>vetPivos[3]){
                 while(chave1 == 3);
                chave3 = 1;
                vet3.add((int)vetor.get(i));
                chave3 = 0;
             }else
                 if((int)vetor.get(i)>vetPivos[2]){
                     while(chave1 == 2);
                    chave2 = 1;
                    vet2.add((int)vetor.get(i));
                    chave2 = 0;
                 }else
                     if((int)vetor.get(i)>vetPivos[1]){
                         while(chave1 == 1);
                        chave1 = 1;
                        vet1.add((int)vetor.get(i));
                        chave1 = 0;
                         
                     }else{
                         while(chave0==1);//ve se alguem esta modificando o vetor 0
                         chave0 = 1;//tranca o vetor 0
                         vet0.add((int)vetor.get(i));
                         chave0 = 0;//destraca o vetor 0
                     }
         }
     }
     private void theLastOne(List vetor){//junta os vetores
         vetor.clear();
         vetor.addAll(vet0);
         vetor.addAll(vet1);
         vetor.addAll(vet2);
         vetor.addAll(vet3);
         
     }
     private void puloDoGato(){
        new ImplementsVoadora(vet0);
        new ImplementsVoadora(vet1);
        new ImplementsVoadora(vet2);
        new ImplementsVoadora(vet3);
     }
     
    @Override
    public void run() {
        
    }
   
}
