
package e1l5;


public class Produto {
    protected String nome;
    protected float preco;
    
    public Produto(String nome,float preco){
        this.nome = nome;
        this.preco = preco;
    }
        @Override
    public String toString(){
       return "Nome:" + nome + " Preço:" + preco;
    }
}
