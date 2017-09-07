/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

public class Vetor {
    
    private double vetor[];
    private String xx,yy;
   
    public Vetor(double x,double y){
        vetor = new double [2];
        vetor [0] = x;
        vetor [1] = y;
    }
    public Vetor(){
        vetor = new double[2];
        
        vetor [0] = 0;
        vetor [1] = 0;
    }
    
    public void Getter(){
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        
    }
    
    public void Setter(double x,double y){

        vetor [0] = x;
        vetor [1] = y;
    }
    
    public void Movimentacao(){
        vetor [0]++;
        vetor [1]++;
    }
    public void toSstring(){
        
       xx = Double.toString(vetor [0]);
       yy = Double.toString(vetor [1]);
        
       System.out.print(xx);
       System.out.print(yy);
       
    }
}