/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author gabriel
 */
public class Pais {
    private String iso,nome;
    private double populacao,dimencao,densidade;
    
    public Pais(String iso,String nome,double populacao,double dimencao ){
        this.iso = iso;
        this.nome=nome;
        this.populacao=populacao;
        this.dimencao=dimencao;
    }
    public void getter(){
        System.out.println(nome);
        System.out.println(iso);
        System.out.println(populacao);
        System.out.println(dimencao);
        
    }
    public void SetterPais(String nome){
        this.nome = nome;
    }
    public void SetterIso(String iso){
        this.iso = iso;
    }
    public void SetterPop(double populacao){
        this.populacao=populacao;
    }
    public void SetterDim(double dimencao){
        this.dimencao=dimencao;
    }
    public double Densidade(){
        densidade = populacao/dimencao;
        return densidade;
    }
    
}
