/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author gabriel
 */
public class Circulo {
    private float raio;
    private double posicao[];
    private double area;
    
    public Circulo(float r,double poss[]){
        posicao = poss;
        raio = r;
    }
    public Circulo(float r){
        posicao = new double[2];
        posicao[0]=0;
        posicao[1]=0;
        raio = r;
    }
    public void Getterraio(){
        System.out.println(raio);
        System.out.println(posicao[0]);
        System.out.println(posicao[1]);
        
    }
    public void RaioUpDown(float newRaio){
        raio = newRaio;
    }
    public double Area(){
        area = Math.PI*raio*raio;
         
    return area;    
    }
    public void Move(double poss[]){
        posicao=poss;
        
    }
    
}
