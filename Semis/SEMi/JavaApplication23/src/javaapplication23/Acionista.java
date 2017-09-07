/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author gabriel
 */
public class Acionista {
    private String cliente;
    private int numeroCota;
    private static float valorCota;
    
    public Acionista(String cliente,int numeroCota){
        this.cliente = cliente;
        this.numeroCota = numeroCota;
    }
    
    public Acionista(float valordaCota){
        valorCota = valordaCota;
    }
    public void Gett(){
        System.out.println(cliente);
        System.out.println(numeroCota);
        System.out.println(valorCota);
    }
    public void SettNumeroCota(int newcota){
        numeroCota= newcota;
    }
    public void SettValorCota(float newvalor){
        valorCota=newvalor;
    }
    public void ToSstring(Acionista objeto){
        System.out.println(objeto.toString());
    }
}
