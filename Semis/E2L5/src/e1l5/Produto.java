
package e1l5;


public class Produto {
    protected String nome;
    protected float preco;
    private int codigoDeBarras;
    
    public Produto(String nome,float preco,int codigoDeBarras){
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }
        @Override
    public String toString(){
       return "Nome:" + nome + " Preço:" + preco;
    }
    
            
    public static boolean equals(Produto a,Produto b){
        if(a.codigoDeBarras == b.codigoDeBarras){
            return true;
        }else
            return false;
    }
    

}
