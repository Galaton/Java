/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s810e2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author gabriel
 */
public class Busca implements Runnable{

    private int inicio,fim;
    private int vetor[];
    private int x;
    private static int posicao = -1;
    
    private Busca(int inicio,int fim,int vetor[],int x){
        this.inicio = inicio;
        this.fim = fim;
        this.vetor = vetor;
        this.x = x;
    }
    public Busca(){}
    
    @Override
    public void run() {
        for(int i = inicio;i<fim;i++){
            if(vetor[i]== x){
                posicao = i;
                
                break;
            }else{
                if(posicao != -1 ){
                    break;
                }
            }
            
        }
        Thread.interrupted();
    }
    public static int busca(int x,int A[],int nThread){
        
        List<Busca> a = new ArrayList<>();
        int aux = 0, aux1 = 0,fatorDeIncremento = (A.length/nThread);       
        ExecutorService aa = Executors.newCachedThreadPool();
        
        for(int i = 0; i< nThread;i++){
            
            aux1 = aux1 + fatorDeIncremento;//tamanho final
            try{
            a.add(new Busca(aux,aux1,A,x));
            }catch(Exception e){
            e.printStackTrace();
        }
            aux = aux + fatorDeIncremento;//tamanho do inicio do prox
            
           try{
            aa.execute(a.get(i));
           }catch(Exception e){
               e.printStackTrace();
           }
        }
        aa.shutdown();
        return posicao;
    }
    
}
