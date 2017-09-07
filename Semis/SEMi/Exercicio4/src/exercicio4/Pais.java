/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author gabriel
 */
public class Pais {
    private String iso,nome;
    private double populacao,dimencao;
    
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
    
    
}
